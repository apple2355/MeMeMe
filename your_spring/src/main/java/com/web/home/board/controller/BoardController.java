package com.web.home.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.home.board.model.boardVO;

@Controller
public class BoardController {

	
	@RequestMapping(value="/board")
	public String boardLoading(boardVO vo, Model model) {
		return "board/list";
	}
}
