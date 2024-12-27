package com.example.repo;

import com.example.entity.Eveniment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EvenimentRepo extends JpaRepository<Eveniment, Integer> {
    List<Eveniment> findByLocatia(String locatia);
    List<Eveniment> findByData(LocalDate data);
}
