package com.example.canacomercio.ui;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.canacomercio.R;
import com.example.canacomercio.common.Constants;
import com.example.canacomercio.common.SharedPreferencesManager;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        getSupportActionBar().hide();

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications, R.id.navigation_tickets)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

        String User = SharedPreferencesManager.getSomeStringValue(Constants.PREF_NOMBRE)+" "+SharedPreferencesManager.getSomeStringValue(Constants.PREF_A_PATERNO)+" "+SharedPreferencesManager.getSomeStringValue(Constants.PREF_A_MATERNO);
        Toast.makeText(this,"Hola "+User, Toast.LENGTH_LONG).show();

    }

}