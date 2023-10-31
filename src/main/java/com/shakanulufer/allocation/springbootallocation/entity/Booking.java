package com.shakanulufer.allocation.springbootallocation.entity;

import java.time.LocalDate;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
public class Booking {

  private long id;

  private LocalDate startDate;

  private LocalDate EndDate;

  private LocalDate bookingDate;


}
