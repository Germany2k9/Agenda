package com.germany.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class crearNota extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String spinnerLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_nota);

        Spinner spinner = findViewById(R.id.idSpinner);

        if (spinner != null) {
            spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        }
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.levels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
//             Apply the adapter to the spinner.
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }


    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        spinnerLabel = adapterView.getItemAtPosition(i).toString();
         displayToast(spinnerLabel);
    }

    private void displayToast(String spinnerLabel) {
        Toast.makeText(this, spinnerLabel, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}