package com.fthw.springevents.api.listener;

import com.fthw.springevents.api.event.TestEvent;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AsyncTestEventListener implements ApplicationListener<TestEvent> {

    @Async
    @Override
    public void onApplicationEvent(@NonNull TestEvent event) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("Received spring test event: " + event);
    }
}
