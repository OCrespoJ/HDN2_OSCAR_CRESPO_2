package com.oscar.hdn2_oscar_crespo;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import fragments.DescripcionFragment;
import fragments.PerfilFragment;
import fragments.PersonajesFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    Toolbar toolbar;
    DrawerLayout drawer;
    private NavigationView navView;
    FragmentManager fm;
    ImageView imgPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_action_menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        drawer = (DrawerLayout) findViewById(R.id.drawer);
        navView = (NavigationView) findViewById(R.id.navView);
        navView.setNavigationItemSelectedListener(this);
        //imgPerfil = (ImageView) findViewById(R.id.imgPerfil);

        fm = getSupportFragmentManager();
        fm.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);

        imgPerfil = (ImageView) navView.getHeaderView(0).findViewById(R.id.imgPerfil); //para coger la imagen cogemos el header, ya que esta en otro xml
        imgPerfil.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: //esto siempre es el icono
                drawer.openDrawer(GravityCompat.START);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_descripcion:
                DescripcionFragment descripcionFragment = DescripcionFragment.newInstance();
                fm.beginTransaction().replace(R.id.container, descripcionFragment).commit();
                break;
            case R.id.item_personajes:
                PersonajesFragment personajesFragment = PersonajesFragment.newInstance();
                fm.beginTransaction().replace(R.id.container, personajesFragment).commit();
                break;
            case R.id.item_objetos:

                break;
            case R.id.item_novedades:

                break;
            case R.id.item_ajustes:

                break;
            case R.id.item_salir:

                break;
        }
        item.setChecked(true); //marcamos la opción
        getSupportActionBar().setTitle(item.getTitle()); //cambiamos el titulo de la actionbar
        drawer.closeDrawers(); //cerramos el menu
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imgPerfil:
                PerfilFragment perfilFragment = PerfilFragment.newInstance();
                fm.beginTransaction().replace(R.id.container, perfilFragment).commit();

                getSupportActionBar().setTitle("Perfil"); //cambiamos el titulo de la actionbar
                drawer.closeDrawers(); //cerramos el menu
                break;

        }
    }
}
