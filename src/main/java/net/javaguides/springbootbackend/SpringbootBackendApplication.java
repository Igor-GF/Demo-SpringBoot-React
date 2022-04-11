package net.javaguides.springbootbackend;

import net.javaguides.springbootbackend.model.Employee;
import net.javaguides.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("John");
//		employee.setLastName("Doe");
//		employee.setEmailId("john@doe.com");
//		employeeRepository.save(employee);
//
//		Employee employeeTwo = new Employee();
//		employeeTwo.setFirstName("Jane");
//		employeeTwo.setLastName("Doe");
//		employeeTwo.setEmailId("jane@doe.com");
//		employeeRepository.save(employeeTwo);
	}
}
