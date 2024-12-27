package com.example.controller;

import com.example.entity.Eveniment;
import com.example.repo.EvenimentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EvenimentController {
    @Autowired
    EvenimentRepo repository;

    @GetMapping("/lista-evenimente")
    public List<Eveniment> findAll(){
        return repository.findAll();
    }

    @GetMapping("lista-evenimente/filtrare-locatie/{locatia}")
    public List<Eveniment> findByLocatia(@PathVariable("locatia") String locatia){
         return repository.findByLocatia(locatia);
    }

    @GetMapping("lista-evenimente/filtrare-data/{data}")
    public List<Eveniment> findByData(@PathVariable("data") LocalDate data){
        return repository.findByData(data);
    }

    @PostMapping("/lista-evenimente")
    public void saveEveniment(@RequestBody Eveniment eveniment){
        repository.save(eveniment);
    }

    @DeleteMapping("/lista-evenimente/{id}")
    public void deleteById(@PathVariable("id") int id){
        repository.deleteById(id);
    }

}
