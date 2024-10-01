package com.daniel.ms_traceability.infrastructure.output.mongo.adapter;

import com.daniel.ms_traceability.domain.model.Traceability;
import com.daniel.ms_traceability.domain.spi.ITraceabilityPersistencePort;
import com.daniel.ms_traceability.infrastructure.output.mongo.collection.TraceabilityCollection;
import com.daniel.ms_traceability.infrastructure.output.mongo.mapper.ITraceabilityCollectionMapper;
import com.daniel.ms_traceability.infrastructure.output.mongo.repository.TraceabilityRespository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TraceabilityMongoAdapter implements ITraceabilityPersistencePort {

    private final ITraceabilityCollectionMapper traceabilityCollectionMapper;
    private final TraceabilityRespository traceabilityRespository;


    @Override
    public Traceability addTraceability(Traceability traceability) {
        TraceabilityCollection traceabilityCollection = traceabilityCollectionMapper.toCollection(traceability);
        TraceabilityCollection savedTraceability = traceabilityRespository.save(traceabilityCollection);
        return traceabilityCollectionMapper.toModel(savedTraceability);
    }
}
