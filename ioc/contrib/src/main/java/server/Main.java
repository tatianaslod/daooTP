package server;

import daoo.ioc.TaskServer;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        final TaskServer server = new DaooTaskServer();
        server.start(new PoolThreadTaskExecutor2(), 8080);
    }
}
