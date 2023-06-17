package icu.fur93.imitatewechat.ui.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import icu.fur93.imitatewechat.R
import icu.fur93.imitatewechat.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnExit.setOnClickListener{
            finish()
        }

        binding.btnRegister.setOnClickListener{

            val name = binding.tName.text.toString()
            val phone = binding.tPhone.text.toString()
            val password = binding.tPassword.text.toString()

            if (
                name == "" ||
                phone == "" ||
                password == ""
            ) {
                Toast.makeText(this, R.string.msg_filed_validate_toast, Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(this, LoginActivity::class.java)
            intent.putExtra("phone", phone)
            intent.putExtra("password", password)
            startActivity(intent)
        }

    }

}
