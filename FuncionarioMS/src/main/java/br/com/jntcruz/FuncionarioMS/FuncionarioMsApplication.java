package br.com.jntcruz.FuncionarioMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FuncionarioMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FuncionarioMsApplication.class, args);
	}

}
