package edu.iu.habahram.ducksservice.controllers;


import edu.iu.habahram.ducksservice.model.Flower;
import edu.iu.habahram.ducksservice.repository.FlowerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/flowers")
public class FlowerController {

    FlowerRepository flowersRepository;

    public FlowerController(
            FlowerRepository flowersRepository) {
        this.flowersRepository = flowersRepository;
    }

    @PostMapping
    public int add(@RequestBody Flower flower) {
        Flower saved = flowersRepository.save(flower);
        return saved.getId();
    }

    @GetMapping
    public Iterable<Flower> findAll() {
        Iterable<Flower> flowers = flowersRepository.findAll();
        return flowers;
    }




}
