package com.restapp.restapp.dao;

import com.restapp.restapp.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface USerRepository extends CrudRepository<User, Long> {
}
