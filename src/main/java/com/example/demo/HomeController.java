package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
//
//    @Autowired
//    AnswerRepository answerRepository;

    @GetMapping("/")
    public String getForm(Model model){
        Answer answer = new Answer();
        answer.setQuestion();

        model.addAttribute("answer", answer);

        return "questions";

    }

    @PostMapping("/process")
    public String processForm(@ModelAttribute Answer answer, Model model ){
        model.addAttribute("answer", answer);
        return "confirm";

    }
}
