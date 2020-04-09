package com.RockHardErectors.Rock.Hard.Erectors.Controllers;

import com.RockHardErectors.Rock.Hard.Erectors.Models.Athlete;
import com.RockHardErectors.Rock.Hard.Erectors.Models.Data.AthleteDAO;
import com.RockHardErectors.Rock.Hard.Erectors.Models.Forms.NewAthleteForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;
import java.text.ParseException;


@Controller
public class AthleteController {

    @Autowired
    private AthleteDAO athleteDAO;

    @RequestMapping(value = "new-athlete", method = RequestMethod.GET)
    public String displayNewAthleteForm(Model model) {
        model.addAttribute(new NewAthleteForm());
        return "DataEntry/newAthletePage";
    }

    @RequestMapping(value = "new-athlete", method = RequestMethod.POST)
    public String processNewAthleteForm(@ModelAttribute @Valid NewAthleteForm newAthlete, Errors errors, Model model) {

        if(errors.hasErrors()){
            model.addAttribute("message", "Failed to add athlete, please check values");
            model.addAttribute("resultClass", "errorMessage");
            return "DataEntry/newAthletePage";
        }

        Athlete athlete = new Athlete(newAthlete.getFirstName(), newAthlete.getLastName(), newAthlete.getCompetitionGender(), newAthlete.getBirthDate());
        athleteDAO.save(athlete);
        model.addAttribute("message", "Successfully added athlete: " + newAthlete.getFirstName() + " " + newAthlete.getLastName());
        model.addAttribute("resultClass", "successMessage");
        model.addAttribute(new NewAthleteForm());
        return "DataEntry/newAthletePage";
    }


}
