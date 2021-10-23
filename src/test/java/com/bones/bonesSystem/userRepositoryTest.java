package com.bones.bonesSystem;

import com.bones.bonesSystem.module.User;
import com.bones.bonesSystem.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class userRepositoryTest {
    @Autowired private UserRepository repo;

    @Test
    public void testAddNew(){
        User user=new User();
        user.setEmail("hendrymwamburi56@gmail.com");
        user.setPassword("hendry56");
        user.setFirstName("hendry");
        user.setLastName("mwamburi");
        User userSaved=repo.save(user);

//        Assertions.assertThat(userSaved).isNotNull();
//        Assertions.assertThat(userSaved.getId()).isGreaterThan(0);



    }
}
