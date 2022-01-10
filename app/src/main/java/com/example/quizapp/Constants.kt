package com.example.quizapp

object Constants {
 const val User_Name :String = "user_name"
    const val Total_Question  :String = "total_question"
    const val CORRECT_ANSWERS :String = "correct_answers"
    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to ?",
            R.drawable.ic_flag_of_argetina,
            "Argetina",
            "Australia",
            "Armenia",
            "Austria",
            1
        )
        questionsList.add(que1)
        val que2 = Question(
            2,
            "What country does this flag belong to ?",
            R.drawable.ic_flag_of_america,
            "Argetina",
            "Australia",
            "America",
            "Austria",
            3
        )
        questionsList.add(que2)
        val que3 = Question(
            3,
            "What country does this flag belong to ?",
            R.drawable.ic_flag_of_russia,
            "Argetina",
            "Australia",
            "Armenia",
            "russia",
            4
        )
        questionsList.add(que3)
        val que4 = Question(
            4,
            "What country does this flag belong to ?",
            R.drawable.ic_flag_of_france,
            "Argetina",
            "Australia",
            "Armenia",
            "france",
            4
        )
        questionsList.add(que4)
        val que5 = Question(
            5,
            "What country does this flag belong to ?",
            R.drawable.ic_flag_of_india,
            "Argetina",
            "India",
            "Armenia",
            "Austria",
            2
        )
        questionsList.add(que5)
        val que6 = Question(
            6,
            "What country does this flag belong to ?",
            R.drawable.ic_flag_of_argetina,
            "Argetina",
            "Australia",
            "Armenia",
            "Austria",
            1
        )
        questionsList.add(que6)
        val que7 = Question(
            7,
            "What country does this flag belong to ?",
            R.drawable.ic_flag_of_germany,
            "Argetina",
            "Germany",
            "Armenia",
            "Austria",
            2
        )


        questionsList.add(que7)
        return questionsList
    }
}