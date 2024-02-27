package com.sohamglobal.springdatajpa.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.sohamglobal.springdatajpa.entities.Member;
import com.sohamglobal.springdatajpa.repositories.MemberRepository;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepo;
    
    public String addMember(Member m)
    {
    	memberRepo.save(m);
    	System.out.println("Member Added Successfully...");
    	return "addStatus.jsp";
    }
    
    public ModelAndView showAllMember()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("ShowAllMembers.jsp");
		
		List<Member> memberlist=memberRepo.findAll();
		mv.addObject("mlist", memberlist);
		System.out.println("number of rows retrived :"+memberlist.size());
		return mv;
	}
    
    public ModelAndView changeMobile(int memberid,String newMobile)
    {
    	Member obj=memberRepo.findByMemberid(memberid);
    	obj.setMobile(newMobile);
    	memberRepo.save(obj);
    	
    	return showAllMember();
    }
    
    public ModelAndView searchByMemberName(String name)
	{
    	ModelAndView mv=new ModelAndView();
		mv.setViewName("SearchResultOnMemberName.jsp");
		
		List<Member> memberlist=memberRepo.findByName(name);
		mv.addObject("mlist", memberlist);
		//System.out.println("number of rows retrived :"+memberlist.size());
		return mv;
		
	}
    
    public ModelAndView searchByJoinYear(int joinyear)
	{
    	ModelAndView mv=new ModelAndView();
		mv.setViewName("SearchResultOnJoinYear.jsp");
		
		List<Member> memberlist=memberRepo.findByJoinyear(joinyear);
		mv.addObject("mlist", memberlist);
		//System.out.println("number of rows retrived :"+memberlist.size());
		return mv;
	}
}
