package com.challenge.model;

import java.util.List;

public class DataResponse {
	
	private String status;
	private List<Data> data;
	
	public DataResponse() {
		
	}
	
	public DataResponse(String status, List<Data> data) {
		this.status = status;
		this.data = data;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}
	
}
