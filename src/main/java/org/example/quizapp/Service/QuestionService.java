package org.example.quizapp.Service;

import org.example.quizapp.Model.Question;
import org.example.quizapp.repo.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository repo;
    public List<Question> getAllQuestions() {
        return repo.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return repo.findByCategory(category);
    }

    public void addQuestion(Question question) {
        repo.save(question);
    }
}
