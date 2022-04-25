package com.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.model.Data;
import com.challenge.service.ChallengeService;

@RestController
@RequestMapping("/api/smaato")
public class ChallengeController {
	@Autowired
	ChallengeService challengeService;

	@RequestMapping(value="/accept", method=RequestMethod.GET)
	public List<Data> accept() {
	    return challengeService.getData();
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public Data createEmployee(@RequestBody Data data) {
	    return challengeService.createData(data);
	}

}



