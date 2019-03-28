package com.example.lenovo_pc.quiz;

public class QuestionLibrary2 {

    private String mQuestions[] = {
            "Kto to jest?" ,
            "Co to za owoc?" ,
            "Co to za pojazd?",
            "Co to za rzecz?",
            "Co to za przedmiot?",
            "Co to za przedmiot?"
    };






    public String getQuestion(int a) {
        String question = mQuestions[a];
        return  question;

    }



}
