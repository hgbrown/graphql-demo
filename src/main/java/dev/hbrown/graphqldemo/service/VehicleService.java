package dev.hbrown.graphqldemo.service;

import dev.hbrown.graphqldemo.dao.entity.Vehicle;
import dev.hbrown.graphqldemo.dao.repository.VehicleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class VehicleService {

  private final VehicleRepository vehicleRepository;

  @Transactional(readOnly = true)
  public List<Vehicle> getAllVehicles(int count) {
    return vehicleRepository.findAll().stream().limit(count).collect(Collectors.toList());
  }

  @Transactional(readOnly = true)
  public Optional<Vehicle> getVehicle(Integer id) {
    return vehicleRepository.findById(id);
  }

  @Transactional
  public Vehicle save(Vehicle vehicle) {
    return vehicleRepository.save(vehicle);
  }
}
