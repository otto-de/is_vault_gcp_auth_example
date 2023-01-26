package com.ottogroup.esb.examples.vaultgcpauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class VaultGcpAuthApplication {
	@RequestMapping("/")
	public String home() {
		return "Hello World!";
	}
	public static void main(String[] args) {
		SpringApplication.run(VaultGcpAuthApplication.class, args);
	}



}
