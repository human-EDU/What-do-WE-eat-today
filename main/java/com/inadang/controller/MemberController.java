package com.inadang.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.inadang.domain.MemberVO;
import com.inadang.service.MemberService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("member/*")
@AllArgsConstructor
@Log4j
public class MemberController {
	private MemberService memberService;
	
	@GetMapping("login")
	public void login(@ModelAttribute String error,@ModelAttribute String logout) {
		
	}
	
	@PostMapping("login")
	public String login() {
		return "/index";
	}
	
	@GetMapping("join")
	public void join() {
		
	}
	
	@PostMapping("join")
	public String join(MemberVO vo) {
		log.info(vo.getId());
		log.info(vo);
		memberService.join(vo);
		return "redirect:/member/login";
	}
	
	@PreAuthorize("isFullyAuthenticated()")
	@GetMapping("notice")
	public void notice() {
		
	}
	@PostMapping
	public void notice(MemberVO vo) {
		
	}
	
	@RequestMapping(value="/memberIdChk", method=RequestMethod.POST)
	@ResponseBody
	public String memberIdChk(String id) {
//		log.info("쳌");
		int result = memberService.idCheck(id);
		log.info("아이디 : " + result);
		if(result != 0) {
			return "fail";
		}
		else {
			return "success";
		}
	}
}
