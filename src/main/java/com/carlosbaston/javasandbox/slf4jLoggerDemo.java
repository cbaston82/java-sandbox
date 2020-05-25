package com.carlosbaston.javasandbox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class slf4jLoggerDemo {

    public static void main(String[] args) {

        Logger logger =
                LoggerFactory.getLogger(JavaSandboxApplication.class);

        logger.info("INFO ===============================================");
        logger.debug("DEBUG =============================================");

        int numberOfErrors = 5;
        logger.info("There are {} errors", numberOfErrors);
    }
}
