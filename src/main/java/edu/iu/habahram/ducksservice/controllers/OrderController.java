package edu.iu.habahram.ducksservice.controllers;

import edu.iu.habahram.ducksservice.model.Order;
import edu.iu.habahram.ducksservice.repository.OrderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/orders")
public class OrderController {

    private OrderRepository ordersRepository;

    public OrderController(OrderRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }


   @PostMapping
    public int add(@RequestBody Order duck) {
       try {
           return ordersRepository.save(duck).getId();
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
   }

    @GetMapping
    public Iterable<Order> findAll() {
        try {
            return ordersRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<List<Order>> find(@PathVariable String customerId) {


        try {
            List<Order> orders = ordersRepository.findAllByCustomerUserName(customerId);
            if(!orders.isEmpty()) {
                return ResponseEntity
                        .status(HttpStatus.FOUND)
                        .body(orders);
            } else {
                return ResponseEntity
                        .status(HttpStatus.NOT_FOUND)
                        .body(null);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }





}
