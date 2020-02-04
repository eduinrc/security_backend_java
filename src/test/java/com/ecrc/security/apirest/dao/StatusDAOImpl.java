package com.ecrc.security.apirest.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecrc.security.apirest.entity.Status;

@Repository
public class StatusDAOImpl implements StatusDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Status> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);

		Query<Status> theQuery = currentSession.createQuery("from Status", Status.class);

		List<Status> status = theQuery.getResultList();

		return status;
	}

	@Override
	public Status findById(long id) {
		Session currentSession = entityManager.unwrap(Session.class);

		Status status = currentSession.get(Status.class, id);

		return status;
	}

	@Override
	public Status save(Status status) {
		Session currentSession = entityManager.unwrap(Session.class);

		currentSession.saveOrUpdate(status);

		return findById(status.getId());
	}

	@Override
	public void deleteById(long id) {
		Session currentSession = entityManager.unwrap(Session.class);

		Query<Status> theQuery = currentSession.createQuery("delete from User where id=:idStatus");

		theQuery.setParameter("idStatus", id);
		theQuery.executeUpdate();

	}

}
