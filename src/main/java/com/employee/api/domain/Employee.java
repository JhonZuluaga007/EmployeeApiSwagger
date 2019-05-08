package com.employee.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employees")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode
@ApiModel(description = "All details about the Employee. ")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "The database generated employee ID")
	private long id;
	
	@Column(name = "first_name", nullable = false)
	@ApiModelProperty(notes = "The employee first name")
	private String firstName;
	
	@Column(name = "last_name", nullable = false)
	@ApiModelProperty(notes = "The employee last name")
	private String lastName;
	
	@Column(name = "email_address", nullable = false)
	@ApiModelProperty(notes = "The employee email id")
	private String emailId;
	
	
}
