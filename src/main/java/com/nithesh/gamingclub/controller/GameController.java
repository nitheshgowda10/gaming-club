package com.nithesh.gamingclub.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nithesh.gamingclub.entities.Game;
import com.nithesh.gamingclub.services.GameService;

@RestController
@RequestMapping("/game")
public class GameController {
	@Autowired
	private GameService gameService;
	@PostMapping("/save")
	public Game save(@RequestBody Game game) {
		return gameService.saveGame(game);
		
	}
	@GetMapping("/all")
	public List<Game> findAll(){
		return gameService.getAllGames();
	}
	@PutMapping("/{id}")
	public Game update(@PathVariable int id,@RequestBody Game game) {
		return gameService.updateGame(id, game);
	}
	@DeleteMapping("/{id}")
	public boolean delete(@PathVariable int id) {
		return gameService.deleteGame(id);
	}
}
