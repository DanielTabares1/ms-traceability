package com.daniel.ms_traceability.infrastructure.config;

import com.daniel.ms_traceability.application.handler.TraceabilityHandler;
import com.daniel.ms_traceability.domain.api.ITraceabilityServicePort;
import com.daniel.ms_traceability.domain.spi.ITraceabilityPersistencePort;
import com.daniel.ms_traceability.domain.usecase.TraceabilityUseCase;
import com.daniel.ms_traceability.infrastructure.output.mongo.adapter.TraceabilityMongoAdapter;
import com.daniel.ms_traceability.infrastructure.output.mongo.mapper.ITraceabilityCollectionMapper;
import com.daniel.ms_traceability.infrastructure.output.mongo.repository.TraceabilityRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfig {

    private final ITraceabilityCollectionMapper traceabilityCollectionMapper;
    private final TraceabilityRespository traceabilityRespository;


    @Bean
    public ITraceabilityPersistencePort traceabilityPersistencePort() {
        return new TraceabilityMongoAdapter(traceabilityCollectionMapper, traceabilityRespository);
    }

    @Bean
    public ITraceabilityServicePort traceabilityServicePort() {
        return new TraceabilityUseCase(traceabilityPersistencePort());
    }


}
