package computomovil.proyecto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_juegos).setOnClickListener(this);
        findViewById(R.id.btn_galeria).setOnClickListener(this);
        findViewById(R.id.btn_tiendas).setOnClickListener(this);
        findViewById(R.id.btn_mini_juego).setOnClickListener(this);
    }

    public void onClick(View v) {
        Class destino = null;

        switch (v.getId()){
            case R.id.btn_juegos:
                destino = juegosActivity.class;
                break;
            case R.id.btn_galeria:
                destino = galeriaActivity.class;
                break;
            case R.id.btn_tiendas:
                destino = tiendasActivity.class;
                break;
            case R.id.btn_mini_juego:
                destino = miniJuegoActivity.class;
                break;
        }
        if(destino != null) {
            Intent myIntent = new Intent(this, destino);
            startActivity(myIntent);
        }
    }

}
