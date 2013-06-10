package encoder;

import daoo.ioc.MsgEncoder;

import java.util.ServiceLoader;

/**
 * Created with IntelliJ IDEA.
 * User: Tatiana
 * Date: 17/05/13
 * Time: 16:16
 * To change this template use File | Settings | File Templates.
 */
public class MsgEncoderProvider {

    public static void printEncoders(){
        final ServiceLoader<MsgEncoder> loader = ServiceLoader.load(MsgEncoder.class);
        for (MsgEncoder msgEncoder : loader) {
            System.out.println(msgEncoder.getClass().getName());
        }

    }

    public static void main(String[] args) {
        MsgEncoderProvider.printEncoders();
    }

}
