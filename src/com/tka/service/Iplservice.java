package com.tka.service;

import java.util.List;
import com.tka.dao.Ipldao;
import com.tka.entity.player;

public class Iplservice {

    
    Ipldao ipldao;

    public Iplservice() {
        ipldao = new Ipldao(); // initialize in constructor
    }

    public List<player> getallplayer() {
        System.out.println("Welcome from Ipl service");
        return ipldao.getallpalyer();
    }

    public boolean insertPlayer(player p) {
        return ipldao.insertPlayer(p);
    }
    public boolean updatePlayer(player p) {
        return ipldao.updatePlayer(p);
    }
    public boolean deletePlayerById(int id) {
        return ipldao.deletePlayerById(id);
    }

}
