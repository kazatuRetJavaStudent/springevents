package com.fthw.springevents.api.listener;

import com.fthw.springevents.api.event.TestEvent;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestEventListener implements ApplicationListener<TestEvent> {
    @Override
    public void onApplicationEvent(@NonNull TestEvent event) {
        log.info("Received spring test event: " + event);
    }
}
