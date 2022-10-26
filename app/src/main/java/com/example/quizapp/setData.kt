package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1,
           "Who was the first president of Kenya ?",

           "Daniel Arap Samoei",
           "Kalonzo Musyoka",
           "Raila Amollo Odinga",
           "Mzee Jomo Kenyatta",
           4
       )
       var question2 = QuestionData(
           2,
           "What is the staple food of Kenya ?",

           "Maize",
           "Coffee",
           "Tea",
           "Wheat",
           1
       )
       var question3 = QuestionData(
           3,
           "What does the color black in the National Flag of Kenya represent ?",

           "Blood",
           "People",
           "Peace",
           "Vegetation",
           2
       )
       var question4 = QuestionData(
           4,
           "When did Kenya get independence ?",

           "1962",
           "2001",
           "1963",
           "1960",
           3
       )

       var question5 = QuestionData(
           5,
           "Who was the first Deputy President of Kenya ?",

           "Mutula Kilonzo",
           "Kalonzo Musyoka",
           "Raila Amollo Odinga",
           "William Ruto",
           4
       )

       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       return que
   }
}