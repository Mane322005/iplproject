package com.tka.user;

import java.util.List;
import java.util.Scanner;

import com.tka.controller.Iplcontroller;
import com.tka.entity.player;

public class Ipluser {

    public static void main(String[] args) {
        System.out.println("Welcome to IPL user");

        Iplcontroller iplcontroller = new Iplcontroller();

        // Display all players
        List<player> allplayer = iplcontroller.getallplayer();

        if (allplayer.isEmpty()) {
            System.out.println("No players found.");
        } else {
            System.out.println("List of Players:");
            System.out.println("ID\tJN\tName\t\tRuns\tWickets\tTeam");

            for (player p : allplayer) {
                System.out.println(
                    p.getId() + "\t" +
                    p.getJn() + "\t" +
                    p.getPname() + "\t\t" +
                    p.getRun() + "\t" +
                    p.getWickets() + "\t" +
                    p.getTname()+"\t"
                );
            }
           // player newPlayer = new player(15, 23, "Hardik Pandya", 1800, 50, "MI");
            //boolean isInserted = iplcontroller.insertPlayer(newPlayer);

            //if (isInserted) {
              //  System.out.println("Player inserted successfully.");
            //} else {
              //  System.out.println("Failed to insert player.");
            //}

//            player updatedPlayer = new player(15, 99, "Hardik Pandya", 22, 300, "GT"); // updated values with same ID
//
//            boolean isUpdated = iplcontroller.updatePlayer(updatedPlayer);
//
//            if (isUpdated) {
//                System.out.println("Player updated successfully.");
//            } else {
//                System.out.println("Failed to update player.");
//            }
//
//            
//        }
        
        
       // int idToDelete = 15; // change to the actual ID you want to delete

        //boolean isDeleted = iplcontroller.deletePlayerById(idToDelete);

        //if (isDeleted) {
          //  System.out.println("Player deleted successfully.");
        //} else {
          //  System.out.println("Failed to delete player or player not found.");
        //}

    }
    
    
    
    }
}
