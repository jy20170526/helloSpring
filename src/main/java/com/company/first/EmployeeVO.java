package com.company.first;

import java.io.Serializable;

public class EmployeeVO implements Serializable 
{
    private static final long serialVersionUID = 1L;
 
    private Integer id;
    private String firstName;
    private String lastName;
 
    //오른쪽클릭 -source - generate setters and getters
 
    public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
    public String toString() {
        return "EmployeeVO [id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + "]";
    }
}