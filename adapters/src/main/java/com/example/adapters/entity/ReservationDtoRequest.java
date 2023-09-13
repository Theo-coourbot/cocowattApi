package com.example.adapters.entity;

import com.example.domain.entity.Car;
import com.example.domain.entity.Trip;
import com.example.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDtoRequest {
    private User user;
    private Trip trip;
    private Car car;
}
