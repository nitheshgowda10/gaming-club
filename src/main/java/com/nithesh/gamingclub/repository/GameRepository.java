package com.nithesh.gamingclub.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nithesh.gamingclub.entities.Game;


@Repository
public interface GameRepository extends JpaRepository<Game,Integer> {
}