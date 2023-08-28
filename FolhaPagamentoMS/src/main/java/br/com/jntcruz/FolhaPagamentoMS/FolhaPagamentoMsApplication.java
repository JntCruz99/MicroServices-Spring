package br.com.jntcruz.FolhaPagamentoMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FolhaPagamentoMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FolhaPagamentoMsApplication.class, args);

	}
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
