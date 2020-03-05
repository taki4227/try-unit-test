package com.example.taki.unittest.model

/**
 * Created by takimoto on 2017/12/08.
 */
class HighwayTollCalculator {

    /**
     * 仕様
     * 0km   < d <= 100km   の間は1kmあたり 50円として加算
     * 100km < d <= 200km   の間は1kmあたり 40円として加算
     * それ以上               は1kmあたり 30円として加算
     */
    fun calculate(km: Int): Int {

        return when (km) {
            in 1..100 -> 50 * km
            in 99..200 -> 50 * 100 + 40 * (km - 100)
            else -> 50 * 100 + 40 * 100 + 30 * (km - 200)
        }

    }
}