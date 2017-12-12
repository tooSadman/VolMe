package sadman.volme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sadman on 11/12/17.
 */

public class ProfileActivity extends AppCompatActivity {

    private String name;
    private String email;
    private String userkey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_profile);

        name = getIntent().getStringExtra("name");
        email = getIntent().getStringExtra("email");
        userkey = getIntent().getStringExtra("key");


        ImageView bonuses = (ImageView) findViewById(R.id.bonuses_button);
        bonuses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent add_event_form = new Intent(ProfileActivity.this, BonusesActivity.class);
                startActivity(add_event_form);
                overridePendingTransition(0, 0);
            }
        });

        ImageView gethome = (ImageView) findViewById(R.id.get_home_button);
        gethome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent add_event_form = new Intent(ProfileActivity.this, home.class);
                startActivity(add_event_form);
                overridePendingTransition(0, 0);
            }
        });

        ImageView addevent = (ImageView) findViewById(R.id.open_event_addform);
        addevent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent add_event_form = new Intent(ProfileActivity.this, AddEventForm.class);
                startActivity(add_event_form);
                overridePendingTransition(0, 0);
            }
        });


        TextView name_textview = (TextView) findViewById(R.id.profile_full_name);
        name_textview.setText(name);

        TextView email_textview = (TextView) findViewById(R.id.profile_email);
        email_textview.setText(email);

        TextView userkey_textview = (TextView) findViewById(R.id.profile_sname);
        userkey_textview.setText(userkey);

    }
}
