package infoaryan.in.hc05_bluetooth;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class controle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controle);
        // Required
        public void setOnStateChangeListener(NskAlgoSdk.OnStateChangeListener listener);
        NskAlgoSdk nskAlgoSdk = new NskAlgoSdk();
        nskAlgoSdk.setOnStateChangeListener(new NskAlgoSdk.OnStateChangeListener() {
            @Override
            public void onStateChange(int state, int reason) {
                Log.i(TAG, "On State Change: " + state + " [reason:" + reason + "]");
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
// change UI elements here
                    }
                });
            }
        });
        public void setOnEyeBlinkDetectionListener(OnEyeBlinkDetectionListener listener);
        NskAlgoSdk nskAlgoSdk = new NskAlgoSdk();
        nskAlgoSdk.setOnEyeBlinkDetectionListener(new NskAlgoSdk.OnEyeBlinkDetectionListener() {
            @Override
            public void onEyeBlinkDetection(int value) {
                Log.i(TAG, "NskAlgoEyeBlinkDetectionListener: Eye blink detected");
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
// change UI elements here
                    }
                });
            }
        })
    }
}