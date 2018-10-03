package com.example.a1701357885.gosport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import static android.app.ProgressDialog.show;

//Bentar ya gw cek dulu erronya
public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private LoginActivity loginActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerLayout=(DrawerLayout) findViewById(R.id.drawer);
        mToggle=new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView = (NavigationView)findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    //Bikin Navigasi Menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    //buat navigasi menu dan Itemnya sama click handlenya
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.home){
            Toast.makeText(this, "This is home", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.product)
        {
            Toast.makeText(this, "This is Product", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.exit)
        {
            Toast.makeText(this, "This is Exit", Toast.LENGTH_SHORT).show();

        }

        if (id == R.id.Sign_In)
        {
            Toast.makeText(this, "This is Sign In", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this.loginActivity,
                    MainActivity.class);
            startActivity(intent);
            finish();
        }

        return false;
    }

}



