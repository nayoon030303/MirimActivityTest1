package kr.hs.emirim.s2019s05.mirimactivitytest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = findViewById(R.id.rg);
        Button btnNew = findViewById(R.id.btn_new_activity);
        btnNew.setOnClickListener(btnNewListener);
    }
    View.OnClickListener btnNewListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (rg.getCheckedRadioButtonId()){
                case R.id.second:
                    intent = new Intent(getApplicationContext(), SecontActivity.class);
                    break;
                case R.id.third:
                    intent = new Intent(getApplicationContext(), ThirdActivity.class);
                    break;
            }

            startActivity(intent);
        }
    };
}