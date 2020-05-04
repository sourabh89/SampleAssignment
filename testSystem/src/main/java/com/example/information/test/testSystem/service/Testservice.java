package com.example.information.test.testSystem.service;

import com.example.information.test.testSystem.model.Test;

import java.util.Collection;
import java.util.List;
import java.util.Optional;



public interface Testservice {

	/**
	 * Method to create new test in the db using mongo-db repository.
	 * @param tst
	 */
	public void createTest(List<Test> tst);

	/**
	 * Method to fetch all test from the db using mongo-db repository.
	 * @return
	 */
	public Collection<Test> getAllTests();

	/**
	 * Method to fetch test by id using mongo-db repository.
	 * @param id
	 * @return
	 */
	public Optional<Test> findTestById(int id);

	/**
	 * Method to delete test by id using mongo-db repository.
	 * @param id
	 */
	public void deleteTestById(int id);

	/**
	 * Method to update test by id using mongo-db repository.
	 * @param tst
	 */
	public void updateTest(Test tst);

	/**
	 * Method to delete all test using mongo-db repository.
	 */
	public void deleteAllTests();
}