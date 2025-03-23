package com.ecom.CustomerOrder.controller;

import com.ecom.CustomerOrder.model.order;
import com.ecom.CustomerOrder.service.OrderService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Order API", description = "Operations related to orders")
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service; // ✅ Added missing service variable

    @PostMapping
    public order addOrder(@RequestBody order o) {
        return service.addOrder(o);
    }

    @GetMapping
    public List<order> getAllOrders() {
        return service.getAllOrders();
    }

    @GetMapping("/{id}")
    public order getOrderById(@PathVariable Long id) {
        return service.getOrderById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        service.deleteOrder(id);
    }
}

