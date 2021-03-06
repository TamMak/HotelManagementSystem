package edu.cs.mum.hotelmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class HotelManagementSysytemApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(HotelManagementSysytemApplication.class, args);
	}
}
