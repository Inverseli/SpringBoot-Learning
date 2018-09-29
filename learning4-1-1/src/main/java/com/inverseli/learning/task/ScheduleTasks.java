package com.inverseli.learning.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author liyuhao
 * @date 2018年9月29日上午10:52:07
 */
@Component
public class ScheduleTasks {
	
	private static final SimpleDateFormat dateFormat= new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000) // 每过5秒执行的任务
	public void reportCurrentTime() {
		System.out.println("时间：" + dateFormat.format(new Date()));
	}
}

