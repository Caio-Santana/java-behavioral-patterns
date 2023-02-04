package com.caio.behavioralpatterns.chainofresponsibility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExampleDemo {

    private static final Logger logger = Logger.getLogger(LoggerExampleDemo.class.getName());

    public static void main(String[] args) {

        // level to log at
        logger.setLevel(Level.FINER);

        ConsoleHandler handler = new ConsoleHandler();

        // level to publish at
        handler.setLevel(Level.FINER);

        logger.addHandler(handler);

        logger.finest("Finest level of logging.");
        logger.finer("Finer level, but not as fine as finest.");
        logger.fine("Fine, but not as fine as finer or finest");
    }
}
