package computomovil.proyecto;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class tiendasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiendas);

        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:19.372501,-99.16423"));
        startActivity(myIntent);
    }
}
