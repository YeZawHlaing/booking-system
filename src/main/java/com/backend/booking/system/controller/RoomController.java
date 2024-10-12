package com.backend.booking.system.controller;


import com.backend.booking.system.model.Room;
import com.backend.booking.system.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/backend/meikhtilar/")
@CrossOrigin
@RequiredArgsConstructor
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping("/upload")
    public ResponseEntity<Room> createRoom(@RequestBody Room room) {
        Room savedRoom = roomService.createRoom(room);
        return new ResponseEntity<>(savedRoom, HttpStatus.CREATED);
    }


    @GetMapping("/getRoom")
    public List<Room> getAllRoom(){
        return roomService.getAllRoom();
    }

    @PutMapping("/updateRoom")
    public ResponseEntity<Room> updateRoom(@RequestParam (name = "id") long id, @RequestBody Room room){
        Room updatedRoom=roomService.updateRoom(room,id);
        return new ResponseEntity<>(updatedRoom, HttpStatus.OK);
    }

    @DeleteMapping("/deleteRoom")
    public ResponseEntity<Room> deleteRoom(@RequestParam (name = "id") long id){
        Room deletedRoom=roomService.deleteRoom(id);
        return new ResponseEntity<>(deletedRoom,HttpStatus.OK);
    }
}
