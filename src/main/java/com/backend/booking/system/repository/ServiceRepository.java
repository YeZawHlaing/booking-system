package com.backend.booking.system.repository;

import com.backend.booking.system.model.Room;
import com.backend.booking.system.model.Services;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Services,Long> {

}
