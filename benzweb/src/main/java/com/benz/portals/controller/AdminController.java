package com.benz.portals.controller;


import com.benz.portals.web.CmsSessionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@RequestMapping("/admin")
	public String index() {
		logger.info("AdminController /login/admin");
		return "admin/index";
	}
	
	@RequestMapping("/admin/logout")
	public String logout(HttpSession session) {
		logger.info("AdminController /login/admin/logout");
		CmsSessionContext.removeSession(session);
		session.invalidate();
		return "redirect:/login";
	}
}
