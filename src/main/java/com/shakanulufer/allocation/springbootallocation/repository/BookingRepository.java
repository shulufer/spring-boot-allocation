package com.shakanulufer.allocation.springbootallocation.repository;



import org.springframework.data.repository.CrudRepository;

import com.shakanulufer.allocation.springbootallocation.entity.Booking;



public interface BookingRepository extends CrudRepository<Booking, Long> {

}
