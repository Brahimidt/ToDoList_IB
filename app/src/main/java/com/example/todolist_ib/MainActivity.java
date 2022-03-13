package com.example.todolist_ib;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView maListe;
    String daily[] = { "Sacar al perro ; pediente", "comprar el pan ; pediente",
            "revisar el correo de la salle ; pediente", "preparar reuniones del día ; pediente",
            "hacer ejercicio ; pediente" };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maListe = findViewById(R.id.list);
        ArrayAdapter<String> myarray;
        myarray = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, daily);
        maListe.setAdapter(myarray);
        maListe.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = (String) parent.getItemAtPosition(position);
                String test = item.toString();
                String[] parties = test.split(";");
                String itBug = parties[1];
                if(itBug.equals(" realisado")){
                    daily[position] = parties[0]+"; pediente";
                }else{
                    daily[position] = parties[0]+"; realisado";
                }
                    myarray.notifyDataSetChanged();


            }
        });

    }


    public void add(){

    }
}


