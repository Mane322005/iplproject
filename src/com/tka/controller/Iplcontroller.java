package com.tka.controller;

import java.util.ArrayList;
import java.util.List;

import com.tka.entity.player;
import com.tka.service.Iplservice;

public class Iplcontroller {
	private Iplservice iplservice=null;

	public List<player> getallplayer() {
		System.out.println("Welcome to Iplcontroller");
		iplservice=new Iplservice();
		List<player>allplayer=iplservice.getallplayer();
		
		return allplayer;
	}

	public List<player> getPlayersByTeam(String teamName) {
		List<player> allPlayers = getallplayer();
	    List<player> teamPlayers = new ArrayList<>();

	    for (player p : allPlayers) {
	        if (p.getTname().equalsIgnoreCase(teamName)) {
	            teamPlayers.add(p);
	        }
	    }
	    return teamPlayers;
		
	}

	public boolean insertPlayer(player p) {
	    return iplservice.insertPlayer(p);
	}
	public boolean updatePlayer(player p) {
	    return iplservice.updatePlayer(p);
	}
	public boolean deletePlayerById(int id) {
	    return iplservice.deletePlayerById(id);
	}

	


	

}
