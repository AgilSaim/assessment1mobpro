package org.d3if3047.assessment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Toast
import org.d3if3047.assessment1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener { hitungDiskon() }
    }
    private fun hitungDiskon() {
        val harga = binding.hargaEditText.text.toString()
        val diskon = binding.diskonEditText.text.toString()

        val txtHarga = harga.toInt()
        val txtDiskon = diskon.toInt()

        val potongan = txtHarga * txtDiskon / 100
        val hasil = txtHarga - potongan

        binding.totalTextView.text = hasil.toString()
    }
}