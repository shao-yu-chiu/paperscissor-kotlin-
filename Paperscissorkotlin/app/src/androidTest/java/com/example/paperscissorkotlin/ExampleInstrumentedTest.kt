package com.example.paperscissorkotlin

import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test

    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.paperscissorkotlin", appContext.packageName)
    }
}
private var enter_name: EditText? = null
private var text_enter: TextView? = null
private  var text_name: TextView? = null
private  var text_winner: TextView? = null
private  var text_me: TextView? = null
private  var text_com: TextView? = null
private var btn_paper: RadioButton? = null
private  var btn_scissor: RadioButton? = null
private  var btn_stone: RadioButton? = null
private var button_ok: Button? = null