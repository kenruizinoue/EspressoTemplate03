package com.kenruizinoue.espressotemplate03

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class InstrumentedTest {

    @get: Rule
    var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    private val pos = 9

    @Test
    fun testRecyclerView() {
        onView(withId(R.id.myRecyclerView))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<MyViewHolder>(
                    pos,
                    click()
                )
            )

        // you can look for items outside MainActivity
        onView(withText(data[pos]))
            .check(matches(isDisplayed()))
    }
}