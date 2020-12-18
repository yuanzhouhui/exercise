package com.example.exercise.service;

import java.util.concurrent.CountDownLatch;

/**
 * @author bright
 * @version 1.0
 * @description 异步任务service
 * @date 2020-12-18 13:36
 */
public interface AsyncService {

	void asyncTest(CountDownLatch countDownLatch);
}
