package org.example.quizapp.Controller;

import org.example.quizapp.Model.Question;
import org.example.quizapp.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService service;

    @GetMapping("/allQuestions")
    public List<Question> getAllQuestions(){
        return service.getAllQuestions();
    }


}
