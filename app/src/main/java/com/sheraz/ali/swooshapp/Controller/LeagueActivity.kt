package com.sheraz.ali.swooshapp.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.sheraz.ali.swooshapp.Utilities.EXTRA_LEAGUE
import com.sheraz.ali.swooshapp.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BasicActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View){

        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = mensLeagueBtn.text.toString()

    }
    fun onWomensClicked(view: View){

        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = womensLeagueBtn.text.toString()

    }
    fun onCoedClicked(view: View){

        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        selectedLeague = coedLeagueBtn.text.toString()

    }

    fun leagueNextClicked(view: View){

        if(selectedLeague != ""){
            val intiateSkillActivity = Intent(this, SkillActivity::class.java)
            intiateSkillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(intiateSkillActivity)
        }else{
            Toast.makeText(this, "Please select one League.", Toast.LENGTH_SHORT).show()
        }


    }
}
