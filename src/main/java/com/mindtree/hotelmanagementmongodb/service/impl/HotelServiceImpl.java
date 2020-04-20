package com.mindtree.hotelmanagementmongodb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.hotelmanagementmongodb.mongo.Hotel;
import com.mindtree.hotelmanagementmongodb.repository.HotelRepo;
import com.mindtree.hotelmanagementmongodb.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	HotelRepo hotelRepo;

	@Override
	public Hotel addHotel(Hotel hotel) {

		Hotel existing = hotelRepo.findHotelByHotelName(hotel.getHotelName());

		if (existing == null) {
			Hotel savedHotel = hotelRepo.save(hotel);
			return savedHotel;
		} else {
			existing = hotel;
			return existing;
		}
	}

	@Override
	public List<Hotel> getAllHotels() {
		List<Hotel> allHotels = hotelRepo.findAll();

		return allHotels;
	}

}
