/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chap09.Prac1.Soccer;

import java.beans.PropertyChangeSupport;

/**
 *
 * @author Administrator
 */
public class Team {

    /**
     * @return the teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * @param teamName the teamName to set
     */
    public void setTeamName(String teamName) {
        java.lang.String oldTeamName = this.teamName;
        this.teamName = teamName;
        propertyChangeSupport.firePropertyChange(PROP_TEAMNAME, oldTeamName, teamName);
    }

    /**
     * @return the playerArray
     */
    public Player[] getPlayerArray() {
        return playerArray;
    }

    /**
     * @param playerArray the playerArray to set
     */
    public void setPlayerArray(Player[] playerArray) {
        Chap09.Prac1.Soccer.Player[] oldPlayerArray = this.playerArray;
        this.playerArray = playerArray;
        propertyChangeSupport.firePropertyChange(PROP_PLAYERARRAY, oldPlayerArray, playerArray);
    }
    
    private final transient PropertyChangeSupport propertyChangeSupport = new java.beans.PropertyChangeSupport(this);
    public static final String PROP_TEAMNAME = "teamName";
    public static final String PROP_PLAYERARRAY = "playerArray";
    private String teamName;
    private Player[] playerArray;
    
}
