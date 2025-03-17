package com.bondtech.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class AccessTokenValidationController {
    @GetMapping(value = "/strings", produces = "text/event-stream")
    public Flux<String> getStringStream() {
        Flux<String> stringFlux =  Flux.interval(Duration.ofSeconds(1))
                .map(sequence -> "String " + sequence)
                .take(5); // Limits the stream to 5 elements
        return stringFlux.concatWith(Flux.just("validation successful"));
    }
}
