package com.example.oimundoandroidrevisao;

import android.app.Activity;
import androidx.annotation.Nullable;
import android.os.Bundle;
import android.widget.TextView;
public class OiActivity extends Activity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        TextView oi = new TextView(this);
        oi.setText("O famoso olá mundo!");
        this.setContentView(oi);
    }
}
