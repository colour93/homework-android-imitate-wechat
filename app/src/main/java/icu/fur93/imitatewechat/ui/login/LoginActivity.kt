package icu.fur93.imitatewechat.ui.login

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import icu.fur93.imitatewechat.R
import icu.fur93.imitatewechat.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val phone = intent.getStringExtra("phone")
        val password = intent.getStringExtra("password")

        binding.dPhone.text = phone

        binding.btnLogin.setOnClickListener {

            val iPassword = binding.tPassword.text.toString()

            if (password == iPassword) {

                Toast.makeText(this, R.string.msg_login_successful_toast, Toast.LENGTH_SHORT).show()

            } else {

                Toast.makeText(this, R.string.msg_login_failed_toast, Toast.LENGTH_SHORT).show()

            }

        }

    }
}
