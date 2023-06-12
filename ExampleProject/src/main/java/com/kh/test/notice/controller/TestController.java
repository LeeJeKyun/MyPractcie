package com.kh.test.notice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kh.test.notice.model.vo.Notice;
import com.kh.test.notice.service.NoticeService;

@Controller
public class TestController {
	
	@Autowired NoticeService noticeService;
	
	@GetMapping("/ninsert.do")
	public void insertNoitce() {
		
	}
	
	@PostMapping("/ninsert.do")
	public String insertNotice(
			
			Notice notice
			
			) {
		
		if (noticeService.putNotice(notice)) {
			//제대로 insert가 된 경우
			
			return "redirect:nList.do";
		}
		
		//아닌 경우
		return "redirect:error.do";
	}

}
