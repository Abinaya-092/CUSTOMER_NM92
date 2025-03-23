package com.ecom.CustomerOrder.service;

import com.ecom.CustomerOrder.model.order;

import com.ecom.CustomerOrder.exception.ResourceNotFoundException;

import com.ecom.CustomerOrder.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public order addOrder(order o) {
        return repository.save(o);
    }

    public List<order> getAllOrders() {
        return repository.findAll();
    }

    public order getOrderById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found with id: " + id));
    }
    public void deleteOrder(Long id){
        repository.deleteById(id);
    }
}
