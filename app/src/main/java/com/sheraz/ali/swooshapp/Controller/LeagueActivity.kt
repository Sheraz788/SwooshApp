package com.sheraz.ali.swooshapp.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.sheraz.ali.swooshapp.Model.Player
import com.sheraz.ali.swooshapp.R
import com.sheraz.ali.swooshapp.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BasicActivity() {



    var player = Player("", "")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onMensClicked(view: View){

        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = mensLeagueBtn.text.toString()

    }
    fun onWomensClicked(view: View){

        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = womensLeagueBtn.text.toString()

    }
    fun onCoedClicked(view: View){

        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        player.league = coedLeagueBtn.text.toString()

    }

    fun leagueNextClicked(view: View){

        if(player.league != ""){
            val intiateSkillActivity = Intent(this, SkillActivity::class.java)
            intiateSkillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(intiateSkillActivity)
        }else{
            Toast.makeText(this, "Please select one League.", Toast.LENGTH_SHORT).show()
        }


    }
}
