package computomovil.proyecto;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;

import java.util.Timer;
import java.util.TimerTask;

public class LauncherActivity extends Activity {

    public static final long SPLASH_SCREEN_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        
        setContentView(R.layout.activity_launcher);

        TimerTask myTask = new TimerTask() {
            @Override
            public void run() {
                Intent myIntent = new Intent().setClass(
                        LauncherActivity.this, MainActivity.class
                );
                startActivity(myIntent);
                finish();
            }
        };

        Timer myTimer = new Timer();
        myTimer.schedule(myTask, SPLASH_SCREEN_DELAY);
    }
}
