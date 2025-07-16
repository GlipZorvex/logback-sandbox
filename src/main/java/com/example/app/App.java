package com.example.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        logger.trace("Entering method foo()");
        logger.debug("Received request from 198.12.34.56");
        logger.info("User logged in: john");
        logger.warn("Connection to server lost. Retrying...");
        logger.error("Failed to write data to file: myFile.txt");
    }
}
