package com.grpc.ums.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStartupRunner implements CommandLineRunner {

    private final TableCreationService tableCreationService;

    public AppStartupRunner(TableCreationService tableCreationService) {
        this.tableCreationService = tableCreationService;
    }

    @Override
    public void run(String... args) throws Exception {
        tableCreationService.createTablesIfNotExist();
    }
}
