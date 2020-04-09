package com.RockHardErectors.Rock.Hard.Erectors.Models.Forms;

import javax.validation.constraints.*;
import java.text.ParseException;

public class NewAthleteForm {

    @NotEmpty (message="Please enter a first name.")
    private String firstName;

    @NotEmpty (message="Please enter a first name.")
    private String lastName;

    private String competitionGender;

    @NotEmpty (message="Please enter a birth date.")
    private String birthDate;

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getCompetitionGender() { return competitionGender; }

    public void setCompetitionGender(String competitionGender) { this.competitionGender = competitionGender; }

    public String getBirthDate() { return birthDate; }

    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }

    public NewAthleteForm(){}

    public NewAthleteForm(String firstName, String lastName, String competitionGender, String birthDate) throws ParseException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.competitionGender = competitionGender;
        this.birthDate = birthDate;
    }

}
