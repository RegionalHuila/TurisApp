package com.example.worldskills.turisapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class PrincipalActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        InicioFragment.OnFragmentInteractionListener,
        HotelesFragment.OnFragmentInteractionListener,
        SitiosFragment.OnFragmentInteractionListener,
        RestaurantesFragment.OnFragmentInteractionListener{

    //Se declaran variables
    Fragment fragmento;
    String tag = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
          Intent intent = new Intent(getApplicationContext(),MapasActivity.class);
          startActivity(intent);

            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
//Desicion que valida el item seleccionado
        if (id == R.id.nav_inicio) {

            //Tag es igual a la pantalla que dan click
            tag = "inicio";

            //Fragmento es igual al nombre de el fragmento_layout
            fragmento = new InicioFragment();

            //Se crea la transaccion
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

            //Se reemplaza el contenedor por el fragment
            transaction.replace(R.id.contenedor, fragmento);
            transaction.addToBackStack(null);

            //Se sube transaccion
            transaction.commit();


        } else if (id == R.id.nav_hoteles) {
            tag = "sitios";
            fragmento = new HotelesFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.contenedor, fragmento);
            transaction.addToBackStack(null);
            transaction.commit();


        } else if (id == R.id.nav_res) {
            tag = "sitios";
            fragmento = new RestaurantesFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.contenedor, fragmento);
            transaction.addToBackStack(null);
            transaction.commit();

        } else if (id == R.id.nav_sitios) {
            tag = "sitios";
            fragmento = new SitiosFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.contenedor, fragmento);
            transaction.addToBackStack(null);
            transaction.commit();


        }



        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

        //Se crea la transaccion
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        //Se reemplaza el contenedor por el fragment
        transaction.replace(R.id.contenedor, fragmento);

        //Se agrega Fragmento y Tag
        transaction.add(fragmento, ""+tag);
        transaction.addToBackStack(null);

        ////Se sube transaccion
        transaction.commit();

    }
}
