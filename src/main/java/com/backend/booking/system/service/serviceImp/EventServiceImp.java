package com.backend.booking.system.service.serviceImp;


import com.backend.booking.system.model.Event;
import com.backend.booking.system.repository.EventRepository;
import com.backend.booking.system.repository.MenuRepository;
import com.backend.booking.system.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventServiceImp implements EventService {

    @Autowired
    private final EventRepository eventRepository;

    @Override
    public Event createEvent(Event e) {
        return eventRepository.save(e);
    }

    @Override
    public List<Event> getAllEvent() {
        return eventRepository.findAll();
    }

    @Override
    public Event updateEvent(Event event, long id) {
        Event is_exist = eventRepository.findById(id).orElseThrow(() -> new RuntimeException("Eorr found in Update Event"));
        is_exist.setEvent_id(event.getEvent_id());

        return is_exist;
    }

    @Override
    public Event deleteEvent(long id) {
        Event is_exist = eventRepository.findById(id).orElseThrow(() -> new RuntimeException("Error found in deleteEvent"));
        eventRepository.deleteById(id);
        return null;
    }
}
