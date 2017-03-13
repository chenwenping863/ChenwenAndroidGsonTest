package com.example.chenwenping.chenwenandroidgsontest;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.example.chenwenping.chenwenandroidgsontest.entity.DataEntity;
import com.example.chenwenping.chenwenandroidgsontest.utils.DataUtils;
import com.example.chenwenping.chenwenandroidgsontest.utils.GsonUtils;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private MyHandler myHandler;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ApplicationContext.getsInstance().setApplicationContext(getApplication());

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myHandler = new MyHandler();

        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);

        MyThread m = new MyThread();
        new Thread(m).start();
    }

    class MyHandler extends Handler {
        public MyHandler() {
        }

        public MyHandler(Looper L) {
            super(L);
        }

        @Override
        public void handleMessage(Message msg) {
            // TODO Auto-generated method stub
            Log.d("MyHandler", "handleMessage。。。。。。");
            super.handleMessage(msg);
            // 此处可以更新UI
            Bundle b = msg.getData();
            String color = b.getString("color");
            //MainActivity.this.button.append(color);
            String jsonString = b.getString("jsonString");
            button.setText(color);
            textView.setText(jsonString);

        }
    }

    private String jsonString;
    class MyThread implements Runnable {
        public void run() {
            try {
                jsonString = DataUtils.readRawFile(R.raw.jsontest);
                System.out.print("jsonString:" + jsonString);
            } catch (IOException e) {
                e.printStackTrace();
            }

           // GsonUtils.jsonStringToList(jsonString, DataEntity.class);
            DataEntity dataEntity = new DataEntity();

            dataEntity = GsonUtils.jsonStringToClass(jsonString, DataEntity.class);
            Log.d("dataEntity_Liketeamlist", dataEntity.getLiketeamlist().size() + "");
            Log.d("dataEntity_Partnerteam", dataEntity.getPartnerteamlist().size() + "");


            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            Log.d("thread。。。。。。。", "mThread。。。。。。。。");
            Message msg = new Message();
            Bundle b = new Bundle();// 存放数据
            b.putString("color", "我的");
            b.putString("jsonString", jsonString);
            msg.setData(b);
            MainActivity.this.myHandler.sendMessage(msg); // 向Handler发送消息，更新UI
        }
    }
}
