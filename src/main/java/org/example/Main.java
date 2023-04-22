package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

public class Main {
    public static Logger logger = LoggerFactory.getLogger(Main.class);

    @PostConstruct
    public void init() {
        logger.info("Application started...");
    }

    public static void main(String[] args) {
        logger.info("Application started...");
        System.out.println("Hello world!");
    }
}