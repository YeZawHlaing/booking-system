package com.backend.booking.system.repository;

import com.backend.booking.system.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu ,Long> {
}
