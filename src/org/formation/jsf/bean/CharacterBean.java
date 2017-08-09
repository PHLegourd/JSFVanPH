package org.formation.jsf.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="characterBean")
@SessionScoped
public class CharacterBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String firstName;
	private int age;
	private String country;
	private String flagUri;

	public CharacterBean() {
		reset();
	}

	public void reset() {

		this.name = "Smith";
		this.firstName = "John";
		this.age = 29;
		this.country = "Ireland";
		this.flagUri = "resources/img/" + this.country + ".jpg";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFlagUri() {
		return "resources/img/" + this.country + ".jpg";
	}

	public void setFlagUri(String flagUri) {
		this.flagUri = "resources/img/" + this.country + ".jpg";
	}
}
