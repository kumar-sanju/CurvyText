package com.smart.curvytext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CurvyText textArc = new CurvyText(this);
        textArc.setText("Curvy text that was added programmatically");
        textArc.setRadius(255);
        textArc.setCenterAngle(-90);
        textArc.setTextColor(R.color.teal_200);
        textArc.setTextSize(60);
        textArc.setFontFamily(ResourcesCompat.getFont(this, R.font.krabuler));

        textArc.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.CENTER));
        ((FrameLayout)findViewById(R.id.flTextArc)).addView(textArc);

        CurvyText textArc2 = new CurvyText(this);
        textArc2.setText("Second Curvy text was added");
        textArc2.setRadius(110);
        textArc2.setCenterAngle(-90);
        textArc2.setTextColor(R.color.teal_200);
        textArc2.setTextSize(35);
        textArc2.setFontFamily(ResourcesCompat.getFont(this, R.font.krabuler));

        textArc2.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.CENTER));
        ((FrameLayout)findViewById(R.id.flTextArc2)).addView(textArc2);

        Animation animationRotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        ((FrameLayout)findViewById(R.id.flTextArc2)).startAnimation(animationRotate);

    }
}