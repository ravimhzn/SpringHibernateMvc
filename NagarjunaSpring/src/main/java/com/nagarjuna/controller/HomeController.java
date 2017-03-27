package com.nagarjuna.controller;

import com.nagarjuna.models.AppUser;
import com.nagarjuna.models.Student;
import com.nagarjuna.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


@Controller
public class HomeController {

    @Autowired
    AppUserService appUserService;

    @ModelAttribute
    public void addCommonObject(Model model) {
        model.addAttribute("message", "Nagarjuna College of Infromation Technology");
    }

    @RequestMapping(value = "/createUser")
    public ModelAndView createUser() {
       appUserService.createUser(new AppUser(1, "admin", "admin"));
        ModelAndView mav = new ModelAndView("CreateUser");
        return mav;
    }

    @RequestMapping(value = "/home/{collegeName}/{StudentName}")
    public ModelAndView home(@PathVariable Map<String, String> pathVariables) {
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("message", "CollegeName : " + pathVariables.get("collegeName")
                + "\nStudent Name : " + pathVariables.get("StudentName"));
        return mav;
    }

    @RequestMapping(value = "/studentDetails")
    public ModelAndView studentDetails() {
        ModelAndView mav = new ModelAndView("StudentDetails");
        return mav;
    }

    //Example of modelAttribute annotation
    @RequestMapping(value = "/studentSucess", method = RequestMethod.GET)
    public ModelAndView home(@ModelAttribute("student") Student std, BindingResult result) {
        if (result.hasErrors()) {
            ModelAndView model1 = new ModelAndView("StudentDetails");
            return model1;
        }
        ModelAndView mav = new ModelAndView("AdmissionSucess");
        return mav;
    }


}
