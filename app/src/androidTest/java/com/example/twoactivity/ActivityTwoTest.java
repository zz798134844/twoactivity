package com.example.twoactivity;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.util.Log;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class ActivityTwoTest {
    @Rule
    public ActivityTestRule<ActivityTwo> activityTestRule= new ActivityTestRule<>(ActivityTwo.class);
    private ActivityTwo mainActivity = null;
    @Before
    public void setUp() throws Exception {
        mainActivity=activityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void onCreate() {
        Log.d("TAG","AC2 onCreate()");
    }

    @Test
    public void btn2_click() {
        Log.d("TAG","btn2 clicked");
    }
    @Test
    public void ClickButton2(){

        mainActivity.findViewById(R.id.button2);
        Espresso.onView(withId(R.id.un)).perform(typeText("zz"));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.pw)).perform(typeText("666"));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.button2)).perform(click());
    }
}