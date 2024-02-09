package com.nash.wariotwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var buttonOne: Button
    lateinit var buttonTwo: Button
    lateinit var buttonThree: Button
    lateinit var buttonFour: Button
    lateinit var buttonFive: Button

    var num = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //AFTER LIKE 2 OR 3 SECONDS YOU LOSE I DONT REALLY CARE

        buttonOne = findViewById(R.id.buttonOne)
        buttonTwo = findViewById(R.id.buttonTwo)
        buttonThree = findViewById(R.id.buttonThree)
        buttonFour = findViewById(R.id.buttonFour)
        buttonFive = findViewById(R.id.buttonFive)

        buttonOne.setOnClickListener{
            if(num == 1){
                num++
                buttonOne.setText("")
                buttonTwo.setText("2")
            }
        }
        buttonTwo.setOnClickListener{
            if(num == 2){
                num++
                buttonTwo.setText("")
                buttonThree.setText("3")
            }
        }
        buttonThree.setOnClickListener{
            if(num == 3){
                num++
                buttonThree.setText("")
                buttonFive.setText("4")
            }
        }
        buttonFour.setOnClickListener{
            if(num == 5){
                num++
                buttonFour.setText("")

                //replace this with the winning thingy
                buttonOne.setText("yo win")
            }
        }
        buttonFive.setOnClickListener{
            if(num == 4){
                num++
                buttonFive.setText("")
                buttonFour.setText("5")
            }
        }

    }
}