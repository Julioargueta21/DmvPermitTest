package com.quizapp

import com.permittest.jargueta.Question
import com.permittest.jargueta.R


object Constants {

    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "What are the colors of a sign which tells you the distance to the next exit of a highway?",
            R.drawable.empty_bg,
            "Yellow with black letters",
            "Black with white letters",
            "Red with white letters",
            "Green with white letters", 4
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "Your car starts to skid on a slippery road. You should:",
            R.drawable.empty_bg,
            "Brake quickly and keep the wheel straight",
            "Lock your brakes until you have come to a complete stop",
            "Steer in the direction you want the front wheels to go",
            "Steer toward the side of the road to get off the wet pavement", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Which of the following statements is true about BAC (blood alcohol content)?",
            R.drawable.empty_bg,
            "The breathalyzer is a test of a person's BAC",
            "A chemical test for BAC is needed for an alcohol conviction",
            "BAC levels are reduced by a person's physical fitness",
            "After drinking, coffee or a cold shower will lower your BAC", 1
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "You may cross a single solid white line in the highway:",
            R.drawable.empty_bg, "Whenever you want to",
            "If traffic conditions require",
            "Only to turn into a driveway",
            "Only to make a u-turn", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What does this road sign mean?", R.drawable.ic_stop,
            "Slow down and prepare to stop only if cars are approaching you",
            "Come to a full stop, then go when it is safe to do so",
            "Proceed carefully through the intersection, not always stopping",
            "Stop only for traffic on an intersecting road", 2
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6,"When you want to make a right turn, your car must be:",
            R.drawable.empty_bg,
            "Near the center of the street",
            "Close to the left side of the street",
            "Close to the right side of the street",
            "Past the center of the intersection when you begin to turn", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "After you have passed a car you should return to the right lane when you:",
            R.drawable.empty_bg,
            "See the front bumper of the other car in your mirror",
            "Have put your turn signal on",
            "Have turned your headlights on",
            "See the other car's headlights come on", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8,"This sign means:",
            R.drawable.ic_hospital,
            "Highway changes ahead to the right",
            "Hiking trails ahead to the right",
            "Hotel ahead to the right",
            "Hospital ahead to the right", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "If you drive past your exit on an expressway, you should:",
            R.drawable.empty_bg,
            "Pull onto the shoulder, then back up to the exit",
            "Drive to the next exit and leave the expressway",
            "Make a U-turn at the nearest emergency turn area",
            "Make a U-turn at the next service area", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "When you see an emergency vehicle parked, stopped, or standing with its emergency or hazard lights activated on a highway or parkway, you should:",
            R.drawable.empty_bg,
            "Move out of the lane closest to the emergency vehicle, if possible to do so safely",
            "Make a U-turn to avoid the vehicle",
            "Maintain your speed and lane position if possible",
            "Stop behind the vehicle and activate your hazard lights", 1
        )

        questionsList.add(que10)

        // 11
        val que11 = Question(
            11, "If you drive past your exit on an expressway, you should:",
            R.drawable.empty_bg,
            "Pull onto the shoulder, then back up to the exit",
            "Drive to the next exit and leave the expressway",
            "Make a U-turn at the nearest emergency turn area",
            "Make a U-turn at the next service area", 2
        )

        questionsList.add(que11)
        // 12
        val que12 = Question(
            12, "Which of the following does alcohol affect?",
            R.drawable.empty_bg,
            "Recovery from hadlight glare",
            "Reaction time",
            "Judgment of distances",
            "All of these choices", 4
        )

        questionsList.add(que12)
        // 13
        val que13 = Question(
            13, "A motorist approaching a bicyclist should:",
            R.drawable.empty_bg,
            "Speed up to pass him",
            "Proceed as usual",
            "Swerve into the opposite lane",
            "Exercise extreme caution", 4
        )

        questionsList.add(que13)
        // 14
        val que14 = Question(
            14, "When you get ready to leave an expressway, you should begin to use your turn signal:", R.drawable.empty_bg,
            "Just as you get to the exit ramp",
            "50 feet before the exit ramp",
            "100 feet before the exit ramp",
            "When you see cars behind you in the exit lane", 3
        )

        questionsList.add(que14)
        // 15
        val que15 = Question(
            15, "When you want to overtake and pass another vehicle you should:",
            R.drawable.empty_bg,
            "Wait for a signal from the other driver",
            "Change lanes quickly so the other driver will see you",
            "Signal and pass when safe to do so",
            "Stay close behind so you need less time to pass", 3
        )

        questionsList.add(que15)

        val que16 = Question(
            16,
            "If a tire blows out, the proper thing to do is:",
            R.drawable.empty_bg,
            "Speed up to gain traction and then pull to the right",
            "Hold the steering wheel firmly, and ease up on the gas",
            "Apply the brakes, then shift into neutral",
            "Shift into neutral, then apply the brakes",
            2
        )
        questionsList.add(que16)
        val que17 = Question(
            17,
            "The driver's left arm and hand are extended downward.  This hand signal means that the driver plans to:",
            R.drawable.empty_bg,
            "Turn left",
            "Turn right",
            "Stop",
            "Start up",
            3
        )
        questionsList.add(que17)
        val que18 = Question(
            18,
            "Drinking alcohol and driving is:",
            R.drawable.empty_bg,
            "A minor traffic safety problem",
            "A serious traffic safety problem",
            "Safe if you only have a few drinks",
            "Only dangerous to the driver who drinks",
            2
        )
        questionsList.add(que18)

        val que19 = Question(
            19,
            "A bicyclist differs from a motorist in that he isn't required to:",
            R.drawable.empty_bg,
            "Obey the same traffic laws",
            "Signal all turns",
            "Report accidents resulting in serious injury",
            "Insure the bicycle",
            4
        )
        questionsList.add(que19)

        val que192 = Question(
            20,
            "A diamond-shaped sign is a:",
            R.drawable.empty_bg,
            "Road hazard sign",
            "Interstate route site",
            "School crossing sign",
            "Speed limit sign",
            1
        )
        questionsList.add(que192)

        val que21 = Question(
            21,
            "This sign means",
            R.drawable.ic_slippery,
            "Don't drink if you are going to drive",
            "Slippery when wet",
            "Road curves ahead",
            "You are approaching a hill",
            2
        )
        questionsList.add(que21)

        val que22 = Question(
            22,
            "The law that requires every driver to exercise care to avoid colliding with an authorized emergency or hazard vehicle is called:",
            R.drawable.empty_bg,
            "Brianna’s Law",
            "The Green Light Law",
            "Move Over Law",
            "Right of Way",
            3
        )
        questionsList.add(que22)

        val que23 = Question(
            23,
            "This sign means:",
            R.drawable.ic_no_uturn,
            "No left turn",
            "No stopping",
            "No U-turn",
            "Detour ahead",
            3
        )
        questionsList.add(que23)

        val que24 = Question(
            24,
            "Which of the following statements applies to all driving emergency situations?",
            R.drawable.empty_bg,
            " Apply your brakes immediately",
            "Think before you act",
            "Jerk your wheel to the opposite direction of the situation",
            "Speed past the situation",
            2
        )
        questionsList.add(que24)

        val que25 = Question(
            25,
            "You want to back out of your driveway.  You see children playing nearby.  Before you start to move your car you should:",
            R.drawable.empty_bg,
            "Race your motor to warn the children that you are moving",
            "Sound your horn so the children will hear you",
            "Walk to the back of the car to be sure the way is clear",
            "Tell the children to stay away from the driveway",
            3
        )
        questionsList.add(que25)

        val que26 = Question(
            26,
            "What effect does drinking alcohol and taking a prescription drug or over the counter medicine have?",
            R.drawable.empty_bg,
            "The medicine reduces the effect of the alcohol",
            "The alcohol will help the medicine cure the cold",
            "The combination could multiply the effects of the alcohol",
            "No effect, they are difference substances",
            3
        )
        questionsList.add(que26)

        val que27 = Question(
            27,
            "One of the rules of defensive driving is:",
            R.drawable.empty_bg,
            "Look straight ahead as you drive",
            "Stay alert and keep your eyes moving",
            "Expect that other drivers will make up for your errors",
            "Be confident that you can avoid danger at the last minute",
            2
        )
        questionsList.add(que27)

        val que28 = Question(
            28,
            "In this state, what BAC (blood alcohol content) is evidence of intoxication?",
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
            "This sign means:",
            R.drawable.ic_yield,
            "Slow down if an emergency vehicle is approaching",
            "Look both ways as you cross the intersection",
            "Always come to a full stop at the intersection",
            "Slow down and be prepared to stop if necessary",
            4
        )
        questionsList.add(que29)

        val que30 = Question(
            30,
            "This sign is a warning that you are approaching:",
            R.drawable.ic_railcrossing,
            "An intersection",
            "A crosswalk",
            "A railroad crossing",
            "A blasting zone",
            3
        )
        questionsList.add(que30)

        val que31 = Question(
            31,
            "Signs that warn 'lane closed ahead' may indicate a work zone ahead. You should:",
            R.drawable.empty_bg,
            "Merge your vehicle into the correct lane when it is safe",
            "Drive to the end of the closed lane before attempting to merge",
            "Understand that this sign is merely a suggestion and continue in the lane",
            "Speed up to merge as quickly as possible",
            1
        )
        questionsList.add(que31)

        val que32 = Question(
            32,
            "If an approaching train is near enough or going fast enough to be a danger, you must:",
            R.drawable.empty_bg,
            "Slow down and proceed with caution",
            "Not cross the tracks until the train has completely passed",
            "Cross the tracks at your own risk",
            "Find an alternative route across tracks",
            2
        )
        questionsList.add(que32)

        val que33 = Question(
            33,
            "You are waiting in the intersection to complete a left turn. You should:",
            R.drawable.empty_bg,
            "Signal and keep your wheels turned to the left",
            "Signal and keep your wheels straight",
            "Flash your headlights so the driver will let you through",
            "Drive around the rear of a car if it blocks you",
            2
        )
        questionsList.add(que33)

        val que34 = Question(
            34,
            "This sign means:",
            R.drawable.ic_merginglane,
            "One-way traffic",
            "Intersection ahead",
            "Merging traffic from the right",
            "Highway curves ahead",
            3
        )
        questionsList.add(que34)

        val que35 = Question(
            35,
            "You may drive around or under a gate that is being lowered or raised at a railroad crossing:",
            R.drawable.empty_bg,
            "As long as an approaching train is not too close",
            "If your vehicle can do so without damaging the gate",
            "If you first look carefully in both directions",
            "Under no circumstances",
            4
        )
        questionsList.add(que35)

        val que36 = Question(
            36,
            "You have the right of way when you are:",
            R.drawable.empty_bg,
            "Entering a traffic circle",
            "Backing out of a driveway",
            "Leaving a parking space",
            "Already in a traffic circle",
            4
        )
        questionsList.add(que36)

        val que37 = Question(
            37,
            "A motorist should know that a bicyclist operating on a roadway must:",
            R.drawable.empty_bg,
            "Ride on the right side of the road",
            "Ride on the side of the road facing traffic",
            "Ride on either side of the road",
            "Ride on the side of the road with the least traffic",
            1
        )
        questionsList.add(que37)

        val que38 = Question(
            38,
            "Which of the following influence the effects of alcohol?",
            R.drawable.empty_bg,
            "The amount of food in the stomach",
            "The body weight of an individual",
            "How much time passes between drinks",
            "All three choices",
            4
        )
        questionsList.add(que38)

        val que39 = Question(
            29, "What should you do if you encounter a school bus with its red lights flashing and stop arm extended?",
                    R.drawable.empty_bg,
            "Come to a complete stop and wait until the bus resumes motion",
            "Slow down and proceed with caution",
            "Honk your horn to alert the bus driver",
            "Pass the bus quickly to avoid delays",
            1
        )
        questionsList.add(que39)


        val que40 = Question(
                40,
                "On long trips you can prevent drowsiness by:",
                R.drawable.empty_bg,
                "Turning on your car radio",
                "Slowing down so you can react better",
                "Stopping at regular intervals for a rest",
                "Moving your eyes from side to side as you drive",
                3
            )
        questionsList.add(que40)

        return questionsList
    }
}