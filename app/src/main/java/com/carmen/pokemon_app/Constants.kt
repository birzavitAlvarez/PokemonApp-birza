package com.carmen.pokemon_app

object Constants {
    const val USER_NAME : String = "nombre_de_usuario"
    const val TOTAL_QUESTIONS: String = "total_de_preguntas"
    const val CORRECT_ANSWERS: String = "respuestas_correctas"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "¿Quien es ese Pókemon?",
            R.drawable.ic_articuno,
            "Charmander", "Articuno",
            2
        )
        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "¿Quien es ese Pókemon?",
            R.drawable.ic_blastoise,
            "Blastoise", "Nidoqueen",
             1
        )
        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "¿Quien es ese Pókemon?",
            R.drawable.ic_charizard,
            "Raichu", "Charizard",
            2
        )
        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "¿Quien es ese Pókemon?",
            R.drawable.ic_moltres,
            "Moltres", "Zapdos",
            1
        )
        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "¿Quien es ese Pókemon?",
            R.drawable.ic_pikachu,
            "Pikachu", "Evee",
            1
        )
        questionsList.add(que5)


        return questionsList
    }
}