package com.backend.booking.system.service.serviceImp;

import com.backend.booking.system.model.Room;
import com.backend.booking.system.repository.RoomRepository;
import com.backend.booking.system.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomServiceImp implements RoomService {

    @Autowired
    private final RoomRepository roomRepository;

    @Override
    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public List<Room> getAllRoom() {
        return roomRepository.findAll();
    }

    @Override
    public Room updateRoom(Room room, Long id) {
       Room is_exist=roomRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
        is_exist.setRoom_number(room.getRoom_number());
        is_exist.setStatus(room.isStatus());
        roomRepository.save(is_exist);

        return is_exist;
    }

    @Override
    public Room deleteRoom(Long id) {
        Room is_exist=roomRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
        roomRepository.deleteById(id);
        return is_exist;
    }
}
