package com.shakanulufer.allocation.springbootallocation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="user")
@Data
public class User {

  @Id
  private Long id;

  private String name;

  private String password;

  private String location;

}
