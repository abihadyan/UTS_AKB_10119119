package com.example.uts_akb_10119119;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import com.example.uts_akb_10119119.BotNav.CatatanHarianFragment;
import com.example.uts_akb_10119119.BotNav.InformasiFragment;
import com.example.uts_akb_10119119.BotNav.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

//NIM     : 10119119
//NAMA    : MUHAMMAD HADYAN NUR ADABI
//KELAS   : IF-3

public class MainActivity extends AppCompatActivity {



    BottomNavigationView bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



            bottomNavigation = findViewById(R.id.bottom_navigation);
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new ProfileFragment()).commit();
            bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.nav_profile:
                            selectedFragment = new ProfileFragment();
                            break;
                        case R.id.nav_catatan:
                            selectedFragment = new CatatanHarianFragment();
                            break;
                        case R.id.nav_informasi:
                            selectedFragment = new InformasiFragment();
                            break;
                    }

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        selectedFragment).commit();

                return true;
            }
        });
    }
}


