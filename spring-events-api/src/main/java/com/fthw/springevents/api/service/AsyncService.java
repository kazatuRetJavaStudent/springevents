package com.fthw.springevents.api.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService {

    @Async
    public CompletableFuture<String> asyncMethod(String message) {
        return CompletableFuture.completedFuture(message);
    }
}
