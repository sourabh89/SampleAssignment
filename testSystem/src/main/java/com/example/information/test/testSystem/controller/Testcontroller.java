package com.example.information.test.testSystem.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.example.information.test.testSystem.model.Test;
import com.example.information.test.testSystem.service.Testservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value= "/api/mongo/test")
public class Testcontroller {

	@Autowired
	Testservice serv;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * Method to save tests in the db.
	 * @param tst
	 * @return
	 */
	@PostMapping(value= "/incoming")
	public String create(@RequestBody List<Test> tst) {
		System.out.println("sss");
		logger.debug("Saving data.");
		serv.createTest(tst);
		return "records created.";
	}

	/**
	 * Method to fetch all tests from the db.
	 * @return
	 */
	@GetMapping(value= "/getall")
	public Collection<Test> getAll() {
		logger.debug("Getting all data.");
		return serv.getAllTests();
	}

	/**
	 * Method to fetch test by id.
	 * @param id
	 * @return
	 */
	@GetMapping(value= "/getbyid/{test-id}")
	public Optional<Test> getById(@PathVariable(value= "test-id") int id) {
		logger.debug("Getting test data with id= {}.", id);
		return serv.findTestById(id);
	}

	/**
	 * Method to update test by id.
	 * @param id
	 * @param e
	 * @return
	 */
	@PutMapping(value= "/update/{test-id}")
	public String update(@PathVariable(value= "test-id") int id, @RequestBody Test e) {
		logger.debug("Updating test data with test-id= {}.", id);
		e.setId(id);
		serv.updateTest(e);
		return "test record for test-id= " + id + " updated.";
	}

	/**
	 * Method to delete test by id.
	 * @param id
	 * @return
	 */
	@DeleteMapping(value= "/delete/{test-id}")
	public String delete(@PathVariable(value= "test-id") int id) {
		logger.debug("Deleting test with test-id= {}.", id);
		serv.deleteTestById(id);
		return "test record for test-id= " + id + " deleted.";
	}

	/**
	 * Method to delete all tests from the db.
	 * @return
	 */
	@DeleteMapping(value= "/deleteall")
	public String deleteAll() {
		logger.debug("Deleting all test data.");
		serv.deleteAllTests();
		return "All test records deleted.";
	}
}