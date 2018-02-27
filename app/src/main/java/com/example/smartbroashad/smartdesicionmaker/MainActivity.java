package com.example.smartbroashad.smartdesicionmaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] array={R.drawable.yes,
                R.drawable.noo};
        final Button decision =(Button) findViewById(R.id.desbutton);
        final TextView text =(TextView) findViewById(R.id.des);
         final ImageView ashad =(ImageView) findViewById(R.id.yesorno);

        decision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("smartdesicionmaker","button has been pressed" );




                Random image =new Random();
                int any=image.nextInt(2);
                int whatisimage2=array[any];
                ashad.setImageResource(whatisimage2);

                if (whatisimage2==array[0])
                {
                    text.setText("YES");
                }
                else
                {
                    text.setText("no");
                }


            }
        });


    }


}
