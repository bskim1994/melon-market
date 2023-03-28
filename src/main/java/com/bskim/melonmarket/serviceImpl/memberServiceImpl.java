package com.bskim.melonmarket.serviceImpl;

import java.util.Optional;

import com.bskim.melonmarket.resource.entity.Member;

public interface memberServiceImpl {

	public Optional<Member> memberFindById(String id);
	
	public void insertMember(Member member);

}
