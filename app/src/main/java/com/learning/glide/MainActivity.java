package com.learning.glide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {
TextView textView;
Button btn;
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        img = findViewById(R.id.imageView);
        btn = findViewById(R.id.btn);
    }
        public void mybutton(View view){
        String imageURL="https://picsum.photos/200";
        Glide.with(MainActivity.this).load(imageURL).skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).into(img);
         }
}