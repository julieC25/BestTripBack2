package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Hotel;

public interface IHotelService {
	List<Hotel> findAll();

	Hotel findOne(Long idLieu);

	Hotel save(Hotel hotel);

	void delete(Long idLieu);
	
	List<Hotel> findByNbEtoiles (int nbEtoiles);
}
