package edu.iu.habahram.ducksservice.repository;

import edu.iu.habahram.ducksservice.model.DuckData;
import edu.iu.habahram.ducksservice.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository
        extends CrudRepository<Order, Integer> {
    List<Order> findAllByCustomerUserName(String customerUserName);

}
