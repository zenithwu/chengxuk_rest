package com.chengxuk.dao.service;

import com.chengxuk.dao.entity.Course;
import com.chengxuk.dao.entity.User;
import org.springframework.data.repository.CrudRepository;



// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CourseRepository extends CrudRepository<Course, Long> {

}