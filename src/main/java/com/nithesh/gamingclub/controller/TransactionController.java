package com.nithesh.gamingclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nithesh.gamingclub.Dtos.PlayGameDto;
import com.nithesh.gamingclub.entities.Transaction;
import com.nithesh.gamingclub.services.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	@Autowired TransactionService transactionService;
	@PostMapping("/play")
	public Transaction playGame(@RequestBody PlayGameDto gameDto) {
		return transactionService.playGame(gameDto);
	}
	
	
}
