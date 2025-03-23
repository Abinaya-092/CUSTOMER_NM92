package com.ecom.CustomerOrder.repository;

import com.ecom.CustomerOrder.model.order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<order, Long> {
}

