package com.meeting.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.meeting.model.Charity;
import com.meeting.repository.CharityRepository;
import com.meeting.repository.MeetingRepository;

@CrossOrigin(origins = "http://localhost:8100")
@RestController
@RequestMapping(value="/rest")
public class CharityController {
	
	@Autowired
	 private CharityRepository charityRepository;
	@Autowired
	private MeetingRepository meetingRepository;
	 @RequestMapping(value = "/get-charity-trusts", method = RequestMethod.GET)
		public List<Charity> getCharityTrusts() {
			return charityRepository.findAll();// return a list of objects
		}
	 
	 @RequestMapping(method=RequestMethod.POST,value="/charity-trust-create")
	 public Charity addTrust(@RequestBody Charity trust)
		{
//			trust.setName(new Charity(1,"Abcd","Education","Poverty"));
//			trust.setId(1);
//			trust.setName("Abcd");
//			trust.setCategory("Education");
//			trust.setCause("Poverty");
		 	Charity c=new Charity();
		 	c.setAmount(trust.getAmount());
		 	c.setCategory(trust.getCategory());
		 	c.setCharityname(trust.getCharityname());
		 	c.setCity(trust.getCity());
		 	c.setCountry(trust.getCountry());
		 	c.setDescription(trust.getDescription());
		 	c.setEmail(trust.getEmail());
		 	c.setId(trust.getId());
		 	c.setImage(trust.getImage());
		 	c.setLatitude(trust.getLatitude());
		 	c.setLongitude(trust.getLongitude());
		 	c.setSlogan(trust.getSlogan());
		 	c.setState(trust.getState());
		 	c.setUrl(trust.getUrl());
		 	c.setZipcode(trust.getZipcode());
//			charityservice.addTrust(c);
			charityRepository.save(c);
			return c;
		}
	 @RequestMapping(method=RequestMethod.GET,value="/charity-trust-category/{category}")
	 public List<Charity> searchTrust(@PathVariable String category)
	 {
		 List<Charity> charitytrusts = new ArrayList<>();
			meetingRepository.getTrustByCategory(category);
			return charitytrusts;
	 }
}
