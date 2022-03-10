package com.edu.unipiloto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view){
        Intent intent = new Intent(this,ReceiveMessageActivity.class);
        EditText messageView = (EditText)findViewById(R.id.message);
        String messageText = messageView.getText().toString();
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,messageText);

        startActivity(intent);

    }

}