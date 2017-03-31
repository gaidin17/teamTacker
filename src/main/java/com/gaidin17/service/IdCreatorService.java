package com.gaidin17.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Evgeny_Akulenko on 2/10/2017.
 */
@Component
public class IdCreatorService {
    private static volatile AtomicInteger clientId ;

    @Autowired
    public IdCreatorService() {
        clientId = new AtomicInteger(0);
    }

    public static int generateId() {
        int id = clientId.getAndIncrement();
        return id;
    }

    public static int getClientId() {
        return clientId.get();
    }
}
