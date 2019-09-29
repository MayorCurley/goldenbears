/**
 * 
 */
package com.curley.goldenbears.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curley.goldenbears.model.Player;

/**
 * RestController for Player requests
 * 
 * @author Mayor Curley
 *
 */
@RestController
public class PlayerController {
    @Autowired
    private Player player;
    
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String healthCheck() {
        return "OK";
    }
    
    @RequestMapping(value="/test/players", method=RequestMethod.GET)
    public List<Player> getTestPlayers() {
        List<Player> players = new ArrayList<>();
        
        players.add(new Player("Tom",
                "Brady",
                "New England Patriots",
                "QB",
                97, 99, 60, 66, 70, 64));
        players.add(new Player("Patrick",
                "Mahomes",
                "Kansas City Chiefs",
                "QB",
                98, 94, 81, 87, 88, 69));
        players.add(new Player("Ezekiel",
                "Elliott",
                "Dallas Cowboys",
                "HB",
                94, 98, 90, 91, 95, 81));
        players.add(new Player("Stephon",
                "Gilmore",
                "New England Patriots",
                "CB",
                94, 95, 91, 94, 94, 62));
        players.add(new Player("Tyreek",
                "Hill",
                "Kansas City Chiefs",
                "WR",
                94, 85, 99, 99, 98, 64));
        
        return players;
    }
    
    @RequestMapping(value="/player", method=RequestMethod.POST)
    public Player updatePlayer(
        @RequestParam(name="firstName", required = true) String firstName,
        @RequestParam(name="lastName", required = true) String lastName) {
        player.setFirstName(firstName);
        player.setLastName(lastName);
        return player;
    }
}
