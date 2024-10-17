package com.backend.booking.system.service;

import com.backend.booking.system.model.Menu;

import java.util.List;

public interface MenuService {
    Menu create(Menu menu);

    List<Menu> getAllMenu();

    Menu updateMenu(Menu menu, long id);

    Menu deleteMenu(long id);
}
