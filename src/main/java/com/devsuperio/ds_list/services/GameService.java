package com.devsuperio.ds_list.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperio.ds_list.dto.GameDTO;
import com.devsuperio.ds_list.entities.Game;
import com.devsuperio.ds_list.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<Game> findAll(){
		List<Game> result = gameRepository.findAll();
		return result;
	}

}
