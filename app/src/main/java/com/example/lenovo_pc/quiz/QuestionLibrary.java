package com.example.lenovo_pc.quiz;

public class QuestionLibrary {

    private String mQuestions[] = {
            "Kto to jest?" ,
            "Co to za owoc?" ,
            "Co to za pojazd?",
            "Co to za rzecz?",
            "Co to za przedmiot?",
            "Co to za przedmiot?"
    };

    private String mChoices[][]={
            {"Tata","Mama","Babcia"},
            {"Jablko","Pomarancza","Truskawka"},
            {"Helikopter","Samochod","Rower"},
            {"Kapec","Doniczka","Pilka"},
            {"Krzeslo","Fotel","Stol"},
            {"Krzeslo","Fotel","Stol"}


    };



    private String mCorrectAnswers[] = {"Mama","Jablko","Samochod","Pilka","Krzeslo","Krzeslo"};


    public String getQuestion(int a) {
        String question = mQuestions[a];
        return  question;

    }

    public String getImage(int a) {
        String image = mQuestions[a];
        return  image;

    }

    public String getChoice1(int a){
        String choice1 = mChoices[a][0];
        return  choice1;
    }

    public String getChoice2(int a){
        String choice2 = mChoices[a][1];
        return  choice2;
    }
    public String getChoice3(int a){
        String choice3 = mChoices[a][2];
        return  choice3;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
