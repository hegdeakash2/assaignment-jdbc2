package com.hotelapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelapp.model.Hotel;

public interface IHotelRepository extends JpaRepository<Hotel, Integer> {

}
