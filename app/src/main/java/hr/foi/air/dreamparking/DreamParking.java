package hr.foi.air.dreamparking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class DreamParking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dream_parking);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        switch(id)
        {
            case R.id.action_search:
                break;
            case R.id.action_settings:
                break;
        }
        Toast.makeText(this, "Menu item "+ item.getTitle()+ " clicked!", Toast.LENGTH_SHORT).show();
        return true;
    }
}
