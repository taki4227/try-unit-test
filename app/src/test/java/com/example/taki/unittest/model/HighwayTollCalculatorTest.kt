package com.example.taki.unittest.model

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created by taki on 2017/12/08.
 */
class HighwayTollCalculatorTest {
    private lateinit var calculator: HighwayTollCalculator

    @Before
    fun setUp() {
        calculator = HighwayTollCalculator()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun calculate_100km() {
        val actual = calculator.calculate(100)
        Assert.assertEquals(5000, actual)
    }

    @Test
    fun calculate_101km() {
        val actual = calculator.calculate(101)
        Assert.assertEquals(5040, actual)
    }

    @Test
    fun calculate_201km() {
        val actual = calculator.calculate(201)
        Assert.assertEquals(9030, actual)
    }

}