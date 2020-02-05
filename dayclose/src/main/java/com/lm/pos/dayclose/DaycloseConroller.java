package com.lm.pos.dayclose;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/dayclose")
public class DaycloseConroller {

	@Autowired
	private DaycloseService daycloseService;
	@Autowired
	RestTemplate rest;
	
	@RequestMapping("/")
	public List<Dayclose> getAllDayclose(){
		return daycloseService.getAllDayclose();
	}
	
	@RequestMapping("/{id}")
	public Dayclose getDayclose(@PathVariable Integer id){
		return daycloseService.getDayclose(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/")
	public void addDayclose(@RequestBody Dayclose dayclose){
		daycloseService.addDayclose(dayclose);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/{id}")
	public void updateDayclose(@PathVariable Integer id,@RequestBody Dayclose dayclose){
		daycloseService.updateDayclose(id,dayclose);
	}

	@RequestMapping(method=RequestMethod.DELETE,value="/{id}")
	public String deleteDayclose(@PathVariable Integer id){
		return daycloseService.deleteDayclose(id);
	}
	
	@RequestMapping("/rest/{id}")
	public Dayclose callRestAPIbyId(@PathVariable Integer id) {
		Dayclose dc=rest.getForObject("http://localhost:8500/dayclose/"+id, Dayclose.class);
		System.out.println(dc.toString());
		return dc;
	}
	
	@RequestMapping("/rest/")
	public List<Dayclose> callRestAPI() {
		ResponseEntity<Dayclose[]> re =rest.getForEntity("http://localhost:8500/dayclose/", Dayclose[].class);
		List<Dayclose> daycloseList = Arrays.asList(re.getBody());
		return daycloseList;
	}
}
