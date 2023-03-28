package com.bskim.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bskim.service.memberService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MemberController {

	@Autowired
	private memberService memberService;
	
	@GetMapping(path = "test")
	public String test() {
		return "test";
	}
	
 	@RequestMapping(path = "/api/member", method = RequestMethod.GET)
	public Map<String, Object> selectMemberById() {
		Map<String, Object> result = new HashMap<>();
		
//		Optional<Member> findMember = memberService.memberFindById(id);
//		if(findMember.isPresent()) {
//			result.put("result", "success");
//			result.put("data", findMember.get());
//		}else {
//			result.put("result", "fail");
//		}
		return result;
	}
}
