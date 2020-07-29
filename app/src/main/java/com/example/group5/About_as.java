
package com.example.group5;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.core.app.NavUtils;

        import android.os.Bundle;
        import android.view.MenuItem;

public class About_as extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_as);
        getSupportActionBar().hide();
        //getActionBar().setDisplayHomeAsUpEnabled(true);

    }
}