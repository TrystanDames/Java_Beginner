/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap13.Prac3.Soccer;

/**
 *
 * @author Administrator
 */
public class Player {
    
    private String playerName;
    private int goalsScored;

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getGoalsSCored() {
        return goalsSCored;
    }

    public void setGoalsSCored(int goalsSCored) {
        this.goalsSCored = goalsSCored;
    }
    private int goalsSCored;
    
    public Player(String playerName) {
        this.playerName = playerName;
    }
    
    public Player() {}

    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    
    public void incGoalsScored(){
        this.goalsScored++;
    }
    
}
