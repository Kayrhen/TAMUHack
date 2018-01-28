package kushangupta.volunteerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class VolEventList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vol_event_list);

        Intent intent = new Intent(VolEventList.this, EventList.class);
        intent.putExtra("SOURCE", "VolEventList");
        startActivity(intent);
    }
}
