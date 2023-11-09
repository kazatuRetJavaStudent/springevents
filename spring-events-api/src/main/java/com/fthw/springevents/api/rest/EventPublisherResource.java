package com.fthw.springevents.api.rest;

import com.fthw.springevents.api.publisher.TestEventPublisher;
import com.fthw.springevents.api.service.AsyncService;
import com.fthw.springevents.contract.rest.EventPublisherResourceContract;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RequiredArgsConstructor
@RestController
public class EventPublisherResource implements EventPublisherResourceContract {

    private final TestEventPublisher eventPublisher;

    private final AsyncService asyncService;

    @Override
    public void sendEvent(String message) {
        this.eventPublisher.publishCustomEvent(message);
    }

    @Override
    public CompletableFuture<String> asyncMethod() {
        return asyncService.asyncMethod("Completed");
    }
}
