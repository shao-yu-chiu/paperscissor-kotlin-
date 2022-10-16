package com.example.paperscissorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

class MainActivity : AppCompatActivity() {
    private lateinit var enter_name: EditText
    private lateinit var text_enter: TextView
    private lateinit var text_name: TextView
    private lateinit var text_winner: TextView
    private lateinit var text_me: TextView
    private lateinit var text_com: TextView
    private lateinit var btn_paper: RadioButton
    private lateinit var btn_scissor: RadioButton
    private lateinit var btn_stone: RadioButton
    private lateinit var button_ok: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Connect xml file
        enter_name = findViewById(R.id.enter_name);
        text_enter = findViewById(R.id.text_enter);
        text_name = findViewById(R.id.text_name);
        text_winner = findViewById(R.id.text_winner);
        text_me = findViewById(R.id.text_me);
        text_com = findViewById(R.id.text_com);
        btn_paper = findViewById(R.id.btn_paper);
        btn_scissor = findViewById(R.id.btn_scissor);
        btn_stone = findViewById(R.id.btn__stone);
        button_ok = findViewById(R.id.button_ok);
        button_ok.setOnClickListener(object :View.OnClickListener{
            override fun onClick(view: View?) {
                if (enter_name.length() < 1)
                    text_enter.setText("請輸入玩家姓名");
                else {
                    //show player name
                    text_name.setText(String.format("名字\n%s", enter_name.getText().toString()));
                    if (btn_scissor.isChecked()) text_me.setText("我方出拳\n剪刀");
                    else if (btn_paper.isChecked()) text_me.setText("我方出拳\n布");
                    else if (btn_stone.isChecked()) text_me.setText("我方出拳\n石頭");
                    //random
                    var computer =(Math.random()*3);
                    var count=0;
                    while(computer>1){
                        count++;
                        computer-=1;
                    }
                    if (count == 0) text_com.setText("電腦出拳\n剪刀");
                    else if (count == 1) text_com.setText("電腦出拳\n石頭");
                    else if (count == 2) text_com.setText("電腦出拳\n布");
                    //distinguish who wins
                    if ((btn_scissor.isChecked() && count == 2) || (btn_stone.isChecked() && count == 0) || (btn_paper.isChecked() && count == 1)) {
                        text_winner.setText("勝利者\n" + enter_name.getText().toString());
                        text_enter.setText("恭喜你獲勝了");
                    } else if ((btn_scissor.isChecked() && count == 1) || (btn_stone.isChecked() && count == 2) || (btn_paper.isChecked() && count == 0)) {
                        text_winner.setText("勝利者\n電腦");
                        text_enter.setText("可惜，電腦獲勝了");
                    } else {
                        text_winner.setText("勝利者\n平局");
                        text_enter.setText("平局，請再試一次");
                    }
                }
            }
        })
    }

}