package com.xiao.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("")
	public String viewAdminPage() {
		return "index";
	}
}
