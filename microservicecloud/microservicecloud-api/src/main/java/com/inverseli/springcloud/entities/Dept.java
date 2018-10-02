package com.inverseli.springcloud.entities;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author liyuhao
 * @date 2018年10月1日下午2:05:46
 */
@SuppressWarnings("serial") // 压制警告
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true) // 链式访问 
public class Dept implements Serializable{ // entity orm db_table
	
	private Long deptno; // primary key
	private String dname; // department name
	private String db_source; // datasource
	
		
}
