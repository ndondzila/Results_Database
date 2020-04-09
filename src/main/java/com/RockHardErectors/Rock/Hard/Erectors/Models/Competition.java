package com.RockHardErectors.Rock.Hard.Erectors.Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Competition {



    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String endDate;

    private String location;

    private String competitionLevel;

    @OneToMany
    @JoinColumn(name = "competition_id")
    private List<Results> competitionResults = new ArrayList<>();

    @ManyToMany(mappedBy = "competitions")
    private List<Athlete> athletes;

    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEndDate() { return endDate; }

    public void setEndDate(String endDate) { this.endDate = endDate; }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

    public String getCompetitionLevel() { return competitionLevel; }

    public void setCompetitionLevel(String competitionLevel) { this.competitionLevel = competitionLevel; }

    public List<Results> getCompetitionResults() { return competitionResults; }

    public void setCompetitionResults(ArrayList<Results> competitionResults) { this.competitionResults = competitionResults; }

    public Competition(){}

    public Competition(String name, String endDate, String location, String competitionLevel) {
        this.name = name;
        this.endDate = endDate;
        this.location = location;
        this.competitionLevel = competitionLevel;
    }
}
