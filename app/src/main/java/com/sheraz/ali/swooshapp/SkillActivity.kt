package com.sheraz.ali.swooshapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SkillActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        val league = intent.getStringExtra(EXTRA_LEAGUE)

        
    }
}
