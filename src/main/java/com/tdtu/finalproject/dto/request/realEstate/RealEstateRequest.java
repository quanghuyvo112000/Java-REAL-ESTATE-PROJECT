package com.tdtu.finalproject.dto.request.realEstate;

import com.tdtu.finalproject.entity.User;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RealEstateRequest {

    String userId;
    String title;
    String description;
    String location;
    String address;
    Integer rooms;
    Integer bathrooms;
    String propertyType;
    Double price;
    LocalDate createdAt;
    String img;
    String role; // role: agent or owner
    String fullname;
    String email;
    String  phone;
}
