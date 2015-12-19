package vn.nks.loclt.time_line;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gr = (GridView) findViewById(R.id.gr);
        Adapter adapter = new Adapter();
        gr.setAdapter(adapter);
    }
}
