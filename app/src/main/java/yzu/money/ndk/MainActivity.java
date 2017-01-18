package yzu.money.ndk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static{
        System.load("jnidemo");
    }
    public native String go();
    Button btngo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btngo= (Button) findViewById(R.id.button);
        btngo.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View view) {
                TextView tv;
                tv= (TextView) findViewById(R.id.textView);
                tv.setText(go());
            }
        });
    }
}
