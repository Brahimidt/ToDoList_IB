package com.example.todolist_ib;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView maListe;
    String daily[] = { "Sacar al perro", "comprar el pan",
            "revisar el correo de la salle", "preparar reuniones del día",
            "hacer ejercicio." };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maListe = findViewById(R.id.list);
        ArrayAdapter<String> myarray;
        myarray = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, daily);
        maListe.setAdapter(myarray);
    }
}

