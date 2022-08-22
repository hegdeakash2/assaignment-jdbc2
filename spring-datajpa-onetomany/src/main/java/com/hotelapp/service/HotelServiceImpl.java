package com.hotelapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.model.Hotel;
import com.hotelapp.repository.IHotelRepository;

import net.bytebuddy.asm.Advice.Return;
@Service
public class HotelServiceImpl implements IHotelService {
	IHotelRepository hotelRepository;
	
	

@Autowired
	public void setHotelRepository(IHotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}

	@Override
	public Hotel addHotel(Hotel hotel) {
	return 	hotelRepository.save(hotel);
		
		
	}

	@Override
	public void updateHotel(Hotel hotel) {
		hotelRepository.save(hotel);
	}

	@Override
	public void deleteHotel(int hotelId) {
		hotelRepository.deleteById(hotelId);
	}

	@Override
	public List<Hotel> getAll() {
		return hotelRepository.findAll();
		
	}

	@Override
	public Hotel getById(int hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getByrating(double rating) {
		// TODO Auto-generated method stub
		return null;
	}

}
