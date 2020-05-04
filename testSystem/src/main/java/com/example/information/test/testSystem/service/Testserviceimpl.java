package com.example.information.test.testSystem.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.example.information.test.testSystem.dao.Testdao;
import com.example.information.test.testSystem.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class Testserviceimpl implements Testservice {

	// The dao repository will use the Mongodb-Repository to perform the database operations.
	@Autowired
	Testdao dao;

	/* (non-Javadoc)
	 * @see com.assignment.springboot.mongo.service.Testservice#createTest(java.util.List)
	 */
	@Override
	public void createTest(List<Test> tst) {
		dao.saveAll(tst);
	}

	/* (non-Javadoc)
	 * @see com.assignment.springboot.mongo.service.Testservice#getAllTests()
	 */
	@Override
	public Collection<Test> getAllTests() {
		return dao.findAll();
	}

	/* (non-Javadoc)
	 * @see com.assignment.springboot.mongo.service.Testservice#findTestById(int)
	 */
	@Override
	public Optional<Test> findTestById(int id) {
		return dao.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.assignment.springboot.mongo.service.Testservice#deleteTestById(int)
	 */
	@Override
	public void deleteTestById(int id) {
		dao.deleteById(id);
	}

	/* (non-Javadoc)
	 * @see com.assignment.springboot.mongo.service.Testservice#updateTest(int)
	 */
	@Override
	public void updateTest(Test tst) {
		dao.save(tst);
	}

	/* (non-Javadoc)
	 * @see com.assignment.springboot.mongo.service.Testservice#deleteAllTests()
	 */
	@Override
	public void deleteAllTests() {
		dao.deleteAll();
	}
}