package com.backend.booking.system.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Service")
public class Services {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Service_Id;

    @Column(name ="picture")
    private String Picture;


    @Column(name = "title")
    private String Title;

    @Column(name = "short_description")
    private String Short_Description;

    @Column(name = "long_description")
    private String Long_Description;


    @Column(name = "admin_id")
    private long Admin_Id;

}
