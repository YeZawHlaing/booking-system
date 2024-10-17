package com.backend.booking.system.service.serviceImp;

import com.backend.booking.system.model.Menu;
import com.backend.booking.system.model.Room;
import com.backend.booking.system.repository.MenuRepository;
import com.backend.booking.system.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuServiceImp implements MenuService {

    @Autowired
    private final MenuRepository menuRepository;


    @Override
    public Menu create(Menu menu) {
        return menuRepository.save(menu);
    }

    @Override
    public List<Menu> getAllMenu() {
        return menuRepository.findAll();
    }

    @Override
    public Menu updateMenu(Menu menu, long id) {
        Menu is_exist = menuRepository.findById(id).orElseThrow(() -> new RuntimeException("Error in Menu"));
        is_exist.setMenu_id(menu.getMenu_id());

        menuRepository.save(is_exist);

        return is_exist;
    }

    @Override
    public Menu deleteMenu(long id) {
        Menu is_exist=menuRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found in Menu"));
        menuRepository.deleteById(id);
        return is_exist;
    }
}
