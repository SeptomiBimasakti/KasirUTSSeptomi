package com.example.d2a.kasirutsseptomi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String pos1;String pos2;String pos3;String pos4;String pos5;String pos6;String pos7;
    TextView jml1,jml2,jml3,jml4,jml5,jml6,jml7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jml1= (TextView) findViewById(R.id.jml1);
        jml2= (TextView) findViewById(R.id.jml2);
        jml3= (TextView) findViewById(R.id.jml3);
        jml4= (TextView) findViewById(R.id.jml4);
        jml5= (TextView) findViewById(R.id.jml5);
        jml6= (TextView) findViewById(R.id.jml6);
        jml7= (TextView) findViewById(R.id.jml7);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.setHarga){
            startActivity(new Intent(this, SettingHarga.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void doPesan(View view) {
        Intent it = new Intent(this, StrukActivity.class);
        pos1=jml1.getText().toString();
        pos2=jml2.getText().toString();
        pos3=jml3.getText().toString();
        pos4=jml4.getText().toString();
        pos5=jml5.getText().toString();
        pos6=jml6.getText().toString();
        pos7=jml7.getText().toString();
        it.putExtra("jumlah1",pos1);
        it.putExtra("jumlah2",pos2);
        it.putExtra("jumlah3",pos3);
        it.putExtra("jumlah4",pos4);
        it.putExtra("jumlah5",pos5);
        it.putExtra("jumlah6",pos6);
        it.putExtra("jumlah7",pos7);
        startActivity(it);

    }

}
