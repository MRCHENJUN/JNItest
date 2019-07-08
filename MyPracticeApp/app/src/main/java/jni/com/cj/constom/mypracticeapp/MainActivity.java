package jni.com.cj.constom.mypracticeapp;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import jni.com.cj.constom.jnitest.JNITest;

public class MainActivity extends AppCompatActivity {
    private static final int MSG_REBOOT = 1;
    private MyHandler myHandler=new MyHandler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myHandler.removeMessages(MSG_REBOOT);
        myHandler.sendEmptyMessageDelayed(MSG_REBOOT, 1500);
    }

    public void getJNIValue(View view) {
        String test = JNITest.getName();
        Toast.makeText(getApplicationContext(), "value=" + test, Toast.LENGTH_SHORT).show();
    }

    private class MyHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == MSG_REBOOT) {

            }
        }
    }

}
