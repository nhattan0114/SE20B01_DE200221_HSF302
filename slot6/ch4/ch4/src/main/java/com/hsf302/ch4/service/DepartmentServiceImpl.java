package com.hsf302.ch4.service;

import com.hsf302.ch4.pojo.Department;
import com.hsf302.ch4.pojo.Student;
import com.hsf302.ch4.repository.DepartmentRepository;
import com.hsf302.ch4.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.DeleteSpecification;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.domain.UpdateSpecification;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true) // Mặc định tất cả method chỉ ĐỌC

public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;
    private final StudentRepository studentRepository; // Sẽ dùng ở TODO 22 (chuyển sinh viên)
    @Override
    public long count() {
        return departmentRepository.count();
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Department entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Department> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public boolean existsById(Long id) {
        return departmentRepository.existsById(id);
    }
    @Override
    public List<Department> findDepartmentsWithoutStudents() {
        return departmentRepository.findByStudentsIsEmpty();
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Department> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Department> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Department> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Department getOne(Long aLong) {
        return null;
    }

    @Override
    public Department getById(Long aLong) {
        return null;
    }

    @Override
    public Department getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Department> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Department> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Department> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Department> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Department> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Department> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Department, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public Optional<Student> findOne(Specification<Student> spec) {
        return Optional.empty();
    }

    @Override
    public List<Student> findAll(Specification<Student> spec) {
        return List.of();
    }

    @Override
    public Page<Student> findAll(Specification<Student> spec, Pageable pageable) {
        return null;
    }

    @Override
    public Page<Student> findAll(Specification<Student> spec, Specification<Student> countSpec, Pageable pageable) {
        return null;
    }

    @Override
    public List<Student> findAll(Specification<Student> spec, Sort sort) {
        return List.of();
    }

    @Override
    public long count(Specification<Student> spec) {
        return 0;
    }

    @Override
    public boolean exists(Specification<Student> spec) {
        return false;
    }

    @Override
    public long update(UpdateSpecification<Student> spec) {
        return 0;
    }

    @Override
    public long delete(DeleteSpecification<Student> spec) {
        return 0;
    }

    @Override
    public <S extends Student, R> R findBy(Specification<Student> spec, Function<? super SpecificationFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Department> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Department> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Department> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public List<Department> findAll() {
        return List.of();
    }

    @Override
    public List<Department> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public List<Department> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Department> findAll(Pageable pageable) {
        return null;
    }
}
