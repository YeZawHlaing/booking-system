package com.backend.booking.system.service;

import com.backend.booking.system.model.Room;

import java.util.List;

public interface RoomService {

    Room createRoom(Room room);
    List<Room> getAllRoom();
    Room updateRoom(Room room, Long id);
    Room deleteRoom(Long id);
}
