package com.backend.booking.system.controller;


import com.backend.booking.system.model.Event;
import com.backend.booking.system.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/backend/Event")
@CrossOrigin
@RequiredArgsConstructor
public class eventController {
    @Autowired
    private EventService eventService;

    @PostMapping("/upload")
    public ResponseEntity<Event> createEvent(@RequestParam Event e){
        Event saved_event = eventService.createEvent(e);
        return new ResponseEntity<>(saved_event , HttpStatus.CREATED);

    }

    @GetMapping(name ="/getEvent")
    public List<Event> getAllEvent(){
        return eventService.getAllEvent();
    }

    @PutMapping(name ="/updateEvent")
    public ResponseEntity<Event> updateEvent(@RequestParam (name ="id") long id , @RequestBody Event event)
    {
        Event updateEvent = eventService.updateEvent (event, id);
        return new ResponseEntity<>(updateEvent , HttpStatus.OK);

    }

    @DeleteMapping(name ="/deleteEvent")
    public ResponseEntity<Event> deleteEvent(@RequestParam (name ="id") long id){
        Event deleteEvent = eventService.deleteEvent(id);
        return new ResponseEntity<>(deleteEvent , HttpStatus.OK );
    }


}
