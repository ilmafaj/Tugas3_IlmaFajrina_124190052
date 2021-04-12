package com.example.a124190052_t3;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public class MainActivity extends AppCompatActivity {

    // List aray pada menu
    ArrayList NamaMenu = new ArrayList<>(Arrays.asList("Mentai", "Siomay", "Nasi", "Mentai II", "Dimsum", "Mentai III", "Dimsum II","Mentai IV", "Nasi", "Mentai V", "Mentai VI"));
    ArrayList FotoMenu = new ArrayList<>(Arrays.asList(R.drawable.nasimentai1, R.drawable.nasimentai2, R.drawable.nasimentai3, R.drawable.nasimentai1, R.drawable.nasimentai2, R.drawable.nasimentai3, R.drawable.nasimentai1,R.drawable.nasimentai2, R.drawable.nasimentai3, R.drawable.nasimentai1, R.drawable.nasimentai2));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // memanggil RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        // vertical orientation dan set dua kolom
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager); // set LayoutManager untuk recyclerview
        //  memanggil constructor dari CustomAdapter untuk mengirim reference dan data ke Adapter
        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this, NamaMenu, FotoMenu);
        recyclerView.setAdapter(customAdapter); // set adapter untuk recyclerview
    }
}