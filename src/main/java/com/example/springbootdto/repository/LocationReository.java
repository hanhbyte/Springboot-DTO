package com.example.springbootdto.repository;

import com.example.springbootdto.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationReository extends JpaRepository<Location, Long> {
}
