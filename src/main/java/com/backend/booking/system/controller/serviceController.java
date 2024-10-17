package com.backend.booking.system.controller;

import com.backend.booking.system.model.Room;
import com.backend.booking.system.model.Services;
import com.backend.booking.system.service.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/backend/Service/")
@CrossOrigin
@RequiredArgsConstructor
public class serviceController {
    @Autowired
    private ServiceService serviceService;

    @PostMapping("/upload")
    public ResponseEntity<Services> createService(@RequestBody Services services) {
        Services savedServic = serviceService.createService(services);
        return new ResponseEntity<>(savedServic, HttpStatus.CREATED);
    }


    @GetMapping("/getService")
    public List<Services> getAllService(){
        return serviceService.getAllService();
    }

    @PutMapping("/updateService")
    public ResponseEntity<Services> updateServic(@RequestParam(name = "id") long id, @RequestBody Services services){
        Services updatedServic=serviceService.updateService(services,id);
        return new ResponseEntity<>(updatedServic, HttpStatus.OK);
    }

    @DeleteMapping("/deleteService")
    public ResponseEntity<Services> deleteServic(@RequestParam (name = "id") long id){
        Services deletedServic=serviceService.deleteService(id);
        return new ResponseEntity<>(deletedServic,HttpStatus.OK);
    }
}
