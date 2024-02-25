package modelDao;

import Model.entities.Department;
import Model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer obj);
    Seller findById(Integer obj);
    List<Seller> findAll();


}
