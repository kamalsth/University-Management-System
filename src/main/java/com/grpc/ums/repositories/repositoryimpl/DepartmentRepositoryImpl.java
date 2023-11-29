package com.grpc.ums.repositories.repositoryimpl;


import com.grpc.ums.entities.Department;
import com.grpc.ums.repositories.DepartmentRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository {
    @Override
    public Department saveDepartment(Department department) {
        return null;
    }

    @Override
    public Department getDepartment(long department_id) {
        return null;
    }
}
