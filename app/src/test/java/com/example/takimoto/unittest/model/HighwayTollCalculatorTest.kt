package com.example.takimoto.unittest.model

import junit.framework.Assert
import org.junit.After
import org.junit.Before
import org.junit.Test

/**
 * Created by takimoto on 2017/12/08.
 * Copyright (C) 2016 KDDI
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