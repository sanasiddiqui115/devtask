package com.challenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException.InternalServerError;

import com.challenge.model.Data;
import com.challenge.model.DataResponse;
import com.challenge.repository.ChallengeRepository;

@Service
public class ChallengeService {
	
	@Autowired
    ChallengeRepository challengeRepository;
	
	//READ
	public DataResponse getData(Data data) {
		DataResponse dataResponse = new DataResponse();
		
		try{
			dataResponse.setStatus("OK");
			if(data.getEndpoint().isPresent() && !data.getEndpoint().isEmpty())
			{
				dataResponse.setData(challengeRepository.findAll());
			}
		} 
		catch(InternalServerError e) {
			dataResponse.setStatus("Failed");
		} 
		catch(InternalError e) {
			dataResponse.setStatus("Failed");
		} 
		catch(Exception e) {
			dataResponse.setStatus("Failed");
		}
	 return dataResponse;   
	}

	//CREATE
	public Data createData(Data data) {
	    return challengeRepository.save(data);
	}
}

