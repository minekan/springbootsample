package com.example.springbootsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringbootsampleController {
	@GetMapping("/")
	@PostMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/{num}")
	public String index(@PathVariable int num, Model model) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		model.addAttribute("msg", "sum=" + sum);
		return "index";
	}

	@GetMapping("/mav/{num}")
	public ModelAndView index(@PathVariable int num, ModelAndView mav) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		mav.addObject("msg", "sum=" + sum);
		mav.setViewName("index2");
		return mav;
	}

	@GetMapping("/mavform")
	public ModelAndView mavform(ModelAndView mav) {
		mav.setViewName("index3");
		mav.addObject("msg", "お名前を入力してください");
		return mav;
	}

	@PostMapping("/mavform")
	public ModelAndView mavform(
			@RequestParam("text1") String str,
			ModelAndView mav) {
		mav.setViewName("index3");
		mav.addObject("msg", "こんにちは" + str + "さん！");
		mav.addObject("value", str);
		return mav;
	}
}
