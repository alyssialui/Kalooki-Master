package com.libratech.kalookimaster;

import com.libratech.kalookimaster.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button continue_game, new_game, multiplayer, settings;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        continue_game = (Button)findViewById(R.id.continueButton);
        new_game = (Button)findViewById(R.id.newGameButton);
        multiplayer = (Button)findViewById(R.id.multiplayerButton);
        settings = (Button)findViewById(R.id.settingsButton);
        
        continue_game.setOnClickListener(new OnClickListener()
	        {
	
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					try{
						Class menuOption = Class
								.forName("com.libratech.kaloookimaster.GameActivity");
						Intent chosenLayout = new Intent(MainActivity.this,
								menuOption)
								.putExtra(
										"option",
										"continue");
						startActivity(chosenLayout);
					}
					catch(Exception e)
					{
						
					}
				}
	        });
        
        new_game.setOnClickListener(new OnClickListener()
        {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				try{
					Class menuOption = Class
							.forName("com.libratech.kaloookimaster.GameActivity");
					Intent chosenLayout = new Intent(MainActivity.this,
							menuOption)
							.putExtra(
									"option",
									"new");
					startActivity(chosenLayout);
				}
				catch(Exception e)
				{
					
				}
			}
        });
        
        multiplayer.setOnClickListener(new OnClickListener()
        {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				try{
					Class menuOption = Class
							.forName("com.libratech.kaloookimaster.MultiplayerMenuActivity");
					Intent chosenLayout = new Intent(MainActivity.this,
							menuOption);
					startActivity(chosenLayout);
				}
				catch(Exception e)
				{
					
				}
			}
        });
        
        settings.setOnClickListener(new OnClickListener()
        {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				try{
					Class menuOption = Class
							.forName("com.libratech.kaloookimaster.SettingsActivity");
					Intent chosenLayout = new Intent(MainActivity.this,
							menuOption);
					startActivity(chosenLayout);
				}
				catch(Exception e)
				{
					
				}
			}
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
