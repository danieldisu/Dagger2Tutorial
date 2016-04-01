package com.danieldisu.dagger2intro;


import javax.inject.Inject;

public class RestClient {

    @Inject
    Logger logger;

    public RestClient() {

    }

    public void simulateNetworkCall(){
        // do something
        logger.log("simulatingNetworkCall");
    }
}
