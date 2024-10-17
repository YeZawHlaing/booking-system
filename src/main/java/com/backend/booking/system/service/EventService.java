package com.backend.booking.system.service;

import com.backend.booking.system.model.Event;

import java.util.List;

public interface EventService {
    Event createEvent(Event e);

   List<Event> getAllEvent();

    Event updateEvent(Event event, long id);

    Event deleteEvent(long id);
}
