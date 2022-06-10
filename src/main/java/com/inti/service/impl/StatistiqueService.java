package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.PointStatistique;
import com.inti.entities.Statistique;
import com.inti.repositories.StatistiqueRepository;
import com.inti.service.interfaces.IPointStatistiqueService;
import com.inti.service.interfaces.IStatistiqueService;

@Service
public class StatistiqueService implements IStatistiqueService{
	@Autowired
	StatistiqueRepository statistiqueRepository;
	@Autowired
	IPointStatistiqueService pointStatistiqueService;
	
	@Override
	public List<Statistique> findAll() {
		return statistiqueRepository.findAll();
	}

	@Override
	public Statistique findOne(Long id) {
		return statistiqueRepository.findById(id).get();
	}

	@Override
	public Statistique save(Statistique statistique) {
		return statistiqueRepository.save(statistique);
		
	}

	@Override
	public void delete(Long id) {
		statistiqueRepository.deleteById(id);
		
	}
	
	@Override
	public Statistique generateStatistique(Statistique statistique, String[] valeursX, float[] valeursY) {
		int i;
		PointStatistique pointStatistique = new PointStatistique();
		pointStatistique.setStatistique(statistique);
		for(i=0;i<valeursX.length;i++) {
			pointStatistique.setValeurX(valeursX[i]); 
			pointStatistique.setValeurY(valeursY[i]);
			statistique.addOnePointStatistique(pointStatistique);
			pointStatistiqueService.save(pointStatistique);
		}
		return statistiqueRepository.save(statistique);
	}

}
