package com.ecrc.security.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecrc.security.apirest.entity.Status;
import com.ecrc.security.apirest.service.StatusService;

@RestController
@RequestMapping("/security")
public class StatusRestController {

	@Autowired
	private StatusService statusService;

	@GetMapping("/status")
	public List<Status> findAll() {
		return statusService.findAll();
	}

	@GetMapping("/status/{statusId}")
	public Status getUser(@PathVariable int statusId) {
		Status status = statusService.findById(statusId);

		if (status == null) {
			throw new RuntimeException("User id not found -" + statusId);
		}

		return status;
	}

	@PostMapping("/status")
	public Status addStatus(@RequestBody Status status) {

		statusService.save(status);

		return status;

	}
}
