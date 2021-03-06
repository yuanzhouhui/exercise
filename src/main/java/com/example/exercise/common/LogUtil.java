package com.example.exercise.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author bright
 * @version 1.0
 * @description
 * @date 2020-12-18 9:54
 */
public class LogUtil {

	public static void trace(String msg) {
		getLogger().trace(msg);
	}

	public static void debug(String msg) {
		getLogger().debug(msg);
	}

	public static void info(String msg) {
		getLogger().info(msg);
	}

	public static void warn(String msg) {
		getLogger().warn(msg);
	}

	public static void error(String msg) {
		getLogger().error(msg);
	}

	public static void error(String msg, Throwable t) {
		getLogger().error(msg, t);
	}

	private static Logger getLogger() {
		return LogManager.getLogger(findCaller().getClassName());
	}

	private static StackTraceElement findCaller() {
		// 获取堆栈信息
		StackTraceElement[] callStack = Thread.currentThread().getStackTrace();
		// 最原始被调用的堆栈信息
		StackTraceElement caller;
		// 日志类名称
		String logClassName = LogUtil.class.getName();
		// 循环遍历到日志类标识
		int i = 0;
		for (int len = callStack.length; i < len; i++) {
			if (logClassName.equals(callStack[i].getClassName())) {
				break;
			}
		}

		caller = callStack[i + 3];
		return caller;
	}
}
