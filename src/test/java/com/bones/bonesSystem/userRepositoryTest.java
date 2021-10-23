package com.bones.bonesSystem;

import com.bones.bonesSystem.module.User;
import com.bones.bonesSystem.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class userRepositoryTest {
    @Autowired private UserRepository repo;

    @Test
    public void testAddNew(){
        User user=new User();
        user.setEmail("bonse96@gmail.com");
        user.setPassword("hendry56!!");
        user.setFirstName("bones");
        user.setLastName("tim");
        User userSaved=repo.save(user);


//        Assertions.assertThat(userSaved).isNotNull;
//        Assertions.assertThat(userSaved.getId()).isGreaterThan(0);

    }
    @Test
    public void findListAll(){
       Iterable<User>users= repo.findAll();
//       Assertions.assertThat(users).hasSizGreaterThan(0);
       for (User user:users){
           System.out.println(user);
       }

    }
    @Test
    public void testUpdate(){
        Integer userId=1;
        Optional<User>optionalUser=repo.findById(userId);
        User user=optionalUser.get();
        user.setPassword("hello123");
        repo.save(user);

        User updatedUser=repo.findById(userId).get();
//        Assertions.assertThat(updatedUser.getPassword()).isEqualTo("hello123");
    }
    @Test
    public void testGet(){
        Integer userId=2;
        Optional<User>optionalUser=repo.findById(userId);
//        Assertions.assertThat(optionalUser).isPresent();
        System.out.println(optionalUser.get());

    }
    @Test
    public  void testDelete(){
        Integer userId=2;
        repo.deleteById(userId);

        Optional<User>optionalUser=repo.findById(userId);
//        Assertions.assertThat(optionalUser).isPresent();
    }
}
