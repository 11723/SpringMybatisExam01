package com.zc.pojo;

import java.util.Date;

public class country {
private int country_id;
private String country;
private Date last_update;
public int getCountry_id() {
	return country_id;
}
public void setCountry_id(int country_id) {
	this.country_id = country_id;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public Date getLast_update() {
	return last_update;
}
public void setLast_update(Date last_update) {
	this.last_update = last_update;
}
public country(int country_id, String country, Date last_update) {
	super();
	this.country_id = country_id;
	this.country = country;
	this.last_update = last_update;
}
public country() {
	super();
}
@Override
public String toString() {
	return "country [country_id=" + country_id + ", country=" + country
			+ ", last_update=" + last_update + "]";
}


}
