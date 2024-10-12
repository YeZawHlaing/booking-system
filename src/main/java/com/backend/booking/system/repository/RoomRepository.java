package com.backend.booking.system.repository;

import com.backend.booking.system.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}
