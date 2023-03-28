package com.bskim.melonmarket.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bskim.melonmarket.resource.entity.Member;
import com.bskim.melonmarket.service.memberService;

@RestController
public class MemberController {

	@Autowired
	private memberService memberService;
	
	@GetMapping(path = "/test")
	public String test() {
		return "test";
	}
	
 	@RequestMapping(path = "/api/member/{id}", method = RequestMethod.GET)
	public String selectMemberById(@PathVariable String id) {
		Map<String, Object> result = new HashMap<>();
		System.out.println("test");
		Optional<Member> findMember = memberService.memberFindById(id);
		if(findMember.isPresent()) {
			result.put("result", "success");
			result.put("data", findMember.get());
		}else {
			result.put("result", "fail");
		}
		return "success";
	}
}
