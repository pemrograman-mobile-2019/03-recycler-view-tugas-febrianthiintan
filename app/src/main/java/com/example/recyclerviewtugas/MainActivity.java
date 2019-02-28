package com.example.recyclerviewtugas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recyclerviewtugas.adapter.MahasiswaAdapter;
import com.example.recyclerviewtugas.model.Mahasiswa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Febrianthi Intan nurzamziah", "Probolinggo", "(+62)123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Nurma Silviyanti", "Pasuruan", "(+62)987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Eka Fara Dewi", "Malang", "(+62)987648765"));
        mahasiswaArrayList.add(new Mahasiswa("Elsa Vira Nindi Aprilia", "Malang", "(+62)098758124"));
        mahasiswaArrayList.add(new Mahasiswa("Ovi Meivina Basori", "Malang", "(+62)098752764"));
        mahasiswaArrayList.add(new Mahasiswa("Nabilah Roisul Amini", "Probolinggo", "(+62)098751098"));
        mahasiswaArrayList.add(new Mahasiswa("Ahmad Nurudding Subqi", "Kediri", "(+62)098753678"));
        mahasiswaArrayList.add(new Mahasiswa("Niar Kintan", "Surabaya", "(+62)098752875"));
        mahasiswaArrayList.add(new Mahasiswa("Dimas Rizki", "Sidoarjo", "(+62)098753756"));
        mahasiswaArrayList.add(new Mahasiswa("Ahmad Yusuf Ardabilli", "Jakarta", "(+62)098758362"));

    }
}