package com.chengxuk.domain.repository;

import com.chengxuk.domain.entity.CourseType;
import org.springframework.data.repository.CrudRepository;



// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CourseTypeRepository extends CrudRepository<CourseType, Long> {

}