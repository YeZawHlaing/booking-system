package com.backend.booking.system.repository;

import com.backend.booking.system.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    @Query(value = "SELECT * FROM category WHERE title = ?1", nativeQuery = true)
    List<Category> getBookByName(String bookName);


//    @Query(value =  "" , nativeQuery = true)
//    List<Book> getBookList(String booknameString);
}
