package com.web.home.account.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.home.account.model.AccountDTO;
import com.web.home.account.service.AccountService;

@Controller
public class AccontController {
	
	private static final Logger logger = LoggerFactory.getLogger(AccontController.class);
	
	@Autowired
	private AccountDTO dto;
	@Autowired
	private AccountService service;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		return "account/login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(String userid, String pw, HttpServletRequest request, Model model) {
		dto =service.login(userid, pw);
		
		HttpSession session = request.getSession();
		
		if(dto != null) {
			session.setAttribute("acc_id", dto.getAcc_id());
			session.setAttribute("logined", true);
			session.setAttribute("account", dto);
			return "redirect:/";
		}
		session.setAttribute("logined", false);
		model.addAttribute("error", true);
		model.addAttribute("error_msg", "아이디 또는 패스워드를 확인하세요.");
		return "account/login";
	}
	
	@RequestMapping(value="/logout", method= RequestMethod.GET)
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if(session != null) {
			session.invalidate();
		}
		return "redirect:/";
	}
}
