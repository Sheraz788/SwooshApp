package com.sheraz.ali.swooshapp.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.sheraz.ali.swooshapp.Utilities.EXTRA_LEAGUE
import com.sheraz.ali.swooshapp.R
import com.sheraz.ali.swooshapp.Utilities.USER_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE)


    }

    fun beginnerBtnClicked(view: View){

        ballerBtn.isChecked = false

        skill = "Beginner"

    }
    fun ballerBtnClicked(view: View){

        beginnerBtn.isChecked = false

        skill = "Baller"

    }

    fun finishBtnClicked(view: View){

        if(skill != ""){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(USER_SKILL,  skill)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this, "Please select atleast one Skill", Toast.LENGTH_SHORT).show()
        }

    }
}
