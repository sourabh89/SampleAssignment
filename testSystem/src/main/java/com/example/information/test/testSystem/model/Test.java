package com.example.information.test.testSystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// Mongo database annotation.
@Document(collection= "test")
public class Test {

	@Id
	private int id;
	private int[] numberMeetNumbers;
	private String duplicateCharacters;
	private String whiteSpace;

	public Test() {	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int[] getNumberMeetNumbers() {
		return numberMeetNumbers;
	}

	public void setNumberMeetNumbers(int[] numberMeetNumbers) {
		this.numberMeetNumbers = numberMeetNumbers;
	}

	public String getDuplicateCharacters() {
		return duplicateCharacters;
	}

	public void setDuplicateCharacters(String duplicateCharacters) {
		this.duplicateCharacters = duplicateCharacters;
	}

	public String getWhiteSpace() {
		return whiteSpace;
	}

	public void setWhiteSpace(String whiteSpace) {
		this.whiteSpace = whiteSpace;
	}

	@Override
	public String toString() {
		return "Test{" +
				"id=" + id +
				", numberMeetNumbers=" + numberMeetNumbers +
				", duplicateCharacters='" + duplicateCharacters + '\'' +
				", whiteSpace='" + whiteSpace + '\'' +
				'}';
	}
}