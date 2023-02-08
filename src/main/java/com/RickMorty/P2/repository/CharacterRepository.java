package com.RickMorty.P2.repository;

import com.RickMorty.P2.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {
}