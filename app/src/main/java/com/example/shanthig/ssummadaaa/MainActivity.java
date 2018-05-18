package com.example.shanthig.ssummadaaa;

import android.annotation.SuppressLint;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.LinearLayout.LayoutParams;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    boolean  a1 = true;
    boolean  a2 = true;
    boolean  a3 = true;
    boolean  a4 = true;
    boolean  a5 = true;
    boolean  a6 = true;
    boolean  a11 = true;
    boolean  a21 = true;
    boolean  a31 = true;
    boolean  a41 = true;
    boolean  a51 = true;
    boolean  a61 = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @SuppressLint("ResourceType")
    public void time(View view) {
        boolean  a11 = true;
        boolean  a21 = true;
        boolean  a31 = true;
        boolean  a41 = true;
        boolean  a51 = true;
        boolean  a61 = true;



        int num=0;



        int c=0;
        int b=0;
        int d=0;
        int e=0;
        int f=0;
        int a[]={1,2,3,4,5};
        Random ran =new Random();
        int num1=ran.nextInt(6)+1;





        if(num1==1&&a1==true){
        a1=false;

        b++;
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.middle);

        TextView time=(TextView)findViewById(R.id.textView2);
        time.setText("you got the power stones");
        TextView textView1 = new TextView(this);
            textView1.setId(R.id.textview16);



        textView1.setLayoutParams(new ViewGroup.LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.MATCH_PARENT));

        textView1.setText("power stones");
        textView1.setBackgroundColor(0xff888888); // hex color 0xAARRGGBB
        textView1.setPadding(20, 20, 20, 20);// in pixels (left, top, right, bottom)
        linearLayout.addView(textView1);}
        if(num1==2&&a2==true){
            ++c;

            a2=false;
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.middle);
            TextView time=(TextView)findViewById(R.id.textView2);
            time.setText("you got the space stones");
            TextView textView1 = new TextView(this);
            textView1.setId(R.id.textview15);
            textView1.setLayoutParams(new ViewGroup.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            textView1.setText("spaces stones");
            textView1.setBackgroundColor(0xff0000ff); // hex color 0xAARRGGBB
            textView1.setPadding(20, 20, 20, 20);// in pixels (left, top, right, bottom)
            linearLayout.addView(textView1);}
        if(num1==3&&a3==true){
            a3=false;
             ++d;
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.middle);
            TextView time=(TextView)findViewById(R.id.textView2);
            time.setText("you got the reality stones");
            TextView textView1 = new TextView(this);
            textView1.setId(R.id.textview14);
            textView1.setLayoutParams(new ViewGroup.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            textView1.setText("Reality stones");
            textView1.setBackgroundColor(0xffff0000); // hex color 0xAARRGGBB
            textView1.setPadding(20, 20, 20, 20);// in pixels (left, top, right, bottom)
            linearLayout.addView(textView1);}
        if(num1==4&&a4==true){
            a4=false;
                ++e;
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.middle);
            TextView time=(TextView)findViewById(R.id.textView2);
            time.setText("you got the soul stones ");
            TextView textView1 = new TextView(this);
            textView1.setId(R.id.textview13);
            textView1.setLayoutParams(new ViewGroup.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            textView1.setText("Soul stones");
            textView1.setBackgroundColor(0xff66ff66); // hex color 0xAARRGGBB
            textView1.setPadding(20, 20, 20, 20);// in pixels (left, top, right, bottom)
            linearLayout.addView(textView1);}
        if(num1==5&&a5==true){
            a5=false;
               ++f;
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.middle);
            TextView time=(TextView)findViewById(R.id.textView2);
            time.setText("you got time stone");
            TextView textView2 = new TextView(this);
            textView2.setId(R.id.textview12);
            textView2.setLayoutParams(new ViewGroup.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            textView2.setText("time stone");
            textView2.setBackgroundColor(0xff00ff00); // hex color 0xAARRGGBB
            textView2.setPadding(20, 20, 20, 20);// in pixels (left, top, right, bottom)
            linearLayout.addView(textView2);}
        if(num1==6&&a6==true){
            a6=false;
            ++f;
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.middle);
            TextView time=(TextView)findViewById(R.id.textView2);
            time.setText("you got mind stone");
            TextView textView1 = new TextView(this);
            textView1.setId(R.id.textview11);
            textView1.setLayoutParams(new ViewGroup.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            textView1.setText("mind stone");
            textView1.setBackgroundColor(0xffffff00); // hex color 0xAARRGGBB
            textView1.setPadding(20, 20, 20, 20);// in pixels (left, top, right, bottom)
            linearLayout.addView(textView1);}
            if(a1==false) {
                if (a2==false) {
                    if (a3==false) {
                        if (a4==false) {
                            if (a5==false){
                            if(a6==false){ TextView water= (TextView)findViewById(R.id.textView5);
                                         water.setText("You got the all the stones");}


                            }
                        }
                    }
                }
            }


    }

    public void reset(View view) {
        if(a5==false) {
            TextView time2 = (TextView) findViewById(R.id.textview12);
            Log.i("reset", "worked");
            time2.setText("            ");
            time2.setBackgroundColor(0x00000000);



        }
        if(a4==false){
        TextView time3= (TextView)findViewById(R.id.textview13);
        time3.setText("             ");
        time3.setBackgroundColor(0x00000000);
             }
        if(a3==false){
        TextView time4= (TextView)findViewById(R.id.textview14);
        time4.setText("         ");
        time4.setBackgroundColor(0x00000000);
            }
        if(a2==false){
        TextView time5= (TextView)findViewById(R.id.textview15);
        time5.setText("          ");

        time5.setBackgroundColor(0x00000000);
            }
        if(a1==false) {
            TextView time6 = (TextView) findViewById(R.id.textview16);
            time6.setText("       ");
            time6.setBackgroundColor(0x00000000);

        }
        if(a6==false) {
            TextView time7 = (TextView) findViewById(R.id.textview11);
            time7.setText("        ");
            time7.setBackgroundColor(0x00000000);


        }
        TextView water= (TextView)findViewById(R.id.textView5);
        water.setText("                          ");

        TextView water1= (TextView)findViewById(R.id.textView2);
        water1.setText("click the button");
        LinearLayout linearLayout1 = (LinearLayout) findViewById(R.id.middle);






        a1=true;
        a2=true;
        a3=true;
        a4=true;
        a5=true;
        a6=true;

    }
}
