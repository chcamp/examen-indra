package com.chris;

//import org.springframework.cloud.client.loadbalancer.LoadBalanced;	
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	@Bean("clienteRest")
	//@LoadBalanced
	public RestTemplate registrarRestTemplate() {
		
		//este objeto de tipo RestTemplate
		//se va a guardar en el contenedor de Spring.
		return new RestTemplate();
	}

}


