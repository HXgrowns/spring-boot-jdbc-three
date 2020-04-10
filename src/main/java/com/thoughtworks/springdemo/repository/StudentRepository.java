package com.thoughtworks.springdemo.repository;


import com.thoughtworks.springdemo.entity.Student;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
    @Query("SELECT * FROM student WHERE name = :name")
    Student findByName(String name);

    @Modifying
    @Query("DELETE FROM student WHERE name = :name")
    boolean deleteByName(String name);
}
