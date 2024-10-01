package com.daniel.ms_traceability.infrastructure.input.rest;

import com.daniel.ms_traceability.application.dto.CreateTraceabilityRequest;
import com.daniel.ms_traceability.application.handler.ITraceabilityHandler;
import com.daniel.ms_traceability.domain.model.Traceability;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/traceability")
@RequiredArgsConstructor
public class TraceabilityController {

    private final ITraceabilityHandler traceabilityHandler;

    @PostMapping
    public ResponseEntity<Traceability> addTraceability(@RequestBody CreateTraceabilityRequest createTraceabilityRequest){
        Traceability savedTraceability = traceabilityHandler.saveTraceability(createTraceabilityRequest);
        return new ResponseEntity<>(savedTraceability, HttpStatus.CREATED);
    }

}
