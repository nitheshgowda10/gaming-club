package com.nithesh.gamingclub.entities;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "members")
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private float balance=0;
	private String phone;
	@JsonIgnore
	@OneToMany(mappedBy = "member")
	List<Recharge> recharge;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Recharge> getRecharge() {
		return recharge;
	}

	public void setRecharge(List<Recharge> recharge) {
		this.recharge = recharge;
	}

}