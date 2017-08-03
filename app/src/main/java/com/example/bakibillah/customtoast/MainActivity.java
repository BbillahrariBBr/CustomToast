package com.example.bakibillah.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.buttonToast);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View CustomToast = MainActivity.this.getLayoutInflater().inflate(R.layout.customtoast,null);
                Toast toast = new Toast(getApplicationContext());
                toast.setView(CustomToast);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}
