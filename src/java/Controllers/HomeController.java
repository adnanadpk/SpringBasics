/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Beans.basicClass;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 *
 * @author Zeeshan
 */
@Controller
@RequestMapping({"/", "/*.htm", "/homepage"})
public class HomeController {

    @RequestMapping(value = "/", method = GET)
    public String aboutUs(basicClass obj) {
        System.out.println("HomeController >>>>>>>>>>>>>>>> aboutUs");
        return "aboutus";
    }

    @RequestMapping(value = "redirect", method = POST)
    public String redirect(@Valid basicClass subscriber, BindingResult result, Model m) {
        if (result.hasErrors()) {
            return "aboutus";
        }
        System.out.println("HomeController >>>>>>>>>>>>>>>> redirect");
        m.addAttribute("firstName", "zeeshan");
        return "index";
    }

    @RequestMapping(value = "me", method = GET)
    public String contact() {
        System.out.println("HomeController >>>>>>>>>>>>>>>> contact");
        return "contactUs";
    }

    @RequestMapping(value = "sample", method = GET)
    public String sample() {
        System.out.println("HomeController >>>>>>>>>>>>>>>> contact");
        return "/homepage/sample";
    }
}
