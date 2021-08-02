/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap08.Prac2.Soccer;

/**
 *
 * @author Administrator
 */
public class Game {
    
    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;
    
    public void playGame(){
        int numberOfGoals = (int)(Math.random() * 7); 
        System.out.println(numberOfGoals);
        Goal[] theGoals = new Goal[numberOfGoals];
        this.goals = theGoals;
    }
    
    StringBuilder returnString = new StringBuilder();
    
    
    public String getDescription() {
        for (Goal currGoal: this.goals){
            returnString.append("Goal scored after "
                    + currGoal.theTime + " mins by "
                    + currGoal.thePlayer.playerName + " of "
                    + currGoal.theTeam.teamName + "\n");
        }
        
        return returnString.toString();
    }
    
    
    /* Practice 8-2. Add getDescription() method here */
    
      
}
