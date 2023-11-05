package raf.tabiin.onlineschool.onlineschool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@RequestMapping("/api")
public class OnlineSchoolController {

    @GetMapping("/")
    public String console() {
        return "registration";
    }

    private String hiMessage =
            "https://github.com/Raf0707/RafConsole/blob/master/README.md";

    @RequestMapping(value = "/console", method = RequestMethod.GET)
    public String testConsole() {
        return hiMessage;
    }
}
