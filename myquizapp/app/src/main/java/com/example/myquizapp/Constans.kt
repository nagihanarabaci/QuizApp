package com.example.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWER : String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,"Görseldeki bayrak hangi ülkeye aittir ?",
            R.drawable.ic_flag_turkish,
            "Türkiye",
            "Fransa",
            "İtalya",
            "Arjantina",
            1
        )

        questionList.add(que1)
        val que2 = Question(
            2,"Görseldeki bayrak hangi ülkeye aittir ?",
            R.drawable.ic_flag_argentina,
            "Türkiye",
            "Fransa",
            "İtalya",
            "Arjantina",
            4
        )

        questionList.add(que2)
        val que3 = Question(
            3,"Görseldeki bayrak hangi ülkeye aittir ?",
            R.drawable.ic_flag_france,
            "Hindistan",
            "Arjantina",
            "İtalya",
            "Fransa",
            4
        )

        questionList.add(que3)
        val que4 = Question(
            4,"Görseldeki bayrak hangi ülkeye aittir ?",
            R.drawable.ic_flag_egypt,
            "Rusya",
            "Birleşik Krallık",
            "Mısır",
            "İrlanda",
            3
        )

        questionList.add(que4)
        val que5 = Question(
            5,"Görseldeki bayrak hangi ülkeye aittir ?",
            R.drawable.ic_flag_india,
            "Hindistan",
            "Fransa",
            "Rusya",
            "Kore",
            1
        )

        questionList.add(que5)
        val que6 = Question(
            6,"Görseldeki bayrak hangi ülkeye aittir ?",
            R.drawable.ic_flag_ireland,
            "İtalya",
            "İrlanda",
            "Türkiye",
            "Birleşik Krallık",
            2
        )

        questionList.add(que6)
        val que7 = Question(
            7,"Görseldeki bayrak hangi ülkeye aittir ?",
            R.drawable.ic_flag_italy,
            "Türkiye",
            "Kore",
            "İtalya",
            "Ukrayna",
            3
        )

        questionList.add(que7)
        val que8 = Question(
            8,"Görseldeki bayrak hangi ülkeye aittir ?",
            R.drawable.ic_flag_korea,
            "Fransa",
            "Ukrayna",
            "Kore",
            "İtalya",
            3
        )

        questionList.add(que8)

        val que9 = Question(
            9,"Görseldeki bayrak hangi ülkeye aittir ?",
            R.drawable.ic_flag_united_kingdom,
            "İrlanda",
            "Hindistan",
            "Mısır",
            "Birleşik Krallık",
            4
        )



        questionList.add(que9)

        return questionList
    }

}