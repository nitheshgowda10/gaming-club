package com.nithesh.gamingclub.entities;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "recharges")
public class Recharge {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "member_id")
private Member member;
private float amount;
private LocalDateTime date_Time;



public Recharge(Member member, float amount, LocalDateTime date_Time) {
	super();
	this.member = member;
	this.amount = amount;
	this.date_Time = date_Time;
}


public LocalDateTime getDate_Time() {
	return date_Time;
}


public void setDate_Time(LocalDateTime date_Time) {
	this.date_Time = date_Time;
}


public Recharge() {}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Member getMember() {
	return member;
}
public void setMember(Member member) {
	this.member = member;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}

}
