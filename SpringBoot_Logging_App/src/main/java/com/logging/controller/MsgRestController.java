package com.logging.controller;

// Import the SLF4J Logger interface for logging messages
import org.slf4j.Logger;
// Import the SLF4J LoggerFactory to create Logger instances
import org.slf4j.LoggerFactory;
// Import the Spring annotation to map HTTP GET requests
import org.springframework.web.bind.annotation.GetMapping;
// Import the Spring annotation to define a REST controller
import org.springframework.web.bind.annotation.RestController;

// Annotate the class as a REST controller, so it can handle RESTful web requests
@RestController
public class MsgRestController {

    // Create a Logger instance for this class using SLF4J LoggerFactory
    // It helps log messages for debugging, monitoring, etc.
    private Logger logger = LoggerFactory.getLogger(MsgRestController.class);

    // Map HTTP GET requests to "/welcome" URL to this method
    @GetMapping("/welcome")
    public String welcomeMsg() {

        // Log an informational message indicating the method started executing
        logger.info("***** Welcome () Execution Started *****");

        // Define a simple message to return as a response
        String msg = "Inside Welcome Message Rest Controller";

        // Log an informational message indicating the method finished executing
        logger.info("***** Welcome () Execution Ended *****");

        // Return the message as an HTTP response
        return msg;
    }
    

}
