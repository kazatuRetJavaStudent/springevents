package com.fthw.springevents.api.listener;

import com.fthw.springevents.api.publisher.TestEventPublisher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestEventListenerTest {

    @Autowired
    private WebApplicationContext context;

    @BeforeEach
    void setUp() {
        MockMvcBuilders
                .webAppContextSetup(context)
                .build();
    }

    @Autowired
    private TestEventPublisher publisher;

    @Test
    void onApplicationEvent() {
        publisher.publishCustomEvent("MEssagew");
    }
}