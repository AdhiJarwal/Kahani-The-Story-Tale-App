package com.example.kahani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.kahani.databinding.ActivityStoryDisplayBinding;

public class StoryDisplayActivity extends AppCompatActivity {

    ActivityStoryDisplayBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStoryDisplayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        Intent i=getIntent();
        String TITLE=i.getStringExtra("Title");
        String DESCRIPTION=i.getStringExtra("Description");
        binding.storyTitle.setText(TITLE);
        binding.story.setText(DESCRIPTION);
    }

    public void onBackPressed()
    {
        StoryDisplayActivity.this.finish();
    }
}