package com.mindtree.hotelmanagementmongodb.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Hotel")
public class Hotel {

	@Id
	private int hotelId;

	private String hotelName;

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(int hotelId, String hotelName) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

}
