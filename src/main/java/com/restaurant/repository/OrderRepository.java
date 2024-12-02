package com.restaurant.repository;


import com.restaurant.entity.Orders;
import com.restaurant.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<Orders, UUID> {
    List<Orders> findByUser(User user);
    @Query("select o from Orders o where o.user.id = :userId order by o.orderedDateTime desc limit 1")
    Orders findRecentOrder(@Param("userId") UUID userId);
}
