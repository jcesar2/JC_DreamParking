package hr.foi.air.dreamparking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class DreamParking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dream_parking);

        Button btnDetails = (Button) findViewById(R.id.btn_details);
        btnDetails.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v){
                Intent i = new Intent(getApplicationContext(), DiscountDetailsActivity.class);
                startActivity(i);
            }
        });

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
