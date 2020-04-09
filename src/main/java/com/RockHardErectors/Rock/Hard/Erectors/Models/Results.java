package com.RockHardErectors.Rock.Hard.Erectors.Models;

import javax.persistence.*;

@Entity
public class Results {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private Athlete athlete;

    private int weightclass;

    @ManyToOne
    private Competition competition;

    private int bestSnatch;

    private int bestCleanAndJerk;

    private int total;

    public int getId() { return id; }

    public Athlete getAthlete() { return athlete; }

    public void setAthlete(Athlete athlete) { this.athlete = athlete; }

    public int getWeightclass() { return weightclass; }

    public void setWeightclass(int weightclass) { this.weightclass = weightclass; }

    public Competition getCompetition() { return competition; }

    public void setCompetition(Competition competition) { this.competition = competition; }

    public int getBestSnatch() { return bestSnatch; }

    public void setBestSnatch(int bestSnatch) { this.bestSnatch = bestSnatch; }

    public int getBestCleanAndJerk() { return bestCleanAndJerk; }

    public void setBestCleanAndJerk(int bestCleanAndJerk) { this.bestCleanAndJerk = bestCleanAndJerk; }

    public int getTotal() { return total; }

    public void setTotal() {
        if(this.bestCleanAndJerk > 0 & this.bestSnatch > 0){
            this.total = this.bestSnatch + this.bestCleanAndJerk;
        } else { this.total = 0;}
    }



}
