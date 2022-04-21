package com.date.display.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateControllers {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		SimpleDateFormat dayName = new SimpleDateFormat("EEEE");
		SimpleDateFormat dayFormat = new SimpleDateFormat("dd");
		SimpleDateFormat monthFormat = new SimpleDateFormat("MMMM");
		SimpleDateFormat yearFormat = new SimpleDateFormat("Y");
		
		Date date = new Date();
		
		String dayNameString = dayName.format(date);
		String dayString = dayFormat.format(date);
		String monthString = monthFormat.format(date);
		String yearString = yearFormat.format(date);
		
		String dateString = dayNameString + ", " + dayString + " of " + monthString + " , " + yearString;
		
		model.addAttribute("dateString", dateString);
		
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm:a");
		Date date = new Date();
		String timeString = timeFormat.format(date);
		model.addAttribute("timeString", timeString);
		
		return "time.jsp";
	}
}
