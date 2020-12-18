package com.example.exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author brighty
 * @version 1.0
 * @description
 * @date 2020-12-17 16:27
 */
@Controller
public class ToIndexController {

	@RequestMapping("/")
	public String toIndex() {
		return "index.html";
	}
}
