package org.example.repository;

import com.quantitymeasurement.entity.QuantityMeasurementEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuantityMeasurementRepository extends JpaRepository<QuantityMeasurementEntity, Long> {
	
}