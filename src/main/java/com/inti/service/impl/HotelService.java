package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Hotel;
import com.inti.repositories.HotelRepository;
import com.inti.service.interfaces.IHotelService;

@Service
public class HotelService implements IHotelService {
	@Autowired
	HotelRepository hotelRepository;
	
	@Override
	public List<Hotel> findAll() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel findOne(Long idLieu) {
		return hotelRepository.findById(idLieu).get();
	}

	@Override
	public Hotel save(Hotel hotel) {
		return hotelRepository.save(hotel);
	}

	@Override
	public void delete(Long idLieu) {
		hotelRepository.deleteById(idLieu);
		
	}

	@Override
	public List<Hotel> findByNbEtoiles(int nbEtoiles) {
		return hotelRepository.findByNbEtoiles(nbEtoiles);
	}

}
