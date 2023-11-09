package com.fthw.springevents.contract.rest;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.concurrent.CompletableFuture;

public interface EventPublisherResourceContract {

    @PostMapping("/events")
    void sendEvent(@RequestBody String message);

    @GetMapping("/async")
    CompletableFuture<String> asyncMethod();
}
