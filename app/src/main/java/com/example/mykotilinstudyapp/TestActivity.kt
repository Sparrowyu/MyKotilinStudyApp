package com.example.mykotilinstudyapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mykotilinstudyapp.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {
    //稍后初始化 lateinit
    private lateinit var  contentLayoutBinding: ActivityTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //        setContentView(R.layout.activity_modify_data);
        contentLayoutBinding = DataBindingUtil.setContentView(this, R.layout.activity_test)

        contentLayoutBinding.tv.text = "1112"
//        contentLayoutBinding.tv.text = "111";
//        setContentView(R.layout.activity_test)
    }
}