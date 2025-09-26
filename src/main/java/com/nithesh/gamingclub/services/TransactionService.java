
package com.nithesh.gamingclub.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nithesh.gamingclub.Dtos.PlayGameDto;
import com.nithesh.gamingclub.entities.Game;
import com.nithesh.gamingclub.entities.Member;
import com.nithesh.gamingclub.entities.Transaction;
import com.nithesh.gamingclub.repository.GameRepository;
import com.nithesh.gamingclub.repository.MemberRepository;
import com.nithesh.gamingclub.repository.TransactionRepository;

@Service

public class TransactionService {
	@Autowired TransactionRepository transactionrepository;
	@Autowired MemberRepository memberRepo;
	@Autowired GameRepository gameRepo;
	
	public Transaction playGame(PlayGameDto gameDto) {
		Member member = memberRepo.findById(gameDto.getMember_id()).get();
		Game game = gameRepo.findById(gameDto.getGame_id()).get();
		
		
		Transaction transaction = new Transaction();
		transaction.setMember(member);
		transaction.setGame(game);
		transaction.setAmount(game.getAmount());
		transaction.setDate(LocalDateTime.now());
		transactionrepository.save(transaction);
		
		member.setBalance(member.getBalance() - game.getAmount());
		memberRepo.save(member);
		
		return transaction;
	}
}
