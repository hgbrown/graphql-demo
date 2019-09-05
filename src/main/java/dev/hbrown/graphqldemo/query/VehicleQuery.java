package dev.hbrown.graphqldemo.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import dev.hbrown.graphqldemo.dao.entity.Vehicle;
import dev.hbrown.graphqldemo.service.VehicleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class VehicleQuery implements GraphQLQueryResolver {

  private final VehicleService vehicleService;

  public List<Vehicle> getVehicles(int count) {
    return vehicleService.getAllVehicles(count);
  }

  public Optional<Vehicle> getVehicle(Integer id) {
    return vehicleService.getVehicle(id);
  }

}
