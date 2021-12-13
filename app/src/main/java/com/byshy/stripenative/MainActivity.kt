package com.byshy.stripenative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import com.stripe.android.PaymentConfiguration

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        PaymentConfiguration.init(
                applicationContext,
                "pk_test_TYooMQauvdEDq54NiTphI7jx"
        )
    }

    fun openCheckout(view: View) {
        val intent = Intent(this, CheckoutActivity::class.java)
        startActivity(intent)
    }
}