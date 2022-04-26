package com.project.onlinesystem.repository;

import com.project.onlinesystem.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Integer>{
     List<Orders> findByUserid(String userid);
}
