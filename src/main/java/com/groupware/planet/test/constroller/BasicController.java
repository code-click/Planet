package com.groupware.planet.test.constroller;

import com.groupware.planet.test.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BasicController {
    private final TestService testService;

    @GetMapping("/")
    public String test(Model model){
        model.addAttribute("test", testService.test());
        return "index";
    }
}
