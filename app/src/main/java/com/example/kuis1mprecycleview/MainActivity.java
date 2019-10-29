package com.example.kuis1mprecycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> mahasiswaArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview_1);

        adapter = new KeluargaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Keluarga("Tedy Koesnarbijantoro", "Ayah","24 Juni 1968" , R.drawable.ayah));
        mahasiswaArrayList.add(new Keluarga("Diah Retnowati", "Ibu", "12 Agustus 1969" , R.drawable.ibu));
        mahasiswaArrayList.add(new Keluarga("Pratedyo Septiardo", "Saya", "19 September 1999" , R.drawable.dyo1));
        mahasiswaArrayList.add(new Keluarga("Elsa Mandha Rohadatul Aisy", "Adik 1", "18 Oktober 2000" , R.drawable.elsa));
        mahasiswaArrayList.add(new Keluarga("Miftahul Huda Tedya Putra", "Adik 2", "27 Juni 2010" , R.drawable.huda));
    }
}


