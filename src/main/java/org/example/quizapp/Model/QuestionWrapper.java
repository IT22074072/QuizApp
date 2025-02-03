package org.example.quizapp.Model;

import org.springframework.stereotype.Component;


public class QuestionWrapper {
    private int id;
    private String questionTitle;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;

    public QuestionWrapper(int id, String questionTitle, String opt1, String opt2, String opt3, String opt4) {
        this.id = id;
        this.questionTitle = questionTitle;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
    }

    public QuestionWrapper() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public String getOpt4() {
        return opt4;
    }

    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }

    @Override
    public String toString() {
        return "QuestionWrapper{" +
                "id=" + id +
                ", questionTitle='" + questionTitle + '\'' +
                ", opt1='" + opt1 + '\'' +
                ", opt2='" + opt2 + '\'' +
                ", opt3='" + opt3 + '\'' +
                ", opt4='" + opt4 + '\'' +
                '}';
    }
}
