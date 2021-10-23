package com.bones.bonesSystem.repository;

import com.bones.bonesSystem.module.User;
import org.springframework.data.repository.CrudRepository;

public interface userRepository extends CrudRepository<User,Integer > {
}
