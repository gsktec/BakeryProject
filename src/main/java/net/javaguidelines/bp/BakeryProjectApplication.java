package net.javaguidelines.bp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguidelines.bp.entity.Bakeryitem;
import net.javaguidelines.bp.repository.BakeryRepository;

@SpringBootApplication
public class BakeryProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BakeryProjectApplication.class, args);
		 
	}


	@Autowired
	private BakeryRepository bakeryRepository;
	
//	public void run(String... args) throws Exception {
//		
//		
//		  Bakeryitem student1 = new Bakeryitem("Ramesh", 2, "ramesh@gmail.com");
//		  bakeryRepository.save(student1);
//		  
//		  Bakeryitem student2 = new Bakeryitem("Sanjay", 7, "sanjay@gmail.com");
//		  bakeryRepository.save(student2);
//		  
//		  Bakeryitem student3 = new Bakeryitem("tony", 8, "tony@gmail.com");
//		  bakeryRepository.save(student3);
//		 
//		
//	}
}
