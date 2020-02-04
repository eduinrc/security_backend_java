package com.ecrc.security.apirest.dao;

import java.util.List;

import com.ecrc.security.apirest.entity.Status;

public interface StatusDAO {
	
	public List<Status> findAll();
	
	public Status findById(long id);
	
	public Status save(Status status);
	
	public void deleteById(long id);
}
