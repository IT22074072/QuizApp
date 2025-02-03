package org.example.quizapp.Controller;

import org.example.quizapp.Model.Question;
import org.example.quizapp.Model.QuestionWrapper;
import org.example.quizapp.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    QuizService service;
    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title){

        return service.createQuiz(category, numQ, title);
    }

    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable int id){

        return service.getQuizQuestions(id);
    }

}
