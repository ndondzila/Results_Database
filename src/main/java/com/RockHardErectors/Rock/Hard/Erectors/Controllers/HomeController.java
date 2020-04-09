package com.RockHardErectors.Rock.Hard.Erectors.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String displayLandingPage(){
        return "index";
    }

    @RequestMapping(value = "meets", method = RequestMethod.GET)
    public String displayMeets(){
        return "DataView/meets";
    }

    @RequestMapping(value = "data", method = RequestMethod.GET)
    public String displayData(){ return "data.JSON";}
}
