package com.example.list_view_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<MessageModel> messageList;
    MessageAdapter adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        define();
        fillList();


    }

    public void define() {
        listView = (ListView) findViewById(R.id.listview);
    }

    public void fillList() {

        messageList = new ArrayList<>();

        MessageModel message1 = new MessageModel("Hello I'm Alekhine", "Alekhine", R.drawable.alekhine);
        MessageModel message2 = new MessageModel("Hello I'm Botvinnik", "Botvinnik", R.drawable.botvinnik);
        MessageModel message3 = new MessageModel("Hello I'm Fischer", "Fischer", R.drawable.fischer);
        MessageModel message4 = new MessageModel("Hello I'm Steinitz", "Steinitz", R.drawable.steinitz);
        MessageModel message5 = new MessageModel("Hello I'm Tal", "Tal", R.drawable.tal);

        messageList.add(message1);
        messageList.add(message2);
        messageList.add(message3);
        messageList.add(message4);
        messageList.add(message5);

        adp = new MessageAdapter(messageList, this);
        listView.setAdapter(adp);


    }

}