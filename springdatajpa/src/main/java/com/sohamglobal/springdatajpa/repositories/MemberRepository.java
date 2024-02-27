package com.sohamglobal.springdatajpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sohamglobal.springdatajpa.entities.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
	Member findByMemberid(int memberid);
	List<Member> findByName(String name);
	List<Member> findByJoinyear(int joinyear);
}
