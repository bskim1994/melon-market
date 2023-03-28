package com.bskim.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bskim.repository.MemberRepository;
import com.bskim.resource.entity.Member;
import com.bskim.serviceImpl.memberServiceImpl;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class memberService implements memberServiceImpl{
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Optional<Member> memberFindById(String id) {
		return memberRepository.memberFindById(id);
	}
	
	@Override
	public void insertMember(Member member) {
		memberRepository.insertMember(member);
	}
}
