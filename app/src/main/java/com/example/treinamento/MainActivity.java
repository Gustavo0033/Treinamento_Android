package com.example.treinamento;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.treinamento.Fragements.DetailFragment;
import com.example.treinamento.Fragements.MainFragment;
import com.example.treinamento.FragmentsNavigation.HomeFragment;
import com.example.treinamento.FragmentsNavigation.MacbookFragment;
import com.example.treinamento.FragmentsNavigation.MoreFragment;
import com.example.treinamento.FragmentsNavigation.PhonesFragment;
import com.example.treinamento.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.concurrent.RecursiveTask;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());



        binding.bottomNavigationView.setOnItemSelectedListener(item->{
            switch (item.getItemId()){

                case R.id.Home:
                    replaceFragment(new HomeFragment());
                    break;
                case R.id.Phones:
                    replaceFragment(new PhonesFragment());
                    break;
                case R.id.Macbook:
                    replaceFragment(new MacbookFragment());
                    break;
                case R.id.More:
                    replaceFragment(new MoreFragment());
                    break;
                case R.id.RecyclerView:
                    replaceFragment(new DetailFragment());
                    break;
            }


            return true;
        });

        Fragment fragment = MainFragment.newInstance();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment, "Main_Fragment");
        transaction.commit();

    }

    private void replaceFragment(Fragment fragmentnav){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_Layout, fragmentnav);
        fragmentTransaction.commit();


}
}