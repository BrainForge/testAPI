package com.testres.rest.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by Anton Afanasyeu on 17.03.16.
 */
@Service
public class GetTempTask {

    @Scheduled(fixedRate=5000)
    public void printMessage() {
        System.out.println("I am called by Spring scheduler");
    }
}
