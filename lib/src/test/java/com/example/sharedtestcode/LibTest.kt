package com.example.sharedtestcode

import org.junit.Assert
import org.junit.Test

class LibTest {

    @Test
    fun testInLib() {
        Assert.assertEquals(1, USER_ID)
    }
}