package com.daniel.ms_traceability.infrastructure.output.mongo.mapper;

import com.daniel.ms_traceability.domain.model.Traceability;
import com.daniel.ms_traceability.infrastructure.output.mongo.collection.TraceabilityCollection;

public interface ITraceabilityCollectionMapper {
    Traceability toModel(TraceabilityCollection traceabilityCollection);
    TraceabilityCollection toCollection(Traceability traceability);
}
