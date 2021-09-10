package com.steg.tencrypt;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

//    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);

        setSupportActionBar(findViewById(R.id.toolbar));

        NavController nav =
                ((NavHostFragment)getSupportFragmentManager()
                        .findFragmentById(R.id.nav_host))
                        .getNavController();



        AppBarConfiguration configuration =
                new AppBarConfiguration.Builder(nav.getGraph()).build();
        NavigationUI.setupWithNavController(findViewById(R.id.toolbar),nav,configuration);
    }
}