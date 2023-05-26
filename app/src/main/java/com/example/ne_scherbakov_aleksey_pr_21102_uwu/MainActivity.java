package com.example.ne_scherbakov_aleksey_pr_21102_uwu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// TODO Auto-generated method stub
// добавляемпунктыменю
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
// TODO Auto-generated method stub
        Intent intent =null;
        switch (item.getItemId())
        {
            case R.id.m1:intent = new Intent(this, theatre.class);
                break;
            case R.id.m2: intent = new Intent(this, search_films.class);
                break;
            case R.id.m3: intent = new Intent(this, newtheatre.class);
                break;
            case R.id.m4: intent = new Intent(this, newfilm.class);
                break;
            case R.id.m5: intent = new Intent(this, updtheatres.class);
                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }


}

