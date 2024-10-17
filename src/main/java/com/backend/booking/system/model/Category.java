package com.backend.booking.system.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Category")
public class Category {

    @Id
    @Column(name = "RoomType", nullable = false, unique = true)
    private String RoomType;

    @Column(name ="image")
    private String image;


    @Column(name = "price")
    private int price;

    @Column(name = "description")
    private String description;





}
