package com.domino.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int x=0,n=8;
    String s1="",s2="",s3="",s4="",s5="",s6="",s7="",s8="",s9="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void but1(View view)
    {
        if(x==n)
        {
            TextView s= (TextView) findViewById(R.id.cong);
            s.setText("It's a draw");
        }
        display1(x++);
    }

    public void display1(int x)
    {
        TextView s= (TextView) findViewById(R.id.but1);
        if(n==-1)
            return;
        if(s1=="X" || s1=="0")
        {
            n++;
            return;
        }
            if(x%2==0)
                s.setText("X");
            else
                s.setText("0");
            s1=s.getText().toString();
            if(((s1==s2 && s2==s3) || (s1==s4 && s4==s7)) && s1!="")
                display(x);

    }


    public void but2(View view)
    {
        if(x==n)
        {
            TextView s= (TextView) findViewById(R.id.cong);
            s.setText("It's a draw");
        }
        display2(x++);
    }
    public void display2(int x)
    {
        if(n==-1)
            return;
        TextView s= (TextView) findViewById(R.id.but2);
        if(s2=="X" || s2=="0")
        {
            n++;
            return;
        }
        if(x%2==0)
            s.setText("X");
        else
            s.setText("0");
        s2=s.getText().toString();
        if(((s2==s1 && s2==s3) || (s2==s5 && s5==s8)) && s2!="")
            display(x);
    }


    public void but3(View view)
    {
        if(x==n)
        {
            TextView s= (TextView) findViewById(R.id.cong);
            s.setText("It's a draw");
        }
        display3(x++);
    }
    public void display3(int x)
    {
        if(n==-1)
            return;
        if(s3=="X" || s3=="0")
        {
            n++;
            return;
        }
        Button s = findViewById(R.id.but3);
        if(x%2==0)
            s.setText("X");
        else
            s.setText("0");
        s3=s.getText().toString();
        if(((s3==s6 && s3==s9) || (s3==s2 && s3==s1) || (s3==s5 && s3==s7)) && s3!="")
            display(x);
    }


    public void but4(View view)
    {
        if(x==n)
        {
            TextView s= (TextView) findViewById(R.id.cong);
            s.setText("It's a draw");
        }
        display4(x++);
    }
    public void display4(int x)
    {
        if(n==-1)
            return;
        if(s4=="X" || s4=="0")
        {
            n++;
            return;
        }
        TextView s= (TextView) findViewById(R.id.but4);
        if(x%2==0)
            s.setText("X");
        else
            s.setText("0");
        s4=s.getText().toString();
        if(((s4==s1 && s4==s7) || (s4==s5 && s4==s6)) && s4!="")
            display(x);
    }


    public void but5(View view)
    {
        if(x==n)
        {
            TextView s= (TextView) findViewById(R.id.cong);
            s.setText("It's a draw");
        }
        display5(x++);
    }
    public void display5(int x)
    {
        if(n==-1)
            return;
        if(s5=="X" || s5=="0")
        {
            n++;
            return;
        }
        TextView s= (TextView) findViewById(R.id.but5);
        if(x%2==0)
            s.setText("X");
        else
            s.setText("0");
        s5=s.getText().toString();
        if(((s5==s2 && s5==s8) || (s5==s4 && s5==s6) || (s5==s1 && s5==s9) || (s5==s7 && s5==s3)) && s5!="")
            display(x);
    }


    public void but6(View view)
    {
        if(x==n)
        {
            TextView s= (TextView) findViewById(R.id.cong);
            s.setText("It's a draw");
        }
        display6(x++);
    }
    public void display6(int x)
    {
        if(n==-1)
            return;
        if(s6=="X" || s6=="0")
        {
            n++;
            return;
        }
        TextView s= (TextView) findViewById(R.id.but6);
        if(x%2==0)
            s.setText("X");
        else
            s.setText("0");
        s6=s.getText().toString();
        if(((s6==s5 && s6==s4) || (s6==s3 && s6==s9)) && s6!="")
            display(x);
    }


    public void but7(View view)
    {
        if(x==n)
        {
            TextView s= (TextView) findViewById(R.id.cong);
            s.setText("It's a draw");
        }
        display7(x++);
    }
    public void display7(int x)
    {
        if(n==-1)
            return;
        if(s7=="X" || s7=="0")
        {
            n++;
            return;
        }
        TextView s= (TextView) findViewById(R.id.but7);
        if(x%2==0)
            s.setText("X");
        else
            s.setText("0");
        s7=s.getText().toString();
        if(((s7==s8 && s7==s9) || (s7==s4 && s7==s1) || (s7==s5 && s7==s3)) && s7!="")
            display(x);
    }

    public void but8(View view)
    {

        if(x==n)
        {
            TextView s= (TextView) findViewById(R.id.cong);
            s.setText("It's a draw");
        }
        display8(x++);
    }
    public void display8(int x)
    {
        if(n==-1)
            return;
        if(s8=="X" || s8=="0")
        {
            n++;
            return;
        }
        TextView s= (TextView) findViewById(R.id.but8);
        if(x%2==0)
            s.setText("X");
        else
            s.setText("0");
        s8=s.getText().toString();
        if(((s8==s7 && s8==s9) || (s8==s5 && s8==s2)) && s8!="")
            display(x);
    }


    public void but9(View view)
    {
        if(x==n)
        {
            TextView s= (TextView) findViewById(R.id.cong);
            s.setText("It's a draw");
        }
        display9(x++);
    }
    public void display9(int x)
    {
        if(n==-1)
            return;
        if(s9=="X" || s9=="0")
        {
            n++;
            return;
        }
        TextView s= (TextView) findViewById(R.id.but9);
        if(x%2==0)
            s.setText("X");
        else
            s.setText("0");
        System.out.println(x);
        s9=s.getText().toString();
        if(((s9==s8 && s9==s7) || (s9==s6 && s9==s3) || (s9==s5 && s9==s1)) && s9!="")
            display(x);
    }

    public void display(int x)
    {
        TextView s= (TextView) findViewById(R.id.cong);
        if(x==8)
            s.setText("Its a Draw!!");
        else if(x%2==0)
        {
            s.setText("Player1 wins!!");
            n=-1;
        }
        else {
            s.setText("Player2 wins!!");
            n = -1;
        }

    }

    public void resetbutton(View view)
    {
        TextView s= (TextView) findViewById(R.id.but1);
        s.setText("");
        s= (TextView) findViewById(R.id.but2);
        s.setText("");
        s= (TextView) findViewById(R.id.but3);
        s.setText("");
        s= (TextView) findViewById(R.id.but4);
        s.setText("");
        s= (TextView) findViewById(R.id.but5);
        s.setText("");
        s= (TextView) findViewById(R.id.but6);
        s.setText("");
        s= (TextView) findViewById(R.id.but7);
        s.setText("");
        s= (TextView) findViewById(R.id.but8);
        s.setText("");
        s= (TextView) findViewById(R.id.but9);
        s.setText("");
        s= (TextView) findViewById(R.id.cong);
        s.setText("");
        x=0;
        n=8;
        s1=s2=s3=s4=s5=s6=s7=s8=s9=null;
    }
}