package com.backend.booking.system.controller;


import com.backend.booking.system.model.Category;
import com.backend.booking.system.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/Category/")
@RequiredArgsConstructor
public class CategoryController {

   @Autowired
    private CategoryService Cat_Service;



    @PostMapping("/upload")
    public ResponseEntity<Category> createCategory(@RequestBody Category c) {
        Category savedCategory = Cat_Service.createCategory(c);
        return new ResponseEntity<>(savedCategory, HttpStatus.CREATED);
    }

    @GetMapping("/getCategory")
    public List<Category> getAllCategory(){
        return Cat_Service.getAllCategorys();
    }

    @PutMapping("/updateBook")
    public ResponseEntity<Category> updateCategory(@RequestParam (name = "id") long id, @RequestBody Category c){
        Category updateCategory=Cat_Service.updateCategory(c,id);
        return new ResponseEntity<>(updateCategory, HttpStatus.OK);
    }

    @DeleteMapping("/deleteBook")
    public ResponseEntity<Category> deleteBook(@RequestParam (name = "id") long id){
        Category deleteCategory=Cat_Service.deleteCategory(id);
        return new ResponseEntity<>(deleteCategory,HttpStatus.OK);
    }

    @PostMapping("/upload")
    public ResponseEntity<Category> uploadImage(@RequestParam("image") MultipartFile file) throws IOException {
        byte[] bytes = file.getBytes();
        // Save bytes to database here
       // return ResponseEntity.status(HttpStatus.OK).body("Image uploaded successfully");
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
