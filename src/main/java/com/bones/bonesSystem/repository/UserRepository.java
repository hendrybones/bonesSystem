package com.bones.bonesSystem.repository;

import com.bones.bonesSystem.module.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer > {
}
