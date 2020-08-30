package com.manuh.sundaymorning.di

import com.manuh.sundaymorning.viewmodel.SeatsSuplier
import com.manuh.sundaymorning.viewmodel.CatererySuplier
import com.manuh.sundaymorning.viewmodel.FrankResturant
import org.koin.dsl.module

val appModule = module {

    factory { SeatsSuplier() }

    factory { CatererySuplier() }

    factory { FrankResturant(get(),get()) }

}
