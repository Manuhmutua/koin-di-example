package com.manuh.sundaymorning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.manuh.sundaymorning.viewmodel.FrankResturant
import org.koin.android.ext.android.get

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frankResturant = get<FrankResturant>()
        frankResturant.openRestaurant()

        val frankResturant2 = get<FrankResturant>()
        // Set Break Point on this line
        frankResturant2.openRestaurant()
    }
}
