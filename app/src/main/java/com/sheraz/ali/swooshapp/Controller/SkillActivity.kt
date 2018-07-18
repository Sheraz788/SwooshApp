package com.sheraz.ali.swooshapp.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.sheraz.ali.swooshapp.Model.Player
import com.sheraz.ali.swooshapp.R
import com.sheraz.ali.swooshapp.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)


    }

    fun beginnerBtnClicked(view: View){

        ballerBtn.isChecked = false

        player.skill = "Beginner"

    }
    fun ballerBtnClicked(view: View){

        beginnerBtn.isChecked = false

        player.skill = "Baller"

    }

    fun finishBtnClicked(view: View){

        if(player.skill != ""){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this, "Please select atleast one Skill", Toast.LENGTH_SHORT).show()
        }

    }
}
