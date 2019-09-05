package dev.hbrown.graphqldemo.dao.repository;

import dev.hbrown.graphqldemo.dao.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
