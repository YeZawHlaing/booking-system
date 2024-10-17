package com.backend.booking.system.service;

import com.backend.booking.system.model.Room;
import com.backend.booking.system.model.Services;

import java.util.List;

public interface ServiceService {
    Services createService(Services services);
    List<Services> getAllService();
    Services updateService(Services services, Long id);
    Services deleteService(Long id);
}
