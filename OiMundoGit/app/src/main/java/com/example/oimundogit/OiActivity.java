package com.example.oimundogit;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class OiActivity extends Activity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*TextView's precisam de uma referência de onde eles estarão localizados, neste
         caso: a prórpia classe OiActivity*/
        TextView oi = new TextView(this);
        oi.setText("Famoso olá mundo, ou sisplesmente, olá Rafa :)");
        //É análogo ao add() do JFrame
        this.setContentView(oi);
    }
}
