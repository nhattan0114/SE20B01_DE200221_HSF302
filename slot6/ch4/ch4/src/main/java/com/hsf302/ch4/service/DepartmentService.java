package com.hsf302.ch4.service;

import com.hsf302.ch4.dto.DepartmentStatDTO;
import com.hsf302.ch4.pojo.Department;
import com.hsf302.ch4.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface DepartmentService extends JpaRepository<Department, Long>, JpaSpecificationExecutor<Student> {
    //Khung interface, các method nghiệp vụ sẽ bổ sung dần từ TODO 6
    long count();                                   // TODO 6
    boolean existsById(Long id);
    List<Department> findDepartmentsWithoutStudents();  // TODO 11d// TODO 6
    List<DepartmentStatDTO> getStatistics();   // TODO 14 (dùng lại ở TODO 23)
}
