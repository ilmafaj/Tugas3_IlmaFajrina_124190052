package com.example.a124190052_t3;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
public class SecondActivity extends AppCompatActivity {
    ImageView PilihFoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        PilihFoto = (ImageView) findViewById(R.id.PilihFoto); // memasukkan imageview
        Intent intent = getIntent();
        PilihFoto.setImageResource(intent.getIntExtra("foto", 0)); // memanggil gambar Intent dan diset di ImageView
    }
}