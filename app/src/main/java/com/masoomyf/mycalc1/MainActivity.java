package com.masoomyf.mycalc1;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;



public class MainActivity extends Activity 
{

	// Making variables to hold widgets
	private TextView tvAnswer;
	
	private EditText etNum1;
	//Write variable for num2
	
	private Button btnAdd;
	// Write variable for button multiply
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		//Assigning widget to varibales
		tvAnswer = findViewById(R.id.tvAnswer);
		
		//Write below to assign rest of widgets
		
		
		
		//------------------------------------
		
		btnAdd.setOnClickListener(addListener);
		// set listener for btnMultiply below and pass it to multiplyListener
		
		
		
		// --------------------
    }
	
	
	private View.OnClickListener addListener = new View.OnClickListener(){

		@Override
		public void onClick(View p1) {
			// TODO: Implement this method
		}

		
	};
	
	private View.OnClickListener multiplyListener = new View.OnClickListener(){

		@Override
		public void onClick(View p1) {
			int num1 = getNumber( etNum1);
			// change below etNum1 
			int num2 = getNumber(etNum1);
			
			int ans = num1 * num2;
			
			tvAnswer.setText(String.valueOf(ans));
		}

		private int getNumber(EditText et) {
			// TODO: Implement this method
			return Integer.parseInt(et.getText().toString());
		}

		
	};
}
