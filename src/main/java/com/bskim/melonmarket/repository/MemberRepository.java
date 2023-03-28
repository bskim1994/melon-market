package com.bskim.melonmarket.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bskim.melonmarket.resource.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{
	
	public Optional<Member> findById(String id);
	
//	public void insertMember(Member member);
}
