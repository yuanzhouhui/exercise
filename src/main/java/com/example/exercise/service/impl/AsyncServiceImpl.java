package com.example.exercise.service.impl;

import com.example.exercise.service.AsyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.concurrent.CountDownLatch;

/**
 * @author bright
 * @version 1.0
 * @description 异步任务serviceImpl
 * @date 2020-12-18 13:38
 */
@Service
public class AsyncServiceImpl implements AsyncService {

	@Override
	@Async("asyncServiceExecutor")
	public void asyncTest(CountDownLatch countDownLatch) {
		try {
			System.err.println(LocalDateTime.now() + " : 线程- " + Thread.currentThread().getId() + " 执行");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			countDownLatch.countDown();
		}
	}
}
