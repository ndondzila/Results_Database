package com.RockHardErectors.Rock.Hard.Erectors.Models;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Athlete {

    @Id
    @GeneratedValue
    private int id;

    private String firstName;

    private String lastName;

    private String competitionGender;

    private String birthDate;

    @Transient
    private List<Integer> snatches;

    @Transient
    private List<Integer> cleanAndJerks;

    @Transient
    private List<Integer> totals;

    @OneToMany
    @JoinColumn(name = "athlete_id")
    private List<Results> competitionResults = new ArrayList<>();

    @ManyToMany
    private List<Competition> competitions;

    public Athlete(){}

    public Athlete(String firstName, String lastName, String competitionGender, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.competitionGender = competitionGender;
        this.birthDate = birthDate;
    }

    public int getId() { return id; }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getCompetitionGender() { return competitionGender; }

    public void setCompetitionGender(String competitionGender) { this.competitionGender = competitionGender; }

    public String getBirthDate() { return birthDate; }

    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }

    public List<Integer> getSnatches() { return snatches; }

    public void setSnatches(ArrayList<Integer> snatches) { this.snatches = snatches; }

    public List<Integer> getCleanAndJerks() { return cleanAndJerks; }

    public void setCleanAndJerks(ArrayList<Integer> cleanAndJerks) { this.cleanAndJerks = cleanAndJerks; }

    public List<Integer> getTotals() { return totals; }

    public void setTotals(ArrayList<Integer> totals) { this.totals = totals; }

    public List<Results> getCompetitionResults() { return competitionResults; }

    public void setCompetitionResults(ArrayList<Results> competitionResults) { this.competitionResults = competitionResults; }
}
