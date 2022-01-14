package com.groupware.planet.test.constroller;

import com.groupware.planet.test.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/test")
public class BasicController {
    private final TestService testService;

    @GetMapping("/test")
    public String test(Model model){
        model.addAttribute("test", testService.test());
        return "index";
    }
}
