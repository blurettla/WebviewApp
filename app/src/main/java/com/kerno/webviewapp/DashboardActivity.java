package com.kerno.webviewapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity
    {

        @Override
        protected void onCreate(Bundle savedInstanceState)
            {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                Button btnViewWebsite = findViewById(R.id.btnViewWebsite);
                Button btnViewProfile = findViewById(R.id.btnViewProfile);
                btnViewWebsite.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                            {
                                openAndelaWebsite();
                            }
                    });
                btnViewProfile.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                            {
                                openMyProfile();
                            }
                    });
            }

        private void openAndelaWebsite()
            {
                Intent intent = new Intent(this, WebviewActivity.class);
                startActivity(intent);
            }

        private void openMyProfile()
            {
                Intent intent = new Intent(this, Profile.class);
                startActivity(intent);
            }

        @Override
        public boolean onCreateOptionsMenu(Menu menu)
            {
                // Inflate the menu; this adds items to the action bar if it is present.
                getMenuInflater().inflate(R.menu.menu_main, menu);
                return true;
            }

        @Override
        public boolean onOptionsItemSelected(MenuItem item)
            {
                // Handle action bar item clicks here. The action bar will
                // automatically handle clicks on the Home/Up button, so long
                // as you specify a parent activity in AndroidManifest.xml.
                int id = item.getItemId();

                //noinspection SimplifiableIfStatement
                if (id == R.id.action_settings)
                    {
                        return true;
                    }

                return super.onOptionsItemSelected(item);
            }
    }
