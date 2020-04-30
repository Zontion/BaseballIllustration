package com.zontion.baseballillustration.activity;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.zontion.baseballillustration.R;
import com.zontion.baseballillustration.Tools.Tools;
import com.zontion.baseballillustration.model.CardInfo.*;
import com.zontion.baseballillustration.model.Player_B;
import com.zontion.baseballillustration.model.TeamBonusValue;
import com.zontion.baseballillustration.model.TeamInfo;
import com.zontion.baseballillustration.model.TeamInfo.*;
import com.zontion.baseballillustration.model.mlb.NYM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.zontion.baseballillustration.model.CardInfo.CardColor.*;

public class BaseballActivity extends AppCompatActivity {

    private EditText etSearch;
    private Button btSearch;
    private Spinner spLeague;
    private Spinner spYear;
    private Spinner spTeam;
    private CheckBox cbNone;
    private CheckBox cbSun;
    private CheckBox cbCloud;
    private CheckBox cbRain;
    private CheckBox cbSnow;

    final List<League> leagueList = Arrays.asList(League.values());
    private TextView tvValueStrength;
    private TextView tvValuePunch;
    private TextView tvValueSpeed;
    private TextView tvValuePass;
    private TextView tvValueDefence;
    private TextView tvValueControl;
    private TextView tvValueFast;
    private TextView tvValueBreaking;

    private RecyclerView puncherRecyclerView;
    private List<Player_B> playerBList = new ArrayList<>();

    private TeamBonusValue teamBonusValue = new NYM(0);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baseball);

        initView();
        initData();
    }

    private void initView() {
        etSearch = (EditText) findViewById(R.id.et_baseball_search);
        btSearch = (Button) findViewById(R.id.bt_filter_search);
        spLeague = (Spinner) findViewById(R.id.sp_baseball_league);
        spYear = (Spinner) findViewById(R.id.sp_baseball_year);
        spTeam = (Spinner) findViewById(R.id.sp_baseball_team);
        cbNone = (CheckBox) findViewById(R.id.cb_weather_none);
        cbSun = (CheckBox) findViewById(R.id.cb_weather_sun);
        cbCloud = (CheckBox) findViewById(R.id.cb_weather_cloud);
        cbRain = (CheckBox) findViewById(R.id.cb_weather_rain);
        cbSnow = (CheckBox) findViewById(R.id.cb_weather_snow);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, leagueList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spLeague.setAdapter(adapter);

        tvValueStrength = (TextView) findViewById(R.id.tv_value_strength);
        tvValuePunch = (TextView) findViewById(R.id.tv_value_punch);
        tvValueSpeed = (TextView) findViewById(R.id.tv_value_speed);
        tvValuePass = (TextView) findViewById(R.id.tv_value_pass);
        tvValueDefence = (TextView) findViewById(R.id.tv_value_defence);
        tvValueControl = (TextView) findViewById(R.id.tv_value_control);
        tvValueFast = (TextView) findViewById(R.id.tv_value_fast);
        tvValueBreaking = (TextView) findViewById(R.id.tv_value_breaking);

        puncherRecyclerView = (RecyclerView) findViewById(R.id.rv_baseball);
        puncherRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        puncherRecyclerView.setAdapter(new PuncherAdapter());
    }

    private void initData() {
        DefencePlace_B[] aaa = {DefencePlace_B.THREEB};
        Player_B player_b = new Player_B(PURPLE, 1993, new TeamInfo(), "張泰山", aaa, LevelType_B.SD,
                Pose_B.RIGHT, true, 101, 81, 83, 91, 92);
        Player_B player_b2 = new Player_B(BLACK, 2016, new TeamInfo(), "張建銘", aaa, LevelType_B.PP,
                Pose_B.LEFT, true, 84, 101, 86, 92, 92);
        Player_B player_b3 = new Player_B(BLUE, 2005, new TeamInfo(), "謝佳賢", aaa, LevelType_B.SD,
                Pose_B.LEFT, true, 102, 81, 86, 91, 91);
        Player_B player_b4 = new Player_B(RED, 2005, new TeamInfo(), "馬力歐", aaa, LevelType_B.SD,
                Pose_B.RIGHT, true, 85, 78, 68, 80, 81);
        Player_B player_b5 = new Player_B(RED, 2005, new TeamInfo(), "威納斯", aaa, LevelType_B.PP,
                Pose_B.RIGHT, false, 74, 86, 72, 82, 82);

        playerBList.add(player_b);
        playerBList.add(player_b2);
        playerBList.add(player_b3);
        playerBList.add(player_b4);
        playerBList.add(player_b5);
    }

    private class PuncherAdapter extends RecyclerView.Adapter<PuncherAdapter.MyViewHolder> {

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_puncher, parent, false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            switch (playerBList.get(position).getCardColor()) {
                case BLACK:
                    holder.clPuncher.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.color_baseball_player_black));
                    break;
                case PURPLE:
                    holder.clPuncher.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.color_baseball_player_purple));
                    break;
                case RED:
                    holder.clPuncher.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.color_baseball_player_red));
                    break;
                case BLUE:
                    holder.clPuncher.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.color_baseball_player_blue));
                    break;
            }

            String levelType = Tools.getStringByLevelType_B(getApplicationContext(), playerBList.get(position).getLevelType());
            int strength = playerBList.get(position).getStrength();
            int punch = playerBList.get(position).getPunch();
            int speed = playerBList.get(position).getSpeed();
            int pass = playerBList.get(position).getPass();
            int defence = playerBList.get(position).getDefence();

            holder.tvStrength.setTextColor(Tools.getColorByNumber(getApplicationContext(), strength));
            holder.tvPunch.setTextColor(Tools.getColorByNumber(getApplicationContext(), punch));
            holder.tvSpeed.setTextColor(Tools.getColorByNumber(getApplicationContext(), speed));
            holder.tvPass.setTextColor(Tools.getColorByNumber(getApplicationContext(), pass));
            holder.tvDefence.setTextColor(Tools.getColorByNumber(getApplicationContext(), defence));

            holder.tvLevelType.setText(levelType);
            holder.tvStrength.setText("" + playerBList.get(position).getStrength());
            holder.tvPunch.setText("" + playerBList.get(position).getPunch());
            holder.tvSpeed.setText("" + playerBList.get(position).getSpeed());
            holder.tvPass.setText("" + playerBList.get(position).getPass());
            holder.tvDefence.setText("" + playerBList.get(position).getDefence());
        }

        @Override
        public int getItemCount() {
            return playerBList.size();
        }

        class MyViewHolder extends RecyclerView.ViewHolder {

            private ConstraintLayout clPuncher;
            private TextView tvPuncherName;
            private TextView tvLevelType;
            private TextView tvStrength;
            private TextView tvPunch;
            private TextView tvSpeed;
            private TextView tvPass;
            private TextView tvDefence;

            MyViewHolder(View itemView) {
                super(itemView);
                clPuncher = itemView.findViewById(R.id.cl_item_puncher);
                tvPuncherName = itemView.findViewById(R.id.tv_puncher_name);
                tvLevelType = itemView.findViewById(R.id.tv_level_type);
                tvStrength = itemView.findViewById(R.id.tv_strength);
                tvPunch = itemView.findViewById(R.id.tv_punch);
                tvSpeed = itemView.findViewById(R.id.tv_speed);
                tvPass = itemView.findViewById(R.id.tv_pass);
                tvDefence = itemView.findViewById(R.id.tv_defence);
            }
        }
    }
}
