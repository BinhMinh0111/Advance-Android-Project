package com.example.advance_android_project.Activity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.advance_android_project.R;

public class SecondActivity extends AppCompatActivity {

    ImageView ic_arrow1, ic_arrow2, second_ic_share, second_ic_favor;
    TextView title2, subTitle2, ratingNumber, ratingNumber2, more_details;
    RatingBar ratingBar2;

    Animation from_left, from_right, from_bottom;

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ic_arrow1 = findViewById(R.id.ic_arrow1);
        ic_arrow2 = findViewById(R.id.ic_arrow2);
        second_ic_share = findViewById(R.id.second_ic_share);
        second_ic_favor = findViewById(R.id.second_ic_favor);
        title2 = findViewById(R.id.title2);
        subTitle2 = findViewById(R.id.subTitle2);
        ratingNumber = findViewById(R.id.ratingNumber);
        ratingNumber2 = findViewById(R.id.ratingNumber2);
        more_details = findViewById(R.id.more_details);
        ratingBar2 = findViewById(R.id.ratingBar2);

        ic_arrow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        //ẩn và ghi đè
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        this.getWindow().getDecorView().setSystemUiVisibility(

                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        );

        //load animations
        from_left = AnimationUtils.loadAnimation(this, R.anim.anim_from_left);
        from_right = AnimationUtils.loadAnimation(this, R.anim.anim_from_right);
        from_bottom = AnimationUtils.loadAnimation(this, R.anim.anim_from_bottom);

        //set animations
        ic_arrow1.setAnimation(from_left);
        title2.setAnimation(from_right);
        subTitle2.setAnimation(from_right);
        ratingBar2.setAnimation(from_left);
        ratingNumber.setAnimation(from_right);
        ratingNumber2.setAnimation(from_right);
        ic_arrow2.setAnimation(from_bottom);
        more_details.setAnimation(from_bottom);
        second_ic_share.setAnimation(from_left);
        second_ic_favor.setAnimation(from_left);


        ic_arrow2.setOnClickListener((view -> {
            Intent intent = new Intent( SecondActivity.this, ThirdActivity.class);

            Pair[] pairs = new Pair[1];
            pairs[0] = new Pair<View, String>(ic_arrow2, "background_image_transition");

            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(SecondActivity.this, pairs);

            startActivity(intent, options.toBundle());
        }));
    }
}