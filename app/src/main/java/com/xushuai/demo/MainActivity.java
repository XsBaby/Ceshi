package com.xushuai.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import jp.wasabeef.glide.transformations.CropCircleTransformation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = (ImageView) findViewById(R.id.image);

        //参数一 上下文    参数二 图片路径   参数三 上下文   参数四 控件id
        Glide.with(this).load(R.drawable.aaa).bitmapTransform(new CropCircleTransformation(this)).into(image);
    }
}