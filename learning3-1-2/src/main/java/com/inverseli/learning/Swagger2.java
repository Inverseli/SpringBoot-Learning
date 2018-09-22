package com.inverseli.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**  
 * @date：2018年9月22日 上午10:21:17    
 * @author liyuhao
 * @version 1.0   
 * @since JDK 1.8  
 * @description：  Swagger2配置类
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.inverseli.learning"))
				.paths(PathSelectors.any())
				.build();
				
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("springboot + Swagger2")
				.description("personal study")
				.termsOfServiceUrl("baidu.com")
				.contact("sunf")
				.version("1.0")
				.build();
				
	}
	
}
  
