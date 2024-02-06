package com.sabanciuniv.repo;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sabanciuniv.model.Course;


public interface CourseRepository extends MongoRepository<Course, String> {
    public List<Course> findByProgramContainsIgnoreCase(String program);
    public List<Course> findByCodeContainsIgnoreCase(String code);
    public List<Course> findByTypeContainsIgnoreCase(String type);
}
