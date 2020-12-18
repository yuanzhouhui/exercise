package com.example.exercise.controller;

import com.example.exercise.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.CountDownLatch;

/**
 * @author bright
 * @version 1.0
 * @description 测试多线程用Controller
 * @date 2020-12-18 13:51
 */
@Controller
public class AsyncController {

	@Autowired
	AsyncService asyncService;

	@RequestMapping("/async")
	@ResponseBody
	public String printinfo() {
		int count = 20;
		CountDownLatch countDownLatch = new CountDownLatch(10);
		try {
			for (int i = 0; i < count; i++) {
				asyncService.asyncTest(countDownLatch);
			}
			countDownLatch.await();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "SUCCESS";
	}
}
