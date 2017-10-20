package ru.er76.helpdesk;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class MainController {

    @RequestMapping("/helpdesk/hello")
    public String index(Model model) {
        model.addAttribute("name", "sdgsdg");
        return "hello";
    }

}
