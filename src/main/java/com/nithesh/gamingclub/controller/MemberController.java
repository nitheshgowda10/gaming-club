package com.nithesh.gamingclub.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nithesh.gamingclub.Dtos.MembershipDto;
import com.nithesh.gamingclub.entities.Member;
import com.nithesh.gamingclub.services.MemberService;

@RestController
@RequestMapping("/member")

public class MemberController {
	@Autowired MemberService memberService;
	
	@PostMapping("/create")
	public Member membership(@RequestBody MembershipDto memberDto) {
		return memberService.createMembership(memberDto);
	}
	@PostMapping("/all")
	public List<Member> getAllMember(){
		return memberService.getAllMember();
		
	}
	@GetMapping("/search/{phone}")
	public Map<String, Object> search(@PathVariable String phone){
		return memberService.searchMember(phone);	}
}
