package com.restaurant.dto;

import com.restaurant.entity.Dish;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartDetailsDto {
    private UUID id;
    private Dish foodItem;
    private UserDto user;
    private Integer quantity;
    private Integer totalPrice;
}
