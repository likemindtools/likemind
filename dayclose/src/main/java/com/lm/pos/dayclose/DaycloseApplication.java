package com.lm.pos.dayclose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;




@SpringBootApplication
//@EnableSwagger2
public class DaycloseApplication {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(DaycloseApplication.class, args);
	}
	
	/**@Bean
	public Docket swaggerConfiguration() {
		ApiInfoBuilder apiInfo = new ApiInfoBuilder()
				.title("Day close API for POS")
				.description("POS daily closure for POS")
				.version("1.0")
				.termsOfServiceUrl("on approval")
				.contact("test@likemind.com")
				.license("LM License")
				.licenseUrl("likemind.com");
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/dayclose/*"))
				.apis(RequestHandlerSelectors.basePackage("com.lm"))
				.build()
				.apiInfo(apiInfo.build());
	}*/

}
