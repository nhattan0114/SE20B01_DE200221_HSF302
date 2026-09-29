package com.hsf302.ch4.service;

import com.hsf302.ch4.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentService extends JpaRepository<Student, Long> {
    // Khung interface, các method nghiệp vụ sẽ bổ sung dần từ TODO 6
    long count();                                   // TODO 6
    Optional<Student> findById(Long id);            // TODO 6
}
