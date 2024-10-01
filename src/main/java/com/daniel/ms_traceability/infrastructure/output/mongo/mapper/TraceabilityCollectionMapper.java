package com.daniel.ms_traceability.infrastructure.output.mongo.mapper;

import com.daniel.ms_traceability.domain.model.Traceability;
import com.daniel.ms_traceability.infrastructure.output.mongo.collection.TraceabilityCollection;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

@Component
public class TraceabilityCollectionMapper implements ITraceabilityCollectionMapper {
    @Override
    public Traceability toModel(TraceabilityCollection collection) {
        Traceability traceability = new Traceability();

        traceability.setId(collection.getId().toHexString());
        traceability.setOrderId(collection.getOrderId());
        traceability.setClientId(collection.getClientId());
        traceability.setClientEmail(collection.getClientEmail());
        traceability.setDate(collection.getDate());
        traceability.setPreviousState(collection.getPreviousState());
        traceability.setNewState(collection.getNewState());
        traceability.setEmployeeId(collection.getEmployeeId());
        traceability.setEmployeeEmail(collection.getEmployeeEmail());

        return traceability;
    }

    @Override
    public TraceabilityCollection toCollection(Traceability model) {
        TraceabilityCollection collection = new TraceabilityCollection();

        if (model.getId() != null) {
            collection.setId(new ObjectId(model.getId()));
        }
        collection.setOrderId(model.getOrderId());
        collection.setClientId(model.getClientId());
        collection.setClientEmail(model.getClientEmail());
        collection.setDate(model.getDate());
        collection.setPreviousState(model.getPreviousState());
        collection.setNewState(model.getNewState());
        collection.setEmployeeId(model.getEmployeeId());
        collection.setEmployeeEmail(model.getEmployeeEmail());

        return collection;
    }
}
