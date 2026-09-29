package com.hsf302.ch4.service;

import com.hsf302.ch4.pojo.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentService extends JpaRepository<Student, Long> {
    // Khung interface, các method nghiệp vụ sẽ bổ sung dần từ TODO 6
    long count();                                   // TODO 6
    Optional<Student> findById(Long id);
    List<Student> findAllOrderByGpaDesc();                              // TODO 7a
    Page<Student> findPage(int pageIndex, int size, String sortField);  // TODO 7b// TODO 6
    Optional<Student> findByStudentCode(String studentCode);   // TODO 8a
    boolean isEmailExisted(String email);                      // TODO 8b
    long countActive();
}
