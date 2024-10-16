package com.backend.booking.system.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "room")
public class Room {

    @Id
    @Column(name = "room_number", nullable = false, unique = true)
    private int room_number;

    @Column(name = "status")
    private boolean status;

    @ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.PERSIST)
    @JoinColumn( name = "RoomType" , referencedColumnName = "RoomType")
    private Category category;

}
