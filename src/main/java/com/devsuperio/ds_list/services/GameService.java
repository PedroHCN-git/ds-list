package com.devsuperio.ds_list.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsuperio.ds_list.dto.GameMinDTO;
import com.devsuperio.ds_list.repositories.GameRepository;
import com.devsuperio.ds_list.entities.Game;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<Game> findAll(){
		List<Game> result = gameRepository.findAll();
		return result;
	}

}
