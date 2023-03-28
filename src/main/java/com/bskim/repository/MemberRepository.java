package com.bskim.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bskim.resource.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{
	
	public Optional<Member> memberFindById(String id);
	
	public void insertMember(Member member);
}
