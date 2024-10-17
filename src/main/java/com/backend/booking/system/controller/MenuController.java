package com.backend.booking.system.controller;

import com.backend.booking.system.model.Menu;
import com.backend.booking.system.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/backend/Menu/")
@CrossOrigin
@RequiredArgsConstructor
public class MenuController {
    @Autowired
    private MenuService menu_service;

    @PostMapping("/upload")
    public ResponseEntity<Menu> createMenu(@RequestBody Menu menu){
        Menu saveMenu = menu_service.create(menu);
        return new ResponseEntity<>(saveMenu, HttpStatus.CREATED);

    }
    @GetMapping("/getRoom")
    public List<Menu> getAllMenu(){
        return menu_service.getAllMenu();
    }

    @PutMapping("updateMenu")
    public ResponseEntity<Menu> updateMenu(@RequestParam (name ="id") long id, Menu menu){
        Menu updateMenu = menu_service.updateMenu(menu, id);
        return new ResponseEntity<>(updateMenu, HttpStatus.OK);

    }

    @DeleteMapping("deleteRoom")
    public ResponseEntity<Menu> deleteMenu(@RequestParam (name = "id") long id){
        Menu deleteMenu = menu_service.deleteMenu(id);
        return new ResponseEntity<>(deleteMenu , HttpStatus.OK);
    }

}
