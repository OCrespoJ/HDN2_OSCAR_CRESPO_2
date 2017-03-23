package com.oscar.hdn2_oscar_crespo;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import beans.PersonajeBean;
import fragments.PersonajesFragment;

public class PersonajesActivity extends AppCompatActivity {

    Toolbar toolbar;
    private ImageView imgPersonaje, imgDiseño;
    private TextView txtNombre, txtDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personajes);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        PersonajeBean personajeBean = (PersonajeBean) getIntent().getSerializableExtra(PersonajesFragment.PERSONAJE_KEY);

        imgPersonaje = (ImageView) findViewById(R.id.imgPersonaje);
        txtNombre = (TextView) findViewById(R.id.txtNombre);
        txtDescripcion = (TextView) findViewById(R.id.txtDescripcion);
        imgDiseño = (ImageView) findViewById(R.id.imgDiseño);

        imgPersonaje.setImageDrawable(ContextCompat.getDrawable(this, personajeBean.getFoto()));
        txtNombre.setText(personajeBean.getNombre());
        txtDescripcion.setText(personajeBean.getDescripcion());
        imgDiseño.setImageDrawable(ContextCompat.getDrawable(this, personajeBean.getDiseño()));

    }
}
