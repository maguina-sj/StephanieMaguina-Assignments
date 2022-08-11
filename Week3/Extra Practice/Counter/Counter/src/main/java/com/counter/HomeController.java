package com.counter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession session, Model model) {
		if (session.getAttribute("count")==null) {
			session.setAttribute("count", 0);
		}else {
			Integer currentCount = (Integer) session.getAttribute("count");
			currentCount++;
			session.setAttribute("count", currentCount);
		}
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model, HttpServletRequest request) {
		Integer currentCount = 0;
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			currentCount = (Integer) session.getAttribute("count");
		}
		// we can use the following line to get the URL of the page (http://localhost:8080/counter"
		String homeUrl = request.getRequestURI().toString();
		model.addAttribute("count", currentCount);
		// we remove the last 8 characters from homeUrl to match the desired wireframe output (http://localhost:8080 instead of http://localhost:8080/counter"
		model.addAttribute("page", homeUrl.substring(0,homeUrl.length()-8));
	return "counter.jsp";
	}

}
