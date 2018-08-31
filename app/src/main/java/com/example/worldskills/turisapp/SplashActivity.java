
package com.example.worldskills.turisapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Genera la vista
        View decoracionNavegadorBar = getWindow().getDecorView();

        //Oculta la barra de navegacion
        int opciones = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decoracionNavegadorBar.setSystemUiVisibility(opciones);

        //Handler para cronometrizar el splahs
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //Se hace el intent hacia PrincipalActivity
                Intent intent = new Intent(getApplicationContext(),PrincipalActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }
}
