package io.weimu.www.circleprogressbarview;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.weimu.www.CircleProgressBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //手动开启动画
        final CircleProgressBarView cir01 = (CircleProgressBarView) findViewById(R.id.crv_01);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                cir01.runAnimation();
            }
        },2000);

    }
}
