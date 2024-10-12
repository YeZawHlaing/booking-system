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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "RoomType")
    @Column(name = "RoomType")
    private String RoomType;

    @Column(name ="image")
    private byte image;


    @Column(name = "price")
    private int price;

    @Column(name = "description")
    private String description;





}
