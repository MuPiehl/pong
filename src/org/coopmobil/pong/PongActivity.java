package org.coopmobil.pong;

import android.app.Activity;
import android.os.Bundle;
import org.coopmobil.pong.views.PlayGroundView;

public class PongActivity extends Activity
{

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        PlayGroundView pgView = new PlayGroundView(this);
    }
}
