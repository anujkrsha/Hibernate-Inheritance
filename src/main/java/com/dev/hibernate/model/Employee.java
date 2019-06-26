package com.dev.hibernate.model;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
@PrimaryKeyJoinColumn(name="PERSON_ID")
/*@AttributeOverrides({
    @AttributeOverride(name="firstname", column=@Column(name="FIRSTNAME")),
    @AttributeOverride(name="lastname", column=@Column(name="LASTNAME"))
})*/
// @Table(name="PERSON")
// @DiscriminatorValue(value="E")
public class Employee extends Person {

	@Column(name = "joining_date")
	private Date joiningDate;

	@Column(name = "department_name")
	private String departmentName;

	public Employee() {

	}

	public Employee(Date joiningDate, String departmentName) {
		super();
		this.joiningDate = joiningDate;
		this.departmentName = departmentName;
	}

	public Employee(String firstname, String lastname, String departmentName, Date joiningDate) {
		super(firstname, lastname);
		this.joiningDate = joiningDate;
		this.departmentName = departmentName;

	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
