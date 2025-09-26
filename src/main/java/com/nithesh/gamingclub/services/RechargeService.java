package com.nithesh.gamingclub.services;


import java.time.LocalDateTime;
import java.util.Optional;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nithesh.gamingclub.Dtos.DoRechargeDto;
import com.nithesh.gamingclub.entities.Collection;
import com.nithesh.gamingclub.entities.Member;
import com.nithesh.gamingclub.entities.Recharge;
import com.nithesh.gamingclub.repository.CollectionRepository;
import com.nithesh.gamingclub.repository.MemberRepository;
import com.nithesh.gamingclub.repository.RechargeRepository;



@Service
public class RechargeService {
	@Autowired private RechargeRepository rechargeRepository;
	@Autowired private MemberRepository memberRepository;
	@Autowired private CollectionRepository collectionRepository;
	
	public Recharge doRecharge(DoRechargeDto rechargeDto) {
		Member member = memberRepository.findById(rechargeDto.getMember_id()).get();
		
		Recharge recharge = new Recharge();
		recharge.setMember(member);
		recharge.setDate_Time(LocalDateTime.now());
		recharge.setAmount(rechargeDto.getAmount());
		rechargeRepository.save(recharge);
		
		member.setBalance(rechargeDto.getAmount());
		memberRepository.save(member);
		
		Optional<Collection> collectOptional = collectionRepository.findCollectionByDate(LocalDate.now());
		if(collectOptional.isPresent()) {
			Collection collection = collectOptional.get();
			collection.setAmount(collection.getAmount() + rechargeDto.getAmount());
			collectionRepository.save(collection);
			
		}
		else {
			Collection collection = new Collection();
			collection.setDate(LocalDate.now());
			collection.setAmount(rechargeDto.getAmount());
			collectionRepository.save(collection);
		}
		return recharge;
	}

}