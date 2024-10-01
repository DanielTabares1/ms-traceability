package com.daniel.ms_traceability.infrastructure.output.mongo.repository;

import com.daniel.ms_traceability.infrastructure.output.mongo.collection.TraceabilityCollection;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TraceabilityRespository extends MongoRepository<TraceabilityCollection, Long> {
    List<TraceabilityCollection> findByOrderId(long orderId);

}
