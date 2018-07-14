package welcome.secondaywork;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SlpashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slpash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent go_to_Main = new Intent(SlpashActivity.this,LoginActivity.class);
                startActivity(go_to_Main);
            }
        },3000);

    }
}
