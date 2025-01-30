// package payroll.service;

// import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.hateoas.CollectionModel;
// import org.springframework.hateoas.EntityModel;
// import org.springframework.stereotype.Service;

// import payroll.assembler.EmployeeModelAssembler;
// import payroll.assembler.OrderModelAssembler;
// import payroll.controller.EmployeeController;
// import payroll.controller.OrderController;
// import payroll.model.Order;

// @Service
// public class OrderService {
// private final OrderController controller;
// private final OrderModelAssembler assembler;

// @Autowired
// public OrderService(OrderController controller, OrderModelAssembler
// assembler) {
// this.controller = controller;
// this.assembler = assembler;
// }

// public EntityModel<Order> getOrder(Long id) {
// return assembler.toModel(controller.one(id));
// }

// public CollectionModel<EntityModel<Order>> getAllOrders() {
// return assembler.toCollectionModel(controller.all());
// }
// }
