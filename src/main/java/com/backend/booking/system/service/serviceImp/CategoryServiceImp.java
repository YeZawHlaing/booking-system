package com.backend.booking.system.service.serviceImp;

import com.backend.booking.system.model.Category;
import com.backend.booking.system.repository.CategoryRepository;
import com.backend.booking.system.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImp implements CategoryService {



    @Autowired
    private final CategoryRepository cat_repository;



//    @Override
//    public Category createCategory(CategoryDTO cdto) {
//
//        try {
//            //image uploading
//            // create directory if it does not exist
//            if (cdto.getImage() != null) {
//                Path imageStoragePath = Paths.get(imageStorageDirectory);
//                if (!Files.exists(imageStoragePath)) {
//                    Files.createDirectories(imageStoragePath);
//                }
//                //decode the 64base string file
//                byte[] decodedBytes = Base64.getDecoder().decode(cdto.getImage());
//                String imageName = new Date().getTime() + ".png";
//                Path toStorePath = imageStoragePath.resolve(imageName);
//
//                //write file in static/images folder
//                Files.write(toStorePath, decodedBytes);
//
//                //generate image url
//                String imageUrl = ServletUriComponentsBuilder.fromCurrentContextPath()
//                        .path("/images/")
//                        .path(imageName).toUriString();
//
//                cdto.setImage(String.valueOf(Byte.parseByte(imageUrl)));
//            }
//
//           // S save = cat_repository.save(cdto);
//            return null;
//
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }

    @Override
    public Category createCategory(Category c) {
        return cat_repository.save(c);
    }

       // @OneToMany
        @Override
        public List<Category> getAllCategorys () {
            return cat_repository.findAll();
        }

        @Override
        public Category updateCategory (Category c, Long id){
            Category is_exist = cat_repository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
            is_exist.setRoomType(c.getRoomType());
            is_exist.setPrice(c.getPrice());
            is_exist.setImage(c.getImage());
            is_exist.setDescription(c.getDescription());
            cat_repository.save(is_exist);

            return is_exist;
        }

        @Override
        public Category deleteCategory (Long id){
            Category is_exist = cat_repository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
            cat_repository.deleteById(id);
            return is_exist;
        }

}
