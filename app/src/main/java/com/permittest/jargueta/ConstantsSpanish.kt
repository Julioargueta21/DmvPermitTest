package com.quizapp

import com.permittest.jargueta.Question
import com.permittest.jargueta.R


object ConstantsSpanish {

    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1,
            "¿Cuáles son los colores de una señal que te indica la distancia a la siguiente salida de una autopista?",
            R.drawable.empty_bg,
            "Amarillo con letras negras",
            "Negro con letras blancas",
            "Rojo con letras blancas",
            "Verde con letras blancas",
            4
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Tu automóvil comienza a derrapar en una carretera resbaladiza. Deberías:",
            R.drawable.empty_bg,
            "Frenar rápidamente y mantener el volante recto",
            "Bloquear tus frenos hasta que te hayas detenido por completo",
            "Girar en la dirección en la que quieres que vayan las ruedas delanteras",
            "Dirigirte hacia el costado de la carretera para salir del pavimento mojado",
            3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3,
            "¿Cuál de las siguientes afirmaciones es cierta acerca del BAC (contenido de alcohol en la sangre)?",
            R.drawable.empty_bg,
            "El alcoholímetro es una prueba del BAC de una persona",
            "Se necesita una prueba química para el BAC para una condena por alcohol",
            "Los niveles de BAC se reducen por la condición física de una persona",
            "Después de beber, el café o una ducha fría reducirán tu BAC",
            1
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Puedes cruzar una línea blanca sólida en la autopista:",
            R.drawable.empty_bg, "Siempre que quieras",
            "Si las condiciones de tráfico lo requieren",
            "Solo para girar hacia una entrada",
            "Solo para hacer un giro en U",
            2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "¿Qué significa esta señal de tráfico?", R.drawable.ic_stop,
            "Reducir la velocidad y prepararse para detenerse solo si se acercan automóviles",
            "Detenerse por completo y luego continuar cuando sea seguro hacerlo",
            "Proceder con cuidado a través de la intersección, sin detenerse siempre",
            "Detenerse solo por el tráfico en una carretera que se cruza",
            2
        )
        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "Cuando quieres hacer un giro a la derecha, tu automóvil debe estar:",
            R.drawable.empty_bg,
            "Cerca del centro de la calle",
            "Cerca del lado izquierdo de la calle",
            "Cerca del lado derecho de la calle",
            "Pasado el centro de la intersección cuando comienzas a girar",
            1
        )
        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "Después de adelantar a otro vehículo en una carretera de dos carriles, debes:",
            R.drawable.empty_bg,
            "Volver inmediatamente al carril derecho",
            "Permanecer en el carril izquierdo hasta que desees cambiar de carril",
            "Continuar conduciendo en el carril izquierdo para mantener tu posición",
            "Mantener la misma velocidad en el carril izquierdo",
            1
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "¿Qué significa esta señal?",
            R.drawable.ic_hospital,
            "Cambios en la carretera a la derecha",
            "Senderos para caminatas a la derecha",
            "Hotel a la derecha",
            "Hospital a la derecha",
            4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "Si un semáforo muestra una luz amarilla intermitente, debes:",
            R.drawable.empty_bg,
            "Detenerte y esperar a que cambie a verde",
            "Acelerar para pasar antes de que cambie a rojo",
            "Continuar con precaución si no hay tráfico cruzando",
            "Detenerte solo si hay tráfico cruzando",
            3
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "¿Qué significa esta señal de tráfico?",
            R.drawable.ic_yield,
            "Ceder el paso a otros vehículos",
            "Detenerse por completo",
            "Prohibido girar a la derecha",
            "Velocidad máxima permitida",
            1
        )

        questionsList.add(que10)

        // 11
        val que11 = Question(
            11, "¿Cuándo debes usar tus luces de cruce (bajas) durante el día?",
            R.drawable.empty_bg,
            "Nunca, solo debes usar las luces de cruce (bajas) por la noche",
            "Cuando hay condiciones de poca visibilidad, como lluvia o niebla",
            "Siempre que conduzcas durante el día",
            "Solo cuando el tráfico es intenso",
            2
        )

        questionsList.add(que11)
        // 12
        val que12 = Question(
            12, "¿En qué afecta el alcohol?",
            R.drawable.empty_bg,
            "Recuperación del deslumbramiento por las luces delanteras",
            "Tiempo de reacción",
            "Juicio de distancias",
            "Todas las opciones anteriores",
            4
        )

        questionsList.add(que12)
        // 13
        val que13 = Question(
            13, "A motorist approaching a bicyclist should:",
            R.drawable.empty_bg,
            "Speed up to pass him",
            "Proceed as usual",
            "Swerve into the opposite lane",
            "Exercise extreme caution",
            4
        )

        questionsList.add(que13)
        // 14
        val que14 = Question(
            14,
            "Cuando te preparas para salir de una autopista, debes comenzar a usar tu señal de giro:",
            R.drawable.empty_bg,
            "Justo cuando llegues a la rampa de salida",
            "50 pies antes de la rampa de salida",
            "100 pies antes de la rampa de salida",
            "Cuando veas autos detrás de ti en el carril de salida",
            3
        )

        questionsList.add(que14)
        // 15
        val que15 = Question(
            15, "Cuando quieres adelantar y pasar a otro vehículo debes:",
            R.drawable.empty_bg,
            "Esperar una señal del otro conductor",
            "Cambiar de carril rápidamente para que el otro conductor te vea",
            "Señalizar y pasar cuando sea seguro hacerlo",
            "Mantenerse cerca detrás para necesitar menos tiempo para pasar",
            3
        )

        questionsList.add(que15)

        val que16 = Question(
            16, "Si un neumático explota, lo correcto es:",
            R.drawable.empty_bg,
            "Acelerar para ganar tracción y luego tirar hacia la derecha",
            "Sostener firmemente el volante y soltar el acelerador",
            "Aplicar los frenos y luego cambiar a neutral",
            "Cambiar a neutral y luego aplicar los frenos",
            2
        )
        questionsList.add(que16)
        val que17 = Question(
            17,
            "El brazo y la mano izquierda del conductor están extendidos hacia abajo. Esta señal manual significa que el conductor planea:",
            R.drawable.empty_bg,
            "Girar a la izquierda",
            "Girar a la derecha",
            "Detenerse",
            "Arrancar",
            3
        )
        questionsList.add(que17)
        val que18 = Question(
            18, "Beber alcohol y conducir es:",
            R.drawable.empty_bg,
            "Un problema menor de seguridad vial",
            "Un problema grave de seguridad vial",
            "Seguro si solo tomas unas pocas bebidas",
            "Solo peligroso para el conductor que bebe",
            2
        )
        questionsList.add(que18)

        val que19 = Question(
            19,
            "Un ciclista difiere de un conductor de vehículo motorizado en que no está obligado a:",
            R.drawable.empty_bg,
            "Cumplir las mismas leyes de tránsito",
            "Señalizar todas las vueltas",
            "Informar accidentes que resulten en lesiones graves",
            "Asegurar la bicicleta",
            4
        )
        questionsList.add(que19)

        val que192 = Question(
            20, "Una señal con forma de diamante es una:",
            R.drawable.empty_bg,
            "Señal de peligro en la carretera",
            "Sitio de ruta interestatal",
            "Señal de cruce escolar",
            "Señal de límite de velocidad",
            1
        )
        questionsList.add(que192)

        val que21 = Question(
            21, "Esta señal significa",
            R.drawable.ic_slippery,
            "No bebas si vas a conducir",
            "Resbaladizo cuando está mojado",
            "Curva en la carretera por delante",
            "Te estás acercando a una colina",
            2
        )
        questionsList.add(que21)

        val que22 = Question(
            22,
            "La ley que requiere que cada conductor tenga cuidado de evitar colisiones con un vehículo de emergencia o peligro autorizado se llama:",
            R.drawable.empty_bg,
            "Ley de Brianna",
            "Ley de luz verde",
            "Ley de moverse hacia un lado",
            "Derecho de paso",
            3
        )
        questionsList.add(que22)

        val que23 = Question(
            23,
            "Esta señal significa:",
            R.drawable.ic_no_uturn,
            "No girar a la izquierda",
            "No detenerse",
            "No hacer un giro en U",
            "Desvío por delante",
            3
        )
        questionsList.add(que23)

        val que24 = Question(
            24,
            "¿Cuál de las siguientes afirmaciones se aplica a todas las situaciones de emergencia al conducir?",
            R.drawable.empty_bg,
            "Aplica los frenos de inmediato",
            "Piensa antes de actuar",
            "Gira el volante bruscamente en la dirección opuesta a la situación",
            "Acelera más allá de la situación",
            2
        )
        questionsList.add(que24)

        val que25 = Question(
            25,
            "Quieres retroceder desde tu entrada. Ves a niños jugando cerca. Antes de comenzar a mover tu auto, debes:",
            R.drawable.empty_bg,
            "Acelerar el motor para advertir a los niños que te estás moviendo",
            "Tocar la bocina para que los niños te escuchen",
            "Caminar hacia la parte trasera del auto para asegurarte de que el camino esté despejado",
            "Decirles a los niños que se alejen de la entrada",
            3
        )
        questionsList.add(que25)

        val que26 = Question(
            26,
            "¿Qué efecto tiene beber alcohol y tomar un medicamento recetado o medicamento de venta libre?",
            R.drawable.empty_bg,
            "El medicamento reduce el efecto del alcohol",
            "El alcohol ayudará al medicamento a curar el resfriado",
            "La combinación podría multiplicar los efectos del alcohol",
            "No hay efecto, son sustancias diferentes",
            3
        )
        questionsList.add(que26)

        val que27 = Question(
            27,
            "Una de las reglas de la conducción defensiva es:",
            R.drawable.empty_bg,
            "Mira hacia adelante mientras conduces",
            "Mantente alerta y mueve tus ojos",
            "Espera que otros conductores compensen tus errores",
            "Ten confianza en que puedes evitar el peligro en el último minuto",
            2
        )
        questionsList.add(que27)

        val que28 = Question(
            28,
            "En este estado, ¿qué BAC (contenido de alcohol en la sangre) es evidencia de intoxicación?",
            R.drawable.empty_bg,
            "0.05%",
            "0.03%",
            "0.10%",
            "0.08%",
            4
        )
        questionsList.add(que28)

        val que29 = Question(
            29,
            "Esta señal significa:",
            R.drawable.ic_yield,
            "Reduce la velocidad si se acerca un vehículo de emergencia",
            "Mira en ambas direcciones al cruzar la intersección",
            "Siempre detente por completo en la intersección",
            "Reduce la velocidad y prepárate para detenerte si es necesario",
            4
        )
        questionsList.add(que29)

        val que30 = Question(
            30,
            "Esta señal es una advertencia de que te estás acercando a:",
            R.drawable.ic_railcrossing,
            "Una intersección",
            "Un cruce de peatones",
            "Un cruce de ferrocarril",
            "Una zona de voladuras",
            3
        )
        questionsList.add(que30)

        val que31 = Question(
            31,
            "Las señales que advierten 'carril cerrado adelante' pueden indicar una zona de trabajo por delante. Debes:",
            R.drawable.empty_bg,
            "Unir tu vehículo al carril correcto cuando sea seguro",
            "Conducir hasta el final del carril cerrado antes de intentar unirte",
            "Entender que esta señal es solo una sugerencia y continuar en el carril",
            "Acelerar para unirte lo más rápido posible",
            1
        )
        questionsList.add(que31)

        val que32 = Question(
            32,
            "Si un tren que se acerca está lo suficientemente cerca o va lo suficientemente rápido como para representar un peligro, debes:",
            R.drawable.empty_bg,
            "Reducir la velocidad y proceder con precaución",
            "No cruzar las vías hasta que el tren haya pasado por completo",
            "Cruzar las vías bajo tu propio riesgo",
            "Buscar una ruta alternativa a través de las vías",
            2
        )
        questionsList.add(que32)

        val que33 = Question(
            33,
            "Estás esperando en la intersección para completar un giro a la izquierda. Debes:",
            R.drawable.empty_bg,
            "Señalizar y mantener tus ruedas giradas hacia la izquierda",
            "Señalizar y mantener tus ruedas rectas",
            "Encender tus luces altas para que el conductor te deje pasar",
            "Conducir alrededor de la parte trasera de un automóvil si te bloquea",
            2
        )
        questionsList.add(que33)

        val que34 = Question(
            34,
            "Esta señal significa:",
            R.drawable.ic_merginglane,
            "Tráfico de un solo sentido",
            "Intersección adelante",
            "Tráfico que se une desde la derecha",
            "Curvas en la autopista adelante",
            3
        )
        questionsList.add(que34)

        val que35 = Question(
            35,
            "Puedes conducir alrededor o debajo de una barrera que se está bajando o levantando en un cruce de ferrocarril:",
            R.drawable.empty_bg,
            "Siempre y cuando un tren que se aproxima no esté demasiado cerca",
            "Si tu vehículo puede hacerlo sin dañar la barrera",
            "Si primero miras cuidadosamente en ambas direcciones",
            "Bajo ninguna circunstancia",
            4
        )
        questionsList.add(que35)

        val que36 = Question(
            36,
            "Tienes el derecho de paso cuando estás:",
            R.drawable.empty_bg,
            "Entrando a una rotonda",
            "Retrocediendo desde una entrada de vehículos",
            "Saliendo de un espacio de estacionamiento",
            "Ya dentro de una rotonda",
            4
        )
        questionsList.add(que36)

        val que37 = Question(
            37,
            "Un automovilista debe saber que un ciclista que circula por una carretera debe:",
            R.drawable.empty_bg,
            "Circular por el lado derecho de la carretera",
            "Circular por el lado de la carretera enfrentando el tráfico",
            "Circular por cualquier lado de la carretera",
            "Circular por el lado de la carretera con menos tráfico",
            1
        )
        questionsList.add(que37)

        val que38 = Question(
            38,
            "¿Cuál de los siguientes factores influye en los efectos del alcohol?",
            R.drawable.empty_bg,
            "La cantidad de comida en el estómago",
            "El peso corporal de una persona",
            "Cuánto tiempo pasa entre las bebidas",
            "Todas las opciones anteriores",
            4
        )
        questionsList.add(que38)

        val que39 = Question(
            39,
            "¿Qué debes hacer si te encuentras con un autobús escolar con sus luces rojas intermitentes y el brazo de parada extendido?",
            R.drawable.empty_bg,
            "Detenerte por completo y esperar hasta que el autobús vuelva a moverse",
            "Reducir la velocidad y proceder con precaución",
            "Tocar la bocina para alertar al conductor del autobús",
            "Pasar rápidamente el autobús para evitar retrasos",
            1
        )
        questionsList.add(que39)


        val que40 = Question(
            40,
            "En viajes largos, puedes prevenir la somnolencia mediante:",
            R.drawable.empty_bg,
            "Encender la radio del coche",
            "Reducir la velocidad para poder reaccionar mejor",
            "Hacer paradas regulares para descansar",
            "Mover los ojos de un lado a otro mientras conduces",
            3
        )
        questionsList.add(que40)

        return questionsList
    }
}