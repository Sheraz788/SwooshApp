package com.sheraz.ali.swooshapp.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.sheraz.ali.swooshapp.R
import com.sheraz.ali.swooshapp.Utilities.EXTRA_LEAGUE
import com.sheraz.ali.swooshapp.Utilities.USER_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BasicActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(USER_SKILL)

        searchLeagueText.text = "Looking for $league $skill League Near you ..."
    }
}
