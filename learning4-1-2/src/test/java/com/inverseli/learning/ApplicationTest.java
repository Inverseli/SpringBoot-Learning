package com.inverseli.learning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.inverseli.learning.async.Task;

/**
 * @author liyuhao
 * @date 2018年9月29日上午11:12:57
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationTest {

	
	 @Autowired
	    private Task task;

	    @Test
	    public void test() throws Exception {

	        task.doTaskOne();
	        task.doTaskTwo();
	        task.doTaskThree();

	        Thread.currentThread().join();
	    }

}

