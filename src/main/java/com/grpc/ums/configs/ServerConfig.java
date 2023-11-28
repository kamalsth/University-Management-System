package com.grpc.ums.configs;

import com.grpc.ums.services.UniversityImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class ServerConfig {
    @Value("${grpc.server.port}")
    public final int port = 9090;

    @Bean
    public Server grpcServer(UniversityImpl university) throws IOException {

        Server server = ServerBuilder.forPort(port)
                .addService(university)
                .build();
        server.start();
        System.out.println("Server started at " + server.getPort());
        return server;
    }
}
