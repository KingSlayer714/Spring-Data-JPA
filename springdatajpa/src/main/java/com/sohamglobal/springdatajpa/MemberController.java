package com.sohamglobal.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sohamglobal.springdatajpa.entities.Member;
import com.sohamglobal.springdatajpa.servicies.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberserv;
	
	@GetMapping("/newmember")
	public String newMember()
	{
		return "newmember.jsp";
	}
	
	@PostMapping("/addmember")
	public String addMember(Member m)
	{
		return memberserv.addMember(m);
	}
	
	@GetMapping("/allmember")
	public ModelAndView allMember()
	{
		return memberserv.showAllMember();
	}
	
	@PostMapping("/modifymobile")
	public ModelAndView modifyMobile(int memberid,String newMobile)
	{
		return memberserv.changeMobile(memberid, newMobile);
	}
	
	@GetMapping("/searchmember")
	public String searchMember()
	{
		return "searchMember.jsp";
	}
	
	@PostMapping("/searchByMemberName")
	public ModelAndView searchByMemberName(String name)
	{
		return memberserv.searchByMemberName(name);
	}
	
	@PostMapping("/searchByJoinYear")
	public ModelAndView searchByJoinYear(int joinyear)
	{
		return memberserv.searchByJoinYear(joinyear);
	}
}
