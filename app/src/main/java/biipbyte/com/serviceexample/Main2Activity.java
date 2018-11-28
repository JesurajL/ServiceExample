package biipbyte.com.serviceexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_new);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent  intent =new Intent(this,MusicPlayerService.class);
        startService(intent);

    }
    protected void onStop(){
        super.onStop();
        Intent intent = new Intent(this, MusicPlayerService.class);
        stopService(intent);
    }
}
