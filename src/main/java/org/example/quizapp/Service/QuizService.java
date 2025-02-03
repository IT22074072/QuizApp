package org.example.quizapp.Service;

import org.example.quizapp.Model.Question;
import org.example.quizapp.Model.QuestionWrapper;
import org.example.quizapp.Model.Quiz;
import org.example.quizapp.repo.QuestionRepository;
import org.example.quizapp.repo.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    QuizRepository quizRepo;

    @Autowired
    QuestionRepository questionRepo;


    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        List<Question> questions = questionRepo.findRandomQuestionsByCategory(category, numQ);
        System.out.println("Questions found: " + questions.size()); // Debugging line
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizRepo.save(quiz);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(int id) {
        Optional<Quiz> quiz= quizRepo.findById(id);
        List<Question> questionsFromDB = quiz.get().getQuestions();
        List<QuestionWrapper> questionsForUser = new ArrayList<>();
        for(Question q: questionsFromDB) {

            QuestionWrapper qw = new QuestionWrapper(q.getId(), q.getQuestionTitle(),q.getOpt1(), q.getOpt2(), q.getOpt3(), q.getOpt4());
            questionsForUser.add(qw);
        }


        return new ResponseEntity<>(questionsForUser, HttpStatus.OK);
    }
}
