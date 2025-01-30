package payroll.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import payroll.exception.OrderNotFoundException;

@ControllerAdvice
public class OrderNotFoundAdvice {
    @ExceptionHandler(payroll.exception.OrderNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(OrderNotFoundException ex) {
        return ex.getMessage();
    }
}
