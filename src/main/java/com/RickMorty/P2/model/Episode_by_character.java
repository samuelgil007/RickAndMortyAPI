package com.RickMorty.P2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "episode_by_character")
public class Episode_by_character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "id_episode", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Episode episode;

    @JoinColumn(name = "id_characters", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Character characters;

}
