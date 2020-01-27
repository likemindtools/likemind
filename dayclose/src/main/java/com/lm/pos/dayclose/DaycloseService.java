package com.lm.pos.dayclose;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaycloseService {

	@Autowired
	private DaycloseRepository daycloseRepository;
	
	
	public List<Dayclose> getAllDayclose(){
		List<Dayclose> dayclose = new ArrayList();
		daycloseRepository.findAll()
		.forEach(dayclose::add);
		return dayclose;
	}
	
	public Dayclose getDayclose(Integer id){	
		return daycloseRepository.findById(id).get();
	}
	
	public void addDayclose(Dayclose dayclose){
		daycloseRepository.save(dayclose);
	}
	
	public void updateDayclose(Integer id, Dayclose dayclose){
		daycloseRepository.save(dayclose);
	}
	
	public String deleteDayclose(Integer id){
		daycloseRepository.deleteById(id);
		return "Record Deleted: "+id;
	}
}
