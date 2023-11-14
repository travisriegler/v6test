package com.travisriegler.v1api.v6test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class HealthCheckController {

    private final String instanceUuid = UUID.randomUUID().toString();

    @GetMapping("/healthcheck")
    public ResponseEntity<String> checkHealth() {
        return ResponseEntity.ok("I'm doing a test. healthy, instance-uuid: " + instanceUuid);
    }
}

