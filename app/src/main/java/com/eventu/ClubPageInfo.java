package com.eventu;

import java.util.ArrayList;

public class ClubPageInfo {
    private String ClubDescription;
    private String ClubName;
    private String ClubContact;
    private ArrayList<String> ClubSocial;
    private String ClubWebsite;
    private String clubID;

    public ClubPageInfo() {
    }

    public ClubPageInfo(String name, String id) {
        ClubDescription = "";
        ClubName = name;
        ClubContact = "";
        ClubSocial = new ArrayList<>();
        ClubWebsite = "";
        clubID = id;
    }
    public String getClubDescription() {
        return ClubDescription;
    }
    public String getClubName() {
        return ClubName;
    }
    public String getClubContact() {
        return ClubContact;
    }

    public ArrayList<String> getClubSocial() {
        return ClubSocial;
    }

    public void setClubSocial(ArrayList<String> newList) {
        ClubSocial = newList;
    }

    public String getClubWebsite() {
        return ClubWebsite;
    }

    public void setClubWebsite(String w) {
        ClubWebsite = w;
    }

    public String getClubID() {
        return clubID;
    }

    public void setClubID(String id) {
        clubID = id;
    }

    public void setClubDescription(String d) {
        ClubDescription = d;
    }

    public void setClubName(String n) {
        ClubName = n;
    }

    public void setClubContact(String c) {
        ClubContact = c;
    }

}