package com.example.duantotnghiep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout HomeLayout,ProfileLayout,GameLayout;
    private ImageView HomeImage,GameImage,ProfileImage;
    private TextView Hometxt,Gametxt,Profiletxt;

    private int selectedTab = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HomeLayout = findViewById(R.id.HomeLayout);
        ProfileLayout = findViewById(R.id.profileLayout);
        GameLayout = findViewById(R.id.GameLayout);

        HomeImage = findViewById(R.id.homeimage);
        GameImage = findViewById(R.id.gameImage);
        ProfileImage = findViewById(R.id.profileImage);

        Hometxt = findViewById(R.id.hometxt);
        Gametxt = findViewById(R.id.gametxt);
        Profiletxt = findViewById(R.id.profiletxt);

        //set defaul
        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.fragmentContainer,HomeFragment.class,null)
                .commit();

        HomeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTab !=1){

                    //set screen
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer,HomeFragment.class,null)
                            .commit();
                    //
                    Gametxt.setVisibility(View.GONE);
                    Profiletxt.setVisibility(View.GONE);

                    GameImage.setImageResource(R.drawable.tien_icon);
                    ProfileImage.setImageResource(R.drawable.profile_icon);

                    GameLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    ProfileLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    //selec home tab
                    Hometxt.setVisibility(View.VISIBLE);
                    HomeImage.setImageResource(R.drawable.home_selected_icon);
                    HomeLayout.setBackgroundResource(R.drawable.round_back_home);
                    //create animation
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f,1.0f,1f,1f, Animation.RELATIVE_TO_SELF,0.0f,Animation.RELATIVE_TO_SELF,0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    HomeLayout.startAnimation(scaleAnimation);
                    //set 1st tab as selected teb
                    selectedTab = 1;
                }
            }
        });

        GameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTab !=2){
                    //set screen
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer,MiniGameFragment.class,null)
                            .commit();
                    //
                    Hometxt.setVisibility(View.GONE);
                    Profiletxt.setVisibility(View.GONE);

                    HomeImage.setImageResource(R.drawable.home_icon);
                    ProfileImage.setImageResource(R.drawable.profile_icon);

                    HomeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    ProfileLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    //selec game tab
                    Gametxt.setVisibility(View.VISIBLE);
                    GameImage.setImageResource(R.drawable.tien_selected_icon);
                    GameLayout.setBackgroundResource(R.drawable.round_back_game);
                    //create animation
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f,1.0f,1f,1f, Animation.RELATIVE_TO_SELF,1.0f,Animation.RELATIVE_TO_SELF,0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    GameLayout.startAnimation(scaleAnimation);
                    //set 1st tab as selected teb
                    selectedTab = 2;
                }
            }
        });

        ProfileLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTab !=3){
                    //set screen
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer,ProfileFragment.class,null)
                            .commit();
                    //
                    Hometxt.setVisibility(View.GONE);
                    Gametxt.setVisibility(View.GONE);

                    HomeImage.setImageResource(R.drawable.home_icon);
                    GameImage.setImageResource(R.drawable.tien_icon);

                    HomeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    GameLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    //selec proile tab
                    Profiletxt.setVisibility(View.VISIBLE);
                    ProfileImage.setImageResource(R.drawable.profile_selected_icon);
                    ProfileLayout.setBackgroundResource(R.drawable.round_back_profile);
                    //create animation
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f,1.0f,1f,1f, Animation.RELATIVE_TO_SELF,1.0f,Animation.RELATIVE_TO_SELF,0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    ProfileLayout.startAnimation(scaleAnimation);
                    //set 1st tab as selected teb
                    selectedTab = 3;
                }
            }
        });
    }
}