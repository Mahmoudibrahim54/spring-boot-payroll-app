// package payroll.service;

// import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.hateoas.CollectionModel;
// import org.springframework.hateoas.EntityModel;
// import org.springframework.stereotype.Service;

// import payroll.assembler.EmployeeModelAssembler;
// import payroll.controller.EmployeeController;
// import payroll.model.Employee;

// @Service
// public class EmployeeService {
// private final EmployeeController controller;
// private final EmployeeModelAssembler assembler;

// @Autowired
// public EmployeeService(EmployeeController controller, EmployeeModelAssembler
// assembler) {
// this.controller = controller;
// this.assembler = assembler;
// }

// public EntityModel<Employee> getEmployee(Long id) {
// return assembler.toModel(controller.one(id));
// }

// public CollectionModel<EntityModel<Employee>> getAllEmployees() {
// return assembler.toCollectionModel(controller.all());
// }
// }
