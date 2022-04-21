package com.web.home.join.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.home.join.model.JoinVO;
import com.web.home.join.service.JoinService;

@Controller
public class JoinController {
	
	private static final Logger logger = LoggerFactory.getLogger(JoinController.class);
	
	@Autowired
	private JoinService service;
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join() {
		logger.info("Join Get");
		return "account/join";
		
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(JoinVO vo, Model model) {
		logger.info("Join Post 실행");
		logger.info("userid: " + vo.getUserid() + ", pw: " + vo.getPw());
		
		int join = service.insertJoin(vo);
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/join/idcheck", method=RequestMethod.GET)
	public String idCheck(String userid) {
		int cnt =service.selectIdCheck(userid);
		
		String num = Integer.toString(cnt);
		
		return num;
	}
}
