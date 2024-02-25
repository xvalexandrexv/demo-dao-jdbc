package modelDao;

import Model.entities.Department;

import java.util.List;

public interface DepartmentDao {

    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer obj);
    Department findById(Integer obj);
    List<Department> findAll();


}
