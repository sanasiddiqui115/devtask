package com.challenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.model.Data;
import com.challenge.repository.ChallengeRepository;

@Service
public class ChallengeService {
	
	@Autowired
    ChallengeRepository challengeRepository;
	
	//READ
	public List<Data> getData() {
	    return challengeRepository.findAll();
	}

}

