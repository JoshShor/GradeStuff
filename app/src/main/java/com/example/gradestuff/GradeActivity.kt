package com.example.gradestuff

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class GradeActivity : AppCompatActivity() {

    lateinit var numInput: EditText
    lateinit var gradeTextView: TextView
    lateinit var showGradeBtn: Button
    lateinit var gradeStr: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grade)

        numInput = findViewById(R.id.editGradeNumber)
        gradeTextView = findViewById(R.id.grade_display_text)
        showGradeBtn = findViewById(R.id.show_grade_btn)

        showGradeBtn.setOnClickListener {
            /* Theres got to be a better way to do this */
            gradeStr = numInput.text.toString()
            val intValue = gradeStr.toInt()
            /* doing it this way for now, will change once I figure out a better way */
            println(intValue) //test the string

            if(intValue < 70){
                gradeTextView.text = getString(R.string.FGrade)
            }
            else if(intValue >= 70 && intValue < 73){
                gradeTextView.text = getString(R.string.CMinus)
            }
            else if(intValue >= 73 && intValue < 77){
                gradeTextView.text = getString(R.string.CGrade)
            }
            else if(intValue >= 77 && intValue < 80){
                gradeTextView.text = "You got a C+"
            }
            else if(intValue >= 80 && intValue < 83){
                gradeTextView.text = "You got a B-"
            }
            else if(intValue >= 83 && intValue < 87){
                gradeTextView.text = "You got a B"
            }
            else if(intValue >= 87 && intValue < 90){
                gradeTextView.text = "You got a B+"
            }
            else if(intValue >= 90 && intValue < 94){
                gradeTextView.text = "You got a A-"
            }
            else{
                gradeTextView.text = "You got a A"
            }

        }
    }
    fun showGradeButtonOnClick(){


    }


}