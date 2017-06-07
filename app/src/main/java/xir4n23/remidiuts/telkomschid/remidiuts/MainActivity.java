package xir4n23.remidiuts.telkomschid.remidiuts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button swipe, tab, spin, drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipe = (Button) findViewById(R.id.nav1);
        tab = (Button) findViewById(R.id.nav2);
        spin = (Button) findViewById(R.id.nav3);
        drawer = (Button) findViewById(R.id.nav4);

        swipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Swipe.class));
            }
        });
        tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Tab.class));
            }
        });
    }
}
