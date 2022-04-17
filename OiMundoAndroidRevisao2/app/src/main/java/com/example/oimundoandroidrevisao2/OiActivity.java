package com.example.oimundoandroidrevisao2;

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
        oi.setText("Oi galerinha, dê like e se inscreva em meu canal. Lembre-se:  este canal só existe por tua causa!");
        this.setContentView(oi);
    }
}
