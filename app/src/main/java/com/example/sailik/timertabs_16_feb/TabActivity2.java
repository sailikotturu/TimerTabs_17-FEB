package com.example.sailik.timertabs_16_feb;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TabActivity2 extends AppCompatActivity implements View.OnClickListener {

    private Button mStartButton;
    private TextView mTimer_tv;
    MyCountDownTimer2 myTimer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab2);

        mStartButton = (Button)findViewById(R.id.button_start);
        mTimer_tv = (TextView)findViewById(R.id.timer_tv);
        mStartButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button_start:
                myTimer2 = new MyCountDownTimer2(10000, 1000);
                mTimer_tv.setText("10");
                myTimer2.start();
                break;
        }
    }

    public class MyCountDownTimer2 extends CountDownTimer {

        public MyCountDownTimer2(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            long secs_left = millisUntilFinished/1000;
            String display_time = secs_left+"";
            mTimer_tv.setText(display_time);
//            int progress = (int) (millisUntilFinished/1000);

        }

        @Override
        public void onFinish() {
            Toast.makeText(TabActivity2.this,"Timer2: Count Down finished!!",Toast.LENGTH_SHORT).show();
            mTimer_tv.setText("0");
            //finish();
        }
    }

    @Override
    protected void onResume(){
        super.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    protected void onStop(){
        super.onStop();

    }
}
