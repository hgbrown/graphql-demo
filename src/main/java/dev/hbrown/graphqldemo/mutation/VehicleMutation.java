package dev.hbrown.graphqldemo.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import dev.hbrown.graphqldemo.dao.entity.Vehicle;
import dev.hbrown.graphqldemo.service.VehicleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@AllArgsConstructor
public class VehicleMutation implements GraphQLMutationResolver {

  private final VehicleService vehicleService;

  public Vehicle createVehicle(String type, String modelCode, String brandName, String launchDate) {
    return vehicleService.save(
            Vehicle.builder()
                    .type(type)
                    .modelCode(modelCode)
                    .brandName(brandName)
                    .launchDate(LocalDate.parse(launchDate))
                    .build()
    );
  }
}
