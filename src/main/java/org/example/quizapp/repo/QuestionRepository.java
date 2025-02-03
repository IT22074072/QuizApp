package org.example.quizapp.repo;

import org.example.quizapp.Model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

    //JPA is smart enough to find based on category since it's a column
    List<Question> findByCategory(String category);

    //?1 → Positional parameter that binds to the first integer parameter (numQ)
    @Query("SELECT q FROM Question q WHERE q.category = ?1 ORDER BY RANDOM() LIMIT ?2")
    List<Question> findRandomQuestionsByCategory(String category, int numQ);

}
