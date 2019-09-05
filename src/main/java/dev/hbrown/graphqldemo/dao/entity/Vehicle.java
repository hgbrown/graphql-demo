package dev.hbrown.graphqldemo.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Vehicle implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ID", nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(name = "type", nullable = false)
  private String type;

  @Column(name = "model_code", nullable = false)
  private String modelCode;

  @Column(name = "brand_name")
  private String brandName;

  @Column(name = "launch_date")
  private LocalDate launchDate;

  public String getFormattedDate() {
    return getLaunchDate().toString();
  }
}
