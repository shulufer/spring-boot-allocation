package com.shakanulufer.allocation.springbootallocation.entity;

import java.math.BigDecimal;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
public class Product {

  private long id;

  private String name;

  private String description;

  private BigDecimal price;

}
