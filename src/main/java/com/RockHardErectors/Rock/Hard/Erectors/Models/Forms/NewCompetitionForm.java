package com.RockHardErectors.Rock.Hard.Erectors.Models.Forms;

import javax.validation.constraints.NotNull;

public class NewCompetitionForm {

    @NotNull(message="Please enter a competition name.")
    private String name;

    @NotNull(message="Please select a competition end date.")
    private String endDate;

    @NotNull(message="Please enter a competition location.")
    private String location;

    @NotNull(message="Please select the level of competition.")
    private String competitionLevel;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEndDate() { return endDate; }

    public void setEndDate(String endDate) { this.endDate = endDate; }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

    public String getCompetitionLevel() { return competitionLevel; }

    public void setCompetitionLevel(String competitionLevel) { this.competitionLevel = competitionLevel; }

    public NewCompetitionForm(){}

    public NewCompetitionForm(String name, String endDate, String location, String competitionLevel) {
        this.name = name;
        this.endDate = endDate;
        this.location = location;
        this.competitionLevel = competitionLevel;
    }
}
