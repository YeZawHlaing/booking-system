package com.backend.booking.system.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Event")
public class Event {
    @Id
    @Column(name ="event_id", nullable = false, unique = true)
    private long event_id;

    @Column(name ="picture")
    private String picture;

    @Column(name ="title")
    private String title;

    @Column(name ="price")
    private int price;

    @Column(name ="description")
    private String description;


}
