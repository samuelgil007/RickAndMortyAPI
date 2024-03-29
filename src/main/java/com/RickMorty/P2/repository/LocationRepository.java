package com.RickMorty.P2.repository;

import com.RickMorty.P2.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

    @Override
    List<Location> findAll();
}
