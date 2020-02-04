package com.ecrc.security.apirest.service;

import java.util.List;

import com.ecrc.security.apirest.entity.Status;

public interface StatusService {

	public List<Status> findAll();

	public Status findById(long id);

	public Status save(Status status);

	public void deleteById(long id);

}
