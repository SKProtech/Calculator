package com.protech.inc.calculator;
 

//sorry guys not yet working perfect still have a litle work to do o:
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.graphics.Color;
import android.widget.TextView;
import android.view.MotionEvent;
import android.animation.ObjectAnimator;
import android.content.SharedPreferences;
import android.net.Uri;
import android.widget.Toast;
import android.icu.math.BigDecimal;


public class MainActivity extends Activity {
private Button b1,b2,b3,b4,b5,
               b6,b7,b8,b9,b0,
               b_pm,b_eq,b_per,
               b_du,b_x,b_d,b_c,
               b_p,b_m;
               
private TextView tShow,tAn;    
private SharedPreferences cal;
private android.graphics.drawable.GradientDrawable pr = new android.graphics.drawable.GradientDrawable();
private android.graphics.drawable.GradientDrawable pt = new android.graphics.drawable.GradientDrawable();
private android.graphics.drawable.GradientDrawable eq = new android.graphics.drawable.GradientDrawable();
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cal = getSharedPreferences("data",Activity.MODE_PRIVATE);
		
        //find view by ID
		b1 = findViewById(R.id.b1);
		b2 = findViewById(R.id.b2);
		b3 = findViewById(R.id.b3);
		b4 = findViewById(R.id.b4);
		b5 = findViewById(R.id.b5);
		b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        b_du = findViewById(R.id.b_du);
        b_x = findViewById(R.id.b_x);
        b_c = findViewById(R.id.b_c);
		b_m = findViewById(R.id.b_m);
        b_d = findViewById(R.id.b_d);
        b_pm = findViewById(R.id.b_pm);
        b_eq = findViewById(R.id.b_eq);
        b_per = findViewById(R.id.b_per);
		b_p = findViewById(R.id.b_p);
        tShow = findViewById(R.id.tShow);
        tAn = findViewById(R.id.tAn);
		
		
		//Buttons  Design
		numDesign(b1,30,"#FFFFFF");
		numDesign(b2,30,"#FFFFFF");
		numDesign(b3,30,"#FFFFFF");
		numDesign(b4,30,"#FFFFFF");
		numDesign(b5,30,"#FFFFFF");
		numDesign(b6,30,"#FFFFFF");
        numDesign(b7,30,"#FFFFFF");
		numDesign(b8,30,"#FFFFFF");
        numDesign(b9,30,"#FFFFFF");
		numDesign(b0,30,"#FFFFFF");
        numDesign(b_c,30,"#FFFFFF");
        numDesign(b_per,30,"#FFFFFF");
		numDesign(b_pm,30,"#FFFFFF");
		numDesign(b_du,30,"#FFFFFF");
		oprDesign(b_p,30,"#FF2196F3");
		oprDesign(b_m,30,"#FF2196F3");
        oprDesign(b_d,30,"#FF2196F3");
        oprDesign(b_x,30,"#FF2196F3");
        EqDesign(b_eq,30,"#FF2196F3");
        
        //Click Animation
        Click(b1,100);
        Click(b2,100);
        Click(b3,100);
        Click(b4,100);
        Click(b5,100);
        Click(b6,100);
        Click(b7,100);
        Click(b8,100);
        Click(b9,100);
        Click(b0,100);
        Click(b_c,100);
        Click(b_per,100);
        Click(b_pm,100);
        Click(b_du,100);
        Click(b_p,100);
        Click(b_eq,100);
        Click(b_m,100);
        Click(b_d,100);
        Click(b_x,100);
        
        
        
        //onClick Listener
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v1){
             
                tShow.setText(tShow.getText().toString() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v1){
                  

                    tShow.setText(tShow.getText().toString() + "2");
                }
            });
        b3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v1){

                    tShow.setText(tShow.getText().toString() + "3");
                }
            });
        b4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v1){

                    tShow.setText(tShow.getText().toString() + "4");
                }
            });
        b5.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v1){
                    
                   
                    tShow.setText(tShow.getText().toString() + "5");
                }
            });
        b6.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v1){

                    tShow.setText(tShow.getText().toString() + "6");
                }
            });
        b7.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v1){

                    tShow.setText(tShow.getText().toString() + "7");
                }
            });
        b8.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v1){

                    tShow.setText(tShow.getText().toString() + "8");
                }
            });
        b9.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v1){

                    tShow.setText(tShow.getText().toString() + "9");
                }
            });
        b0.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v1){

                    tShow.setText(tShow.getText().toString() + "0");
                }
            });
        b_du.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v1){

                    tShow.setText(tShow.getText().toString() + ".");
                }
            });
        b_per.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v1){
                 
                    tShow.setText(tShow.getText().toString() + "%");
                }
            });
        b_p.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v1){
                    
                    
              
                    tShow.setText(tShow.getText().toString() + "+");
                    
                    
                }
            });
        b_x.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v1){
                  
                      
                       

                    tShow.setText(tShow.getText().toString() + "×");
                }
            });
        b_pm.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v1){

                    tShow.setText(tShow.getText().toString() + "-");
                }
            });
        b_m.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v1){

                    tShow.setText(tShow.getText().toString() + "-");
                }
            });
        b_d.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v1){

                    tShow.setText(tShow.getText().toString() + "÷");
                }
            });
            
        b_c.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v1){
                  
                    if(! tAn.getText().toString().equals("")){
                        
                        tShow.setText("");
                        tAn.setText("");
                    }else{
                        
                    
                    
                    
                    if(tShow.getText().toString().length()>0){
                        
                        tShow.setText(tShow.getText().toString().substring(0,tShow.getText().toString().length()-1));
                        
                        }
                        
                        
                    
              }
                    

                    
                }
            });
         b_c.setOnLongClickListener(new View.OnLongClickListener(){
             
             @Override
             public boolean onLongClick(View vp){
                 
                 tShow.setText("");
                 
             return false;
                 }
                    
         });
            
            
        //equals to onClick
        b_eq.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v1){
                    
                        String d;
                        tShow.getText();
                        String expression = (tShow.getText()).toString();
                         
                        //for +
                        if(expression.contains("+")){
                            String[] numbers = expression.split("\\+");
                            String no1 = numbers[0];
                            String no2 = numbers[1];

                            int numb1 = Integer.valueOf(no1);
                            int numb2 = Integer.valueOf(no2);
                            int added = numb1+numb2;
                            

                            d = String.valueOf(added);
                            tAn.setText(d);
                            
                            

                        }
                        //for -
                    if(expression.contains("-")){
                        String[] numbers = expression.split("\\-");
                        String no1 = numbers[0];
                        String no2 = numbers[1];

                        int numb1 = Integer.valueOf(no1);
                        int numb2 = Integer.valueOf(no2);
                        int added = numb1-numb2;


                        d = String.valueOf(added);
                        tAn.setText(d);



                    }
                    //for x
                    if(expression.contains("×")){
                        String[] numbers = expression.split("\\×");
                        String no1 = numbers[0];
                        String no2 = numbers[1];

                        int numb1 = Integer.valueOf(no1);
                        int numb2 = Integer.valueOf(no2);
                        int added = numb1*numb2;


                        d = String.valueOf(added);
                        tAn.setText(d);



                    }
                    if(expression.contains("÷")){
                        String[] numbers = expression.split("\\÷");
                        String no1 = numbers[0];
                        String no2 = numbers[1];

                        Double numb1 = Double.valueOf(no1);
                        Double numb2 = Double.valueOf(no2);
                        Double added = numb1/numb2;


                        d = String.valueOf(added);
                        tAn.setText(d);



                    }
                  
                    }
     
                
            });
        
          
            
            
    }
    //for buttons design
	public void numDesign(final Button view,int i,String color){
		pr.setCornerRadius(i);
		pr.setColor(Color.parseColor(color));
		view.setElevation((float)15);
		view.setBackground(pr);
		
	}
    //for buttons design
    public void EqDesign(final Button view,int i,String color){
        eq.setCornerRadius(i);
        eq.setColor(Color.parseColor(color));
        view.setElevation((float)15);
        view.setBackground(eq);
        view.setTextColor(0xFFFFFFFF);

	}
    //for buttons design
	public void oprDesign(final Button b,int i,String color){
		pt.setCornerRadius(i);
		pt.setColor(Color.parseColor(color));
		b.setElevation(10);
		b.setBackground(pt);
		b.setTextColor(0xffffffff);
		
	}
    //for button animation
    public void Click(final View view,final int d){
        
        view.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    switch (event.getAction()){
                        case MotionEvent.ACTION_DOWN:{
                                ObjectAnimator scaleX = new ObjectAnimator();
                                scaleX.setTarget(view);
                                scaleX.setPropertyName("scaleX");
                                scaleX.setFloatValues(0.9f);
                                scaleX.setDuration(d);
                                scaleX.start();

                                ObjectAnimator scaleY = new ObjectAnimator();
                                scaleY.setTarget(view);
                                scaleY.setPropertyName("scaleY");
                                scaleY.setFloatValues(0.9f);
                                scaleY.setDuration(d);
                                scaleY.start();
                                break;
                            }
                        case MotionEvent.ACTION_UP:{

                                ObjectAnimator scaleX = new ObjectAnimator();
                                scaleX.setTarget(view);
                                scaleX.setPropertyName("scaleX");
                                scaleX.setFloatValues((float)1);
                                scaleX.setDuration(d);
                                scaleX.start();

                                ObjectAnimator scaleY = new ObjectAnimator();
                                scaleY.setTarget(view);
                                scaleY.setPropertyName("scaleY");
                                scaleY.setFloatValues((float)1);
                                scaleY.setDuration(d);
                                scaleY.start();

                                break;
                            }
                    }
                    return false;
                }
			});
    }
   
    
 }
    
    
