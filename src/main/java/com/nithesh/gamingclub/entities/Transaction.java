package com.nithesh.gamingclub.entities;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "transactions")

public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "member_id")
	private Member member;
	
	@ManyToOne
	@JoinColumn(name = "game_id")
	private Game game;
	
	private float amount;
	
	private LocalDateTime date;

	public Transaction() {}
	public Transaction(Member member, Game game, float amount, LocalDateTime date) {
		super();
		this.member = member;
		this.game = game;
		this.amount = amount;
		this.date = date;
	}

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

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}
}
