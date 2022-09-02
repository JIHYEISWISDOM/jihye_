package com.example.jihye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class firstcontroller {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "지혜");
        return "greetings"; //머스태치 앞에 이름만 적어주면 알아서 찾아줌
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "지혜에");
        return  "goodbye";
    }
}
