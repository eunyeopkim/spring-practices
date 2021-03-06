package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/*
 * @RequestMapping
 * Class 단독 매핑
 * 이런게 있다 (= 1번 방법이 좋다 )
 */

@Controller
@RequestMapping("/guestbook")
public class GuestbookController {
	
	@ResponseBody
	@RequestMapping("/list")
	public String list() {
		return "GuestbookController:list";
	}
	
	@ResponseBody
	@RequestMapping("/delete")
	public String delete() {
		return "GuestbookController:delete";
	}
}
