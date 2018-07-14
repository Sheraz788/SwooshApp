package com.sheraz.ali.swooshapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LeagueActivity : BasicActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View){

        val intiateSkillActivity = Intent(this, SkillActivity::class.java)
        startActivity(intiateSkillActivity)

    }
}
