package nitt.hackathon.oxytrees;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by HP on 06-Oct-17.
 */

public class Thanks extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_thanks);

    }

    public void back(View view)
    {

        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

}
