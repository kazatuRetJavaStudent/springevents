package com.fthw.springevents.api.publisher;

import com.fthw.springevents.api.event.TestEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class TestEventPublisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    public void publishCustomEvent(final String message) {
        log.info("Publishing custom event");

        TestEvent testEvent = new TestEvent(this, message);

        applicationEventPublisher.publishEvent(testEvent);
    }
}
