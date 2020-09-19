package com.test.abc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JustTestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JustTestServiceApplication.class, args);
	}

	@GetMapping(value = "/version")
    public ResponseEntity<String> getMethodName(@Value("${info.version:1.0.0}") String version) {
        return ResponseEntity.ok(version);
    }

}
