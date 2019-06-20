package com.sheraz.ali.swooshapp.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.sheraz.ali.swooshapp.Model.Player
import com.sheraz.ali.swooshapp.R
import com.sheraz.ali.swooshapp.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BasicActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        var player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagueText.text = "Looking for ${player.league} ${player.skill} League Near you ..."
    }
}
