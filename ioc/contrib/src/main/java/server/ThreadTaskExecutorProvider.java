package server;

import daoo.ioc.TaskExecutor;

import java.util.ServiceLoader;

/**
 * Created with IntelliJ IDEA.
 * User: Tatiana
 * Date: 07/06/13
 * Time: 10:52
 * To change this template use File | Settings | File Templates.
 */
public class ThreadTaskExecutorProvider {

    public static void printEncoders(){
        final ServiceLoader<TaskExecutor> loader = ServiceLoader.load(TaskExecutor.class);
        for (TaskExecutor taskExecutor : loader) {
            System.out.println(taskExecutor.getClass().getName());
        }
    }

    public static void main(String[] args) {
        ThreadTaskExecutorProvider.printEncoders();
    }
}
