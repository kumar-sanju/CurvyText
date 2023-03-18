package com.smart.curvytext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
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
        textArc.setTextSize(72);
        textArc.setFontFamily(ResourcesCompat.getFont(this, R.font.krabuler));

        textArc.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.CENTER));
        ((FrameLayout)findViewById(R.id.flTextArc)).addView(textArc);

    }
}