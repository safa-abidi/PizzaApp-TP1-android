package com.gl4.pizzaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var nom: TextInputLayout
    lateinit var prenom: TextInputLayout
    lateinit var adresse: TextInputLayout
    lateinit var mini: RadioButton
    lateinit var moy: RadioButton
    lateinit var maxi: RadioButton
    lateinit var fromage: CheckBox
    lateinit var champignon: CheckBox
    lateinit var saucisson: CheckBox
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nom = findViewById(R.id.nom)
        prenom = findViewById(R.id.prenom)
        adresse = findViewById(R.id.adresse)
        mini = findViewById(R.id.radio_button_3)
        moy = findViewById(R.id.radio_button_2)
        maxi = findViewById(R.id.radio_button_1)
        fromage = findViewById(R.id.fromage)
        champignon = findViewById(R.id.champignon)
        saucisson = findViewById(R.id.saucisson)
        btn = findViewById(R.id.textButton)
    }

}