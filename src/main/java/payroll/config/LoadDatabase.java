
package payroll.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import payroll.model.Employee;
import payroll.model.Order;
import payroll.model.enums.Status;
import payroll.repository.EmployeeRepository;
import payroll.repository.OrderRepository;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository) {

        return args -> {
            employeeRepository.save(new Employee("Samir", "Gamil", "SWE"));
            employeeRepository.save(new Employee("Hassan", "Fahim", "S.SWE"));

            employeeRepository.findAll().forEach(employee -> {
                log.info("Preloaded" + employee);
            });

            orderRepository.save(new Order("Librum 17", Status.COMPLETED));
            orderRepository.save(new Order("Volla 5", Status.IN_PROGRESS));

            orderRepository.findAll().forEach(order -> {
                log.info("Preloaded" + order);
            });

        };
    }
}