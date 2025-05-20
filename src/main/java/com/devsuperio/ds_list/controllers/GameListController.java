package com.devsuperio.ds_list.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperio.ds_list.dto.GameListDTO;
import com.devsuperio.ds_list.dto.GameMinDTO;
import com.devsuperio.ds_list.services.GameListService;
import com.devsuperio.ds_list.services.GameService;
//
//@RestController
//@RequestMapping(value = "/lists")
//public class GameListController {
//	
//	@Autowired
//	private GameListService gameListService;
//	
//	@Autowired
//	private GameService gameService;
//	
//	@GetMapping
//	public List<GameListDTO> findAll(){
//		List<GameListDTO> result = gameListService.findAll();
//		return result;
//	}
//	
//	@GetMapping(value = "/{id}/games")
//	public List<GameMinDTO> searchByList(@PathVariable Long listId){
//		List<GameMinDTO> result = gameService.searchByList(listId);
//		return result;
//	}
//}


@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;

	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}

	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findGames(@PathVariable Long listId) {
		List<GameMinDTO> result = gameService.searchByList(listId);
		return result;
	}
}

