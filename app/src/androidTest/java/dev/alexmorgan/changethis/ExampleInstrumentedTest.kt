package dev.alexmorgan.changethis

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import de.mannodermaus.junit5.ActivityScenarioExtension
import dev.alexmorgan.changethis.main_activity.MainActivity
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.RegisterExtension

class ExampleInstrumentedTest {

    @JvmField
    @RegisterExtension
    val scenarioExtension = ActivityScenarioExtension.launch<MainActivity>()

    @Test
    fun testHelloWorldTextIsShown() {
        onView(withId(R.id.main_fragment_text_view)).check(matches(withText("Hello World!")))
    }
}
