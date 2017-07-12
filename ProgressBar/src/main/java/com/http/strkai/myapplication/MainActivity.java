package com.http.strkai.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ProgressBar;



public class MainActivity extends AppCompatActivity {

    private TextView  textChange=null;
    private ProgressBar progressBar=null;
    private  Button  button=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] dataTiem={5,3,5};

        final String[] items=getResources().getStringArray(R.array.textView);
        progressBar=(ProgressBar)findViewById(R.id.progressBar1) ;
        textChange=(TextView)findViewById(R.id.textView1);

        button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {

            int i=0;
            int j=0;

            @Override
            public void onClick(View v) {
                    textChange.setText(items[i]);
                if (i<=13) {
                    i = i + 1;
                }else {
                 i=0;
                }
                    progressBar.setMax(13);
                    if (j < 5) {
                        j = j + 1;
                        progressBar.setProgress(j);

                    } else if (j < 8) {
                        j = j + 1;
                        progressBar.setSecondaryProgress(j);
                    } else if (j <= 13) {
                        j = j + 1;
                        progressBar.setProgress(j);
                    } else {
                        j = 0;
                        progressBar.setProgress(j);
                        progressBar.setSecondaryProgress(j);
                    }
                }

        });
    }
}
