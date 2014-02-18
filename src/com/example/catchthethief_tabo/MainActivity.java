package com.example.catchthethief_tabo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
	int num;
	View v;
	boolean gameon = false;
	int attempt;
   
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
	int result;
	int x=1,y=1;
	int i = 0;
	 
    public void GetNumber(int bt,int add){
    	if(gameon == false)	Toast.makeText(MainActivity.this, getResources().getString(R.string.Start_Game_First), Toast.LENGTH_SHORT).show();
    	else{
    	i += add;
    	if(i == 1){
    		x = bt;
    		return;
    	}
    	if(i == 2){
    		y = bt;
    		i = 0;
    	}
    	result = x*10+y;
    	Toast.makeText(MainActivity.this, ""+result, Toast.LENGTH_SHORT).show(); //Testing
    	attempt ++;
    	GatherNumber(result);
    	}
    }
    
    public void GatherNumber(int result){
    	if(result == num){
    		Toast.makeText(MainActivity.this, getResources().getString(R.string.Win), Toast.LENGTH_LONG).show();
    		Toast.makeText(MainActivity.this, getResources().getString(R.string.Attempt)+attempt, Toast.LENGTH_LONG).show();
    		gameon = false;
    	}
    	else if(result < num){
    		//if((num-90))
    		Toast.makeText(MainActivity.this, getResources().getString(R.string.Bigger), Toast.LENGTH_LONG).show();
    	}
    	else if(result > num){
    		/*
    		if((result-num <=99) && (result-num > 50)) Toast.makeText(MainActivity.this, "MUCH more Smaller", Toast.LENGTH_LONG).show();
    		else if((result-num <=50) && (result-num > 25)) Toast.makeText(MainActivity.this, "More Smaller", Toast.LENGTH_LONG).show();
    		else if((result-num <=25) && (result-num > 10)) Toast.makeText(MainActivity.this, "Smaller", Toast.LENGTH_LONG).show();
    		else if((result-num <=10) && (result-num > 5)) Toast.makeText(MainActivity.this, "Close", Toast.LENGTH_LONG).show();
    		else if((result-num <=5) && (result-num >= 1)) Toast.makeText(MainActivity.this, "Its just near it", Toast.LENGTH_LONG).show();
    		*/
    		Toast.makeText(MainActivity.this, getResources().getString(R.string.Smaller), Toast.LENGTH_LONG).show();
        }
    	
    }
    
    public void ClickMethod(View v){
    	switch(v.getId()){
    	case R.id.button1:
    		GetNumber(1,1);    		
    		break;
    	case R.id.button2:
    		GetNumber(2,1);    		
    		break;
    	case R.id.button3:
    		GetNumber(3,1);
    		break;
    	case R.id.button4:
    		GetNumber(4,1);
    		break;
    	case R.id.button5:
    		GetNumber(5,1);
    		break;
    	case R.id.button6:
    		GetNumber(6,1);
    		break;
    	case R.id.button7:
    		GetNumber(7,1);
    		break;
    	case R.id.button8:
    		GetNumber(8,1);
    		break;
    	case R.id.button9:
    		GetNumber(9,1);
    		break;
    	case R.id.button10:
    		GetNumber(0,1);
    		break;
    	case R.id.button11:
    		if(gameon == true){
        		Toast.makeText(MainActivity.this, getResources().getString(R.string.Game_Already_On), Toast.LENGTH_SHORT).show();
        	}
    		else if(gameon == false){
        		
    			num = (int)(Math.random()*101);
        		Toast.makeText(MainActivity.this, getResources().getString(R.string.Game_Start_Now), Toast.LENGTH_SHORT).show();
        		gameon = true;
        		attempt = 0;
        	}
        	break;
    	case R.id.button12:
    		if(gameon == true){
        		Toast.makeText(MainActivity.this,getResources().getString(R.string.Game_stopping), Toast.LENGTH_SHORT).show();
        		gameon = false;
        	}
    		else if(gameon == false){
        		Toast.makeText(MainActivity.this, getResources().getString(R.string.Game_Already_Stopped), Toast.LENGTH_SHORT).show();
        	}
        	break;
    		
    	}
    }
}
