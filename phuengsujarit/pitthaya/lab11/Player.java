package phuengsujarit.pitthaya.lab11;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Player implements Serializable {
    private String name;
    private String nationality;
    private String dob;
    private String playerType;
    private String gender;
    private List<String> hobbies; // or ArrayList<JCheckBox> hobbies
    private List<String> sports; // or int[] sports
    private int year;

    // Constructor
    public Player(String name, String nationality, String dob, String playerType, String gender, ArrayList<String> hobbies, ArrayList<String> sports, int year) {
        this.name = name;
        this.nationality = nationality;
        this.dob = dob;
        this.playerType = playerType;
        this.gender = gender;
        this.hobbies = hobbies;
        this.sports = sports;
        this.year = year;
    }
    

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public List<String> getSports() {
        return sports;
    }

    public void setSports(List<String> sports) {
        this.sports = sports;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

