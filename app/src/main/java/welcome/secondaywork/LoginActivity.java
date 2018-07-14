package welcome.secondaywork;

//import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
EditText un,ps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

            un=(EditText)findViewById(R.id.et1);
            ps=(EditText)findViewById(R.id.et2);

        }
        public void login(View v ) {
            Intent ob;
            String s1, s2;
            s1 = un.getText().toString();
            s2 = ps.getText().toString();
            if (s1.equals("admin123") && s2.equals("admin")) {
                ob = new Intent(LoginActivity.this, SlpashActivity.class);
                startActivity(ob);
            } else
                Toast.makeText(this, "enter valid details", Toast.LENGTH_LONG).show();
        }

    }