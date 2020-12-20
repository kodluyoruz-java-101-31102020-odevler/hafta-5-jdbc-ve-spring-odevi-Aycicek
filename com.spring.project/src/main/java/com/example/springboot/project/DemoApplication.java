package com.example.springboot.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.example.springboot.project.configuration.AppConfig;


//Bu sayede spring bütün paketleri taramak yerine sadece bizim gösterdiğimiz sınıf altında tanımlı paketleri
//Tarayacaktır ve ilgili sınıfları spring context e inject edecektir.
@SpringBootApplication(scanBasePackages = {
		"com.spring.basics.configuration"
})

@Import(AppConfig.class)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
