package com.grpc.ums.configs;

import com.grpc.ums.endpoints.StudentGrpcImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class ServerConfig {
//    @Value("${grpc.server.port}")
//    private int port;

    @Bean
    public Server grpcServer(StudentGrpcImpl studentService) throws IOException {

        Server server = ServerBuilder.forPort(9091)
                .addService(studentService)
                .build();
        server.start();
        System.out.println("Server started at " + server.getPort());
        return server;
    }
}
