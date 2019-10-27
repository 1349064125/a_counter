package com.example.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView operator, number, menu;
    public String string, string1;
    private ImageButton imageButton0, imageButton1, imageButton2, imageButton3, imageButton4, imageButton5, imageButton6, imageButton7, imageButton8, imageButton9,
            imageButtonc, imageButtontui, imageButtonadd, imageButtonsub, imageButtonmul, imageButtondiv, imageButtonxiao, imageButtonzuo, imageButtonyou, imageButtondeng,
            imageButtonmo, imageButtonpai, imageButtonqian, imageButtonhou;
    private numStack numstack, numstack1;
    private operaStack operastack, operastack1;
    private boolean flagnum = false, flagxiao = false, flagright = true, flagyou = false, flagdeng = false, flagzong = true;
    private float num, num1;
    private int xiao;
    private queue queue;
    private String now;
    String[] chars = new String[]{//定义4*4 16个按钮文本数组
            ">", ">", "<", "<", "<", "<", ">", ">",
            ">", ">", "<", "<", "<", "<", ">", ">",
            ">", ">", ">", ">", ">", "<", ">", ">",
            ">", ">", ">", ">", ">", "<", ">", ">",
            ">", ">", ">", ">", ">", "<", ">", ">",
            "<", "<", "<", "<", "<", "<", "=", "x",
            ">", ">", ">", ">", ">", "x", ">", ">",
            "<", "<", "<", "<", "<", "<", "x", "=",
    };
    String[] chara = new String[]{
            "+", "-", "*", "%", "/", "(", ")", "#"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setfind();
        operator = findViewById(R.id.operator);
        number = findViewById(R.id.number);
        menu = findViewById(R.id.menu);
        string = "";
        string1 = "";
        operastack = new operaStack();
        operastack1 = new operaStack();
        numstack = new numStack();
        numstack1 = new numStack();
        operastack.push("#");
        operastack1.push("#");
        num = 0;
        xiao = 0;
        queue = new queue();
    }

    public void setfind() {
        imageButton0 = (ImageButton) findViewById(R.id.button0);
        imageButton0.setOnClickListener(this);
        imageButton1 = (ImageButton) findViewById(R.id.button1);
        imageButton1.setOnClickListener(this);
        imageButton2 = (ImageButton) findViewById(R.id.button2);
        imageButton2.setOnClickListener(this);
        imageButton3 = (ImageButton) findViewById(R.id.button3);
        imageButton3.setOnClickListener(this);
        imageButton4 = (ImageButton) findViewById(R.id.button4);
        imageButton4.setOnClickListener(this);
        imageButton5 = (ImageButton) findViewById(R.id.button5);
        imageButton5.setOnClickListener(this);
        imageButton6 = (ImageButton) findViewById(R.id.button6);
        imageButton6.setOnClickListener(this);
        imageButton7 = (ImageButton) findViewById(R.id.button7);
        imageButton7.setOnClickListener(this);
        imageButton8 = (ImageButton) findViewById(R.id.button8);
        imageButton8.setOnClickListener(this);
        imageButton9 = (ImageButton) findViewById(R.id.button9);
        imageButton9.setOnClickListener(this);
        imageButtonc = (ImageButton) findViewById(R.id.qingkong);
        imageButtonc.setOnClickListener(this);
        imageButtontui = (ImageButton) findViewById(R.id.tuige);
        imageButtontui.setOnClickListener(this);
        imageButtonadd = (ImageButton) findViewById(R.id.add);
        imageButtonadd.setOnClickListener(this);
        imageButtonsub = (ImageButton) findViewById(R.id.sub);
        imageButtonsub.setOnClickListener(this);
        imageButtonmul = (ImageButton) findViewById(R.id.mul);
        imageButtonmul.setOnClickListener(this);
        imageButtondiv = (ImageButton) findViewById(R.id.div);
        imageButtondiv.setOnClickListener(this);
        imageButtonxiao = (ImageButton) findViewById(R.id.buttondian);
        imageButtonxiao.setOnClickListener(this);
        imageButtonzuo = (ImageButton) findViewById(R.id.zuo);
        imageButtonzuo.setOnClickListener(this);
        imageButtonyou = (ImageButton) findViewById(R.id.you);
        imageButtonyou.setOnClickListener(this);
        imageButtondeng = (ImageButton) findViewById(R.id.deng);
        imageButtondeng.setOnClickListener(this);
        imageButtonmo = (ImageButton) findViewById(R.id.mo);
        imageButtonmo.setOnClickListener(this);
        imageButtonpai = (ImageButton) findViewById(R.id.pai);
        imageButtonpai.setOnClickListener(this);
        imageButtonqian = (ImageButton) findViewById(R.id.qian);
        imageButtonqian.setOnClickListener(this);
        imageButtonhou = (ImageButton) findViewById(R.id.hou);
        imageButtonhou.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button0:
                if (flagdeng == true)
                    break;
                if (flagyou)
                    break;
                string = string + '0';
                menu.setText(string);
                num = num * 10;
                flagnum = true;
                if (flagxiao == true)
                    xiao++;
                break;
            case R.id.button1:
                if (flagdeng == true)
                    break;
                if (flagyou)
                    break;
                string = string + '1';
                menu.setText(string);
                num = num * 10 + 1;
                flagnum = true;
                if (flagxiao == true)
                    xiao++;
                break;
            case R.id.button2:
                if (flagdeng == true)
                    break;
                if (flagyou)
                    break;
                string = string + '2';
                menu.setText(string);
                num = num * 10 + 2;
                flagnum = true;
                if (flagxiao == true)
                    xiao++;
                break;
            case R.id.button3:
                if (flagdeng == true)
                    break;
                if (flagyou)
                    break;
                string = string + '3';
                menu.setText(string);
                num = num * 10 + 3;
                flagnum = true;
                if (flagxiao == true)
                    xiao++;
                break;
            case R.id.button4:
                if (flagdeng == true)
                    break;
                if (flagyou)
                    break;
                string = string + '4';
                menu.setText(string);
                num = num * 10 + 4;
                flagnum = true;
                if (flagxiao == true)
                    xiao++;
                break;
            case R.id.button5:
                if (flagdeng == true)
                    break;
                if (flagyou)
                    break;
                string = string + '5';
                menu.setText(string);
                num = num * 10 + 5;
                flagnum = true;
                if (flagxiao == true)
                    xiao++;
                break;
            case R.id.button6:
                if (flagdeng == true)
                    break;
                if (flagyou)
                    break;
                string = string + '6';
                menu.setText(string);
                num = num * 10 + 6;
                flagnum = true;
                if (flagxiao == true)
                    xiao++;
                break;
            case R.id.button7:
                if (flagdeng == true)
                    break;
                if (flagyou)
                    break;
                string = string + '7';
                menu.setText(string);
                num = num * 10 + 7;
                flagnum = true;
                if (flagxiao == true)
                    xiao++;
                break;
            case R.id.button8:
                if (flagdeng == true)
                    break;
                if (flagyou)
                    break;
                string = string + '8';
                menu.setText(string);
                num = num * 10 + 8;
                flagnum = true;
                if (flagxiao == true)
                    xiao++;
                break;
            case R.id.button9:
                if (flagdeng == true)
                    break;
                if (flagyou)
                    break;
                string = string + '9';
                menu.setText(string);
                num = num * 10 + 9;
                flagnum = true;
                if (flagxiao == true)
                    xiao++;
                break;
            case R.id.qian:
                flagzong = true;
                string1 = "";
                numstack.setJ();
                for (int k = 0; k < numstack.getI(); k++)
                    string1 = string1 + "  " + numstack.getstack();
                number.setText(string1);

                string1 = "";
                operastack.setJ();
                for (int k = 0; k < operastack.getI(); k++)
                    string1 = string1 + "  " + operastack.getstack();
                operator.setText(string1);
                break;
            case R.id.hou:
                flagzong = false;
                string1 = "";
                queue.setJ();
                for (int k = 0; k < queue.gethigh() - 1; k++) {
                    string1 = string1 + "" + queue.scans();
                    queue.addj();
                }
                operator.setText(string1);

                string1 = "";
                operastack1.setJ();
                for (int k=0;k<operastack1.getI();k++){
                    string1 = string1+" "+operastack1.getstack();
                }
                number.setText(string1);
                operastack1.setJ();
                break;
            case R.id.qingkong:
                menu.setText("");
                operator.setText("");
                number.setText("");
                operastack.emptyMake();
                operastack1.emptyMake();
                numstack.emptyMake();
                numstack1.emptyMake();
                operastack.push("#");
                operastack1.push("#");
                queue.emptymake();
                string1 = "";
                num = 0;
                xiao = 0;
                string = "";
                flagnum = false;
                flagxiao = false;
                flagright = true;
                flagyou = false;
                flagdeng = false;
                break;
            case R.id.tuige:
                if (num == 0)
                    flagnum = false;
                if (num != 0) {
                    if (string.length() == 0)
                        break;
                    string = string.substring(0, string.length() - 1);
                    menu.setText(string);
                    float b = num;
                    int a = (int) num / 10;
                    num = a;
                    if (flagxiao == true) {
                        if (xiao == 0) {
                            num = b;
                            flagxiao = false;
                        } else
                            xiao--;
                    }
                }
                break;
            case R.id.buttondian:
                if (flagxiao == false) {
                    xiao = 0;
                    flagxiao = true;
                    string = string + '.';
                    menu.setText(string);
                }
                break;
            case R.id.add:
                if (flagdeng == true)
                    flagdeng = false;
                if (flagnum == false)
                    break;
                else {
                    flagnum = false;
                    string = string + '+';
                    menu.setText(string);
                    if (xiao != 0) {
                        for (int k = 1; k <= xiao; k++)
                            num = num / 10;
                    }
                    if (flagyou == false) {
                        numstack.push(num);
                        numstack1.push(num);
                        queue.enQueue(num + "");
                    } else flagyou = false;

                    num = 0;
                    now = "+";
                    compere1(operastack1.getTop(), now);
                    compere(operastack.getTop(), now);


                    if (flagzong) {
                        string1 = "";
                        numstack.setJ();
                        for (int k = 0; k < numstack.getI(); k++)
                            string1 = string1 + "  " + numstack.getstack();
                        number.setText(string1);

                        string1 = "";
                        operastack.setJ();
                        for (int k = 0; k < operastack.getI(); k++)
                            string1 = string1 + "  " + operastack.getstack();
                        operator.setText(string1);
                    } else {
                        string1 = "";
                        queue.setJ();
                        for (int k = 0; k < queue.gethigh() - 1; k++) {
                            string1 = string1 + "" + queue.scans();
                            queue.addj();
                        }
                        operator.setText(string1);

                        string1 = "";
                        operastack1.setJ();
                        for (int k=0;k<operastack1.getI();k++){
                            string1 = string1+" "+operastack1.getstack();
                        }
                        number.setText(string1);
                        operastack1.setJ();
                    }

                    xiao = 0;
                    flagxiao = false;
                }
                break;
            case R.id.pai:
                if (flagnum == true)
                    break;
                if (flagyou)
                    break;
                flagnum = true;
                flagdeng = true;
                num = 31415926;
                string = string + "π";
                menu.setText(string);
                xiao = 7;
                flagxiao = true;
                break;
            case R.id.sub:
                if (flagdeng == true)
                    flagdeng = false;
                if (flagnum == false)
                    break;
                else {
                    flagnum = false;
                    string = string + '-';
                    menu.setText(string);
                    if (xiao != 0) {
                        for (int k = 1; k <= xiao; k++)
                            num = num / 10;
                    }
                    if (flagyou == false) {
                        numstack.push(num);
                        numstack1.push(num);
                        queue.enQueue(num + "");
                    } else flagyou = false;
                    num = 0;
                    now = "-";
                    compere1(operastack1.getTop(), now);
                    compere(operastack.getTop(), now);
                    if (flagzong) {
                        string1 = "";
                        numstack.setJ();
                        for (int k = 0; k < numstack.getI(); k++)
                            string1 = string1 + "  " + numstack.getstack();
                        number.setText(string1);

                        string1 = "";
                        operastack.setJ();
                        for (int k = 0; k < operastack.getI(); k++)
                            string1 = string1 + "  " + operastack.getstack();
                        operator.setText(string1);
                    } else {
                        string1 = "";
                        queue.setJ();
                        for (int k = 0; k < queue.gethigh() - 1; k++) {
                            string1 = string1 + "" + queue.scans();
                            queue.addj();
                        }

                        operator.setText(string1);

                        string1 = "";
                        operastack1.setJ();
                        for (int k=0;k<operastack1.getI();k++){
                            string1 = string1+" "+operastack1.getstack();
                        }
                        number.setText(string1);
                        operastack1.setJ();
                    }
                    xiao = 0;
                    flagxiao = false;
                }
                break;
            case R.id.mul:
                if (flagdeng == true)
                    flagdeng = false;
                if (flagnum == false)
                    break;
                else
                    flagnum = false;
                string = string + '*';
                menu.setText(string);
                if (xiao != 0) {
                    for (int k = 1; k <= xiao; k++)
                        num = num / 10;
                }
                if (flagyou == false) {
                    numstack.push(num);
                    numstack1.push(num);
                    queue.enQueue(num + "");
                } else flagyou = false;
                num = 0;
                now = "*";
                compere1(operastack1.getTop(), now);
                compere(operastack.getTop(), now);

                if (flagzong) {
                    string1 = "";
                    numstack.setJ();
                    for (int k = 0; k < numstack.getI(); k++)
                        string1 = string1 + "  " + numstack.getstack();
                    number.setText(string1);

                    string1 = "";
                    operastack.setJ();
                    for (int k = 0; k < operastack.getI(); k++)
                        string1 = string1 + "  " + operastack.getstack();
                    operator.setText(string1);
                } else {
                    string1 = "";
                    queue.setJ();
                    for (int k = 0; k < queue.gethigh() - 1; k++) {
                        string1 = string1 + "" + queue.scans();
                        queue.addj();
                    }

                    operator.setText(string1);


                    string1 = "";
                    operastack1.setJ();
                    for (int k=0;k<operastack1.getI();k++){
                        string1 = string1+" "+operastack1.getstack();
                    }
                    number.setText(string1);
                    operastack1.setJ();
                }
                xiao = 0;
                flagxiao = false;
                break;
            case R.id.mo:
                if (flagnum == false)
                    break;
                flagnum = false;
                if (flagdeng == true)
                    flagdeng = false;
                if (flagxiao == true)
                    break;
                string = string + '%';
                menu.setText(string);
                if (flagyou == false) {
                    numstack.push(num);
                    numstack1.push(num);
                    queue.enQueue(num + "");
                } else flagyou = false;
                num = 0;
                now = "%";
                compere1(operastack1.getTop(), now);
                compere(operastack.getTop(), now);


                if (flagzong) {
                    string1 = "";
                    numstack.setJ();
                    for (int k = 0; k < numstack.getI(); k++)
                        string1 = string1 + "  " + numstack.getstack();
                    number.setText(string1);

                    string1 = "";
                    operastack.setJ();
                    for (int k = 0; k < operastack.getI(); k++)
                        string1 = string1 + "  " + operastack.getstack();
                    operator.setText(string1);
                } else {
                    string1 = "";
                    queue.setJ();
                    for (int k = 0; k < queue.gethigh() - 1; k++) {
                        string1 = string1 + "" + queue.scans();
                        queue.addj();
                    }

                    operator.setText(string1);


                    string1 = "";
                    operastack1.setJ();
                    for (int k=0;k<operastack1.getI();k++){
                        string1 = string1+" "+operastack1.getstack();
                    }
                    number.setText(string1);
                    operastack1.setJ();
                }
                xiao = 0;
                flagxiao = false;
                break;
            case R.id.div:
                if (flagdeng == true)
                    flagdeng = false;
                if (flagnum == false)
                    break;
                else
                    flagnum = false;
                string = string + '/';
                menu.setText(string);
                if (xiao != 0) {
                    for (int k = 1; k <= xiao; k++)
                        num = num / 10;
                }
                if (flagyou == false) {
                    numstack.push(num);
                    numstack1.push(num);
                    queue.enQueue(num + "");
                } else flagyou = false;
                num = 0;
                now = "/";
                compere(operastack.getTop(), now);
                compere1(operastack1.getTop(), now);


                if (flagzong) {
                    string1 = "";
                    numstack.setJ();
                    for (int k = 0; k < numstack.getI(); k++)
                        string1 = string1 + "  " + numstack.getstack();
                    number.setText(string1);

                    string1 = "";
                    operastack.setJ();
                    for (int k = 0; k < operastack.getI(); k++)
                        string1 = string1 + "  " + operastack.getstack();
                    operator.setText(string1);
                } else {
                    string1 = "";
                    queue.setJ();
                    for (int k = 0; k < queue.gethigh() - 1; k++) {
                        string1 = string1 + "" + queue.scans();
                        queue.addj();
                    }

                    operator.setText(string1);

                    string1 = "";
                    operastack1.setJ();
                    for (int k=0;k<operastack1.getI();k++){
                        string1 = string1+" "+operastack1.getstack();
                    }
                    number.setText(string1);
                    operastack1.setJ();
                }
                xiao = 0;
                flagxiao = false;
                break;
            case R.id.zuo:
                flagnum = false;
                string = string + '(';
                menu.setText(string);
                now = "(";
                compere(operastack.getTop(), now);
                compere1(operastack1.getTop(), now);

                if (flagzong) {
                    string1 = "";
                    numstack.setJ();
                    if (flagzong) {
                        for (int k = 0; k < numstack.getI(); k++)
                            string1 = string1 + "  " + numstack.getstack();
                        number.setText(string1);

                        string1 = "";
                        operastack.setJ();
                        for (int k = 0; k < operastack.getI(); k++)
                            string1 = string1 + "  " + operastack.getstack();
                        operator.setText(string1);
                    }
                }
                else {
                    string1 = "";
                    queue.setJ();
                    for (int k = 0; k < queue.gethigh() - 1; k++) {
                        string1 = string1 + "" + queue.scans();
                        queue.addj();
                    }

                    operator.setText(string1);

                    string1 = "";
                    operastack1.setJ();
                    for (int k=0;k<operastack1.getI();k++){
                        string1 = string1+" "+operastack1.getstack();
                    }
                    number.setText(string1);
                    operastack1.setJ();
                }
                xiao = 0;
                flagxiao = false;
                break;
            case R.id.you:
                if (xiao != 0) {
                    for (int k = 1; k <= xiao; k++)
                        num = num / 10;
                }
                flagxiao = false;
                numstack.push(num);
                numstack1.push(num);
                queue.enQueue(num + "");
                string = string + ')';
                menu.setText(string);
                now = ")";
                flagyou = true;
                compere1(operastack1.getTop(), now);
                compere(operastack.getTop(), now);

                if (flagzong) {
                    string1 = "";
                    numstack.setJ();
                    for (int k = 0; k < numstack.getI(); k++)
                        string1 = string1 + "  " + numstack.getstack();
                    number.setText(string1);

                    string1 = "";
                    operastack.setJ();
                    for (int k = 0; k < operastack.getI(); k++)
                        string1 = string1 + "  " + operastack.getstack();
                    operator.setText(string1);
                }
                else {
                    string1 = "";
                    queue.setJ();
                    for (int k = 0; k < queue.gethigh() - 1; k++) {
                        string1 = string1 + "" + queue.scans();
                        queue.addj();
                    }

                    operator.setText(string1);

                    string1 = "";
                    operastack1.setJ();
                    for (int k=0;k<operastack1.getI();k++){
                        string1 = string1+" "+operastack1.getstack();
                    }
                    number.setText(string1);
                    operastack1.setJ();
                }
                xiao = 0;
                flagxiao = false;
                break;
            case R.id.deng:
                if (flagright == false) {
                    Toast.makeText(MainActivity.this, "表达式有误", Toast.LENGTH_LONG).show();
                    string = string + " = false";
                    menu.setText("");
                    number.setText(string);
                    operastack.emptyMake();
                    operastack1.emptyMake();
                    operastack1.push("#");
                    operastack.push("#");
                    string1 = "";
                    numstack.emptyMake();
                    numstack1.emptyMake();
                    queue.emptymake();
                    string = "";
                    num = 0;
                    flagnum = false;
                    flagyou = false;
                } else {
                    now = "#";
                    Log.d("num", num + "");
                    Log.d("num", xiao + "");
                    if (xiao != 0) {
                        for (int k = 1; k <= xiao; k++)
                            num = num / 10;
                    }
                    if (!flagyou) {
                        numstack.push(num);
                        numstack1.push(num);
                        queue.enQueue(num + "");
                    }
                    compere(operastack.getTop(), now);
                    Log.d("top", operastack1.getTop());
                    compere1(operastack1.getTop(), now);
                    string = string + " = " + numstack.getTop();



                    /*string="";
                    numstack1.setJ();
                    for (int k=0;k<numstack1.getI();k++) {
                        string1 = string1 + "  " + numstack1.getstack();
                    }*/

                    count();
                    string1 = "";
                    queue.setJ();
                    for (int k = 0; k < queue.gethigh()-1; k++) {
                        string1 = string1 + "" + queue.scans();
                        queue.addj();
                    }
                    string1 = string1 + " = " + numstack1.getTop();


                    number.setText(string);
                    operator.setText(string1);
                    menu.setText(numstack.getTop() + "");
                    operastack.emptyMake();
                    operastack.push("#");
                    operastack1.emptyMake();
                    operastack1.push("#");
                    queue.emptymake();
                    string = numstack.getTop() + "";
                    num = numstack.getTop();
                    flagyou = true;
                }

                flagxiao = false;
                flagright = true;
                flagdeng = true;
                xiao = 0;
                break;


                /*flagdeng = true;
                if (flagright == false){
                    Toast.makeText(MainActivity.this,"表达式有误",Toast.LENGTH_LONG).show();
                    menu.setText("");
                    operastack.emptyMake();
                    operastack.push("#");
                    numstack.emptyMake();
                    num=0;
                    xiao=0;
                    string = "";
                    flagxiao = false;
                    flagright = true;
                    flagyou = false;
                    flagnum= false;
                    break;
                }
                now = "#";
                flagnum = false;
                if (xiao!=0) {
                    num = num / (xiao * 10);
                }
                numstack.push(num);
                compere(operastack.getTop(),now);
                num=numstack.getTop();
                menu.setText(num+"");
                num=0;
                string = string+" = "+numstack.getTop();
                operator.setText(string);
                operastack.push("#");
                break;*/
        }
    }

    private void count() {
        boolean flag;
        numStack numstack3;
        numstack3 = new numStack();
        String s;
        float below, top;
        int k;
        queue.setJ();
        for (int i = 0; i < queue.gethigh()-1; i++) {
            s = queue.scans();
            flag = false;
            for (k = 0; k < 8; k++) {
                Log.d("kkk", k + "   " + s);
                if (chara[k].equals(s)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                if (chara[k].equals("+")) {
                    top = numstack3.pop();
                    Log.d("flag1", "top" + top);
                    below = numstack3.pop();
                    Log.d("flag1", "below" + below);
                    below = below + top;
                    numstack3.push(below);
                } else if (chara[k].equals("-")) {
                    top = numstack3.pop();
                    below = numstack3.pop();
                    below = below - top;
                    numstack3.push(below);
                } else if (chara[k].equals("*")) {
                    top = numstack3.pop();
                    below = numstack3.pop();
                    below = below * top;
                    numstack3.push(below);
                } else if (chara[k].equals("/")) {
                    top = numstack3.pop();
                    below = numstack3.pop();
                    below = below / top;
                    numstack3.push(below);
                } else if (chara[k].equals("%")) {
                    top = numstack3.pop();
                    below = numstack3.pop();
                    below = below % top;
                    numstack3.push(below);
                }
            } else {
                numstack3.push(numstack1.destack());
            }
            queue.addj();
        }
        numstack1.emptyMake();
        numstack3.setJ();
        for (int i=0;i<numstack3.getI();i++)
        Log.d("i", numstack3.getstack() + "");
        numstack1.push(numstack3.pop());
    }

    private void compere1(String top, String now) {
        int i, j;
        for (i = 0; i < 8; i++) {
            if (top.equals(chara[i]))
                break;
        }
        for (j = 0; j < 8; j++) {
            if (now.equals(chara[j]))
                break;
        }
        if (chars[i * 8 + j].equals(">")) {
            queue.enQueue(operastack1.pop());
            compere1(operastack1.getTop(), now);
        }
        if (chars[i * 8 + j].equals("<"))
            operastack1.push(now);
        if (chars[i * 8 + j].equals("=")) {
            Log.d("===", top + " " + now + " no");

            operastack1.pop();
        }
        if (chars[i * 8 + j].equals("x")) {
            flagright = false;
            Log.d("xxx", 1 + top + "  " + now + "  ");
            Toast.makeText(MainActivity.this, "表达式有误", Toast.LENGTH_LONG)
                    .show();
        }
    }

    private void compere(String pop, String now) {
        int i, j;
        Log.d("now", now);
        for (i = 0; i < 8; i++) {
            if (pop.equals(chara[i]))
                break;
        }
        for (j = 0; j < 8; j++) {
            if (now.equals(chara[j]))
                break;
        }
        if (chars[i * 8 + j].equals(">"))
            popopStack(operastack.pop(), now);
        if (chars[i * 8 + j].equals("<"))
            operastack.push(now);
        if (chars[i * 8 + j].equals("=")) {
            operastack.pop();
            Log.d("bbb", numstack.getTop() + "");
        }
        if (chars[i * 8 + j].equals("x")) {
            flagright = false;
            Toast.makeText(MainActivity.this, "表达式有误", Toast.LENGTH_LONG)
                    .show();
        }
    }

    private void popopStack(String pop, String now) {
        float top, below;
        if (pop.equals("+")) {
            top = numstack.pop();
            Log.d("+", "top:" + top);
            below = numstack.pop();
            Log.d("+", "below:" + top);
            below = below + top;
            numstack.push(below);
            compere(operastack.getTop(), now);
        }

        if (pop.equals("-")) {
            top = numstack.pop();
            string1 = "";
            below = numstack.pop();
            below = below - top;
            numstack.push(below);
            string1 = "";
            compere(operastack.getTop(), now);
        }
        if (pop.equals("%")) {
            top = numstack.pop();
            Log.d("%", "top" + top + "");
            below = numstack.pop();
            Log.d("%", "below" + top + "");
            below = below % top;
            numstack.push(below);
            compere(operastack.getTop(), now);
        }
        if (pop.equals("*")) {
            top = numstack.pop();
            Log.d("*", "top:" + top);
            below = numstack.pop();
            Log.d("*", "below:" + below);
            below = below * top;
            Log.d("*", "below:" + below);
            numstack.push(below);
            compere(operastack.getTop(), now);
        }
        if (pop.equals("/")) {
            top = numstack.pop();
            below = numstack.pop();
            below = below / top;
            numstack.push(below);
            compere(operastack.getTop(), now);
        }
    }
}
