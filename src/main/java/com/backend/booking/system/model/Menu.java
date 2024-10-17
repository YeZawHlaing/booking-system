package com.backend.booking.system.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="menu")
public class Menu {
    @Id
    @Column(name = "menu_id" , nullable = false , unique = true)
    private int menu_id;

    @Column(name ="picture")
    private String picture;

    @Column(name ="title")
    private String title;

    @Column (name ="description")
    private String description;

    @Column (name= "price")
    private int pirce;

    @Column (name = "admin_id")
    private int admin_id;

}
