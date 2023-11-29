package com.grpc.ums.repositories;

import com.grpc.ums.entities.Department;

public interface DepartmentRepository {
    public Department saveDepartment(Department department);
    public Department getDepartment(long department_id);
}
