package com.ecrc.security.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecrc.security.apirest.dao.StatusDAO;
import com.ecrc.security.apirest.entity.Status;

@Service
public class StatusServiceImpl implements StatusService {

	@Autowired
	private StatusDAO statusDAO;

	@Override
	public List<Status> findAll() {
		List<Status> listStatus = statusDAO.findAll();
		return listStatus;
	}

	@Override
	public Status findById(long id) {
		Status status = statusDAO.findById(id);
		return status;
	}

	@Override
	public Status save(Status status) {
		Status statusReturn = statusDAO.save(status);
		return statusReturn;
	}

	@Override
	public void deleteById(long id) {
		statusDAO.deleteById(id);
	}
}
