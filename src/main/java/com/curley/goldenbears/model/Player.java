/**
 * 
 */
package com.curley.goldenbears.model;

import org.springframework.stereotype.Component;

/*import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;*/

/**
 * Represents NFL Player and their ratings
 * 
 * @author Mayor Curley
 */
//@Entity
@Component
public class Player {
    /*
     * @Id
     * @GeneratedValue
     */
    private Long id;

    private String firstName;
    private String lastName;
    private String team;
    private String qb;
    private int overall;
    private int awareness;
    private int speed;
    private int acceleration;
    private int agility;
    private int strength;

    public Player() {
        super();
    }

    public Player(String firstName, String lastName, String team, String qb, int overall, int awareness, int speed,
            int acceleration, int agility, int strength) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.team = team;
        this.qb = qb;
        this.overall = overall;
        this.awareness = awareness;
        this.speed = speed;
        this.acceleration = acceleration;
        this.agility = agility;
        this.strength = strength;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getQb() {
        return qb;
    }

    public void setQb(String qb) {
        this.qb = qb;
    }

    public int getOverall() {
        return overall;
    }

    public void setOverall(int overall) {
        this.overall = overall;
    }

    public int getAwareness() {
        return awareness;
    }

    public void setAwareness(int awareness) {
        this.awareness = awareness;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + acceleration;
        result = prime * result + agility;
        result = prime * result + awareness;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + overall;
        result = prime * result + ((qb == null) ? 0 : qb.hashCode());
        result = prime * result + speed;
        result = prime * result + strength;
        result = prime * result + ((team == null) ? 0 : team.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Player other = (Player) obj;
        if (acceleration != other.acceleration)
            return false;
        if (agility != other.agility)
            return false;
        if (awareness != other.awareness)
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (overall != other.overall)
            return false;
        if (qb == null) {
            if (other.qb != null)
                return false;
        } else if (!qb.equals(other.qb))
            return false;
        if (speed != other.speed)
            return false;
        if (strength != other.strength)
            return false;
        if (team == null) {
            if (other.team != null)
                return false;
        } else if (!team.equals(other.team))
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Player [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", team=" + team + ", qb="
                + qb + ", overall=" + overall + ", awareness=" + awareness + ", speed=" + speed + ", acceleration="
                + acceleration + ", agility=" + agility + ", strength=" + strength + "]";
    }


}
