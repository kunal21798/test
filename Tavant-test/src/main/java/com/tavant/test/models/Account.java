package com.tavant.test.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name="accounts")

public class Account implements Comparable<Account> {
	
	
	@Id
	//@NotBlank(message = "AccountId cannot be NULL")
	private Integer accId ; 
	private String accountType;
	private String lastName;
	private String firstName;
	@NotBlank(message= "Address should not be blank")
	@Size(max=50)
	private String address;
	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return 0;
	}
	



	
	
	
}
