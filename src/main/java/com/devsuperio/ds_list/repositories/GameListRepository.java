package com.devsuperio.ds_list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperio.ds_list.entities.GameList;

public interface GameListRepository extends JpaRepository <GameList, Long>{
	
}
