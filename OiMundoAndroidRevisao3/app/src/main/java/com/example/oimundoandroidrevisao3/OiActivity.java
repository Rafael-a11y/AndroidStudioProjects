package com.example.oimundoandroidrevisao3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class OiActivity extends Activity
{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        TextView oi = new TextView(this);
        oi.setText("Hi people! Good Afternon!");
        this.setContentView(oi);
    }
}
