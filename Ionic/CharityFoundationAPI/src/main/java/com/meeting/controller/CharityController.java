package com.meeting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.meeting.model.Charity;
import com.meeting.repository.CharityRepository;

@CrossOrigin(origins = "http://localhost:8100")
@RestController
@RequestMapping(value="/rest")
public class CharityController {
	
	@Autowired
	 private CharityRepository charityRepository;
	 @RequestMapping(value = "/get-charity-trusts", method = RequestMethod.GET)
		public List<Charity> getCharityTrusts() {
			return charityRepository.findAll();// return a list of objects
		}
}
