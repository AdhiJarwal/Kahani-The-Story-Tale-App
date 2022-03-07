package com.example.kahani;

// this is the activity of the types of stories like horror, logical, akabbar birbal etc
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.kahani.Adapters.StoryTitleAdapter;
import com.example.kahani.Models.StoryTitleModel;
import com.example.kahani.databinding.ActivityTypesOfStoriesBinding;

import java.util.ArrayList;

public class TypesOfStoriesActivity extends AppCompatActivity {

    ActivityTypesOfStoriesBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = ActivityTypesOfStoriesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<StoryTitleModel>list = new ArrayList<>();

        list.add(new StoryTitleModel(R.drawable.adventure,"रोमांचित कहानियां"));
        list.add(new StoryTitleModel(R.drawable.fairytail,"परियों की कहानियां"));
        list.add(new StoryTitleModel(R.drawable.myth3,"पौराणिक कहानियां"));
        list.add(new StoryTitleModel(R.drawable.panchtantra2,"पंचतंत्र की कहानियां"));
        list.add(new StoryTitleModel(R.drawable.mystery,"रहस्यमय कहानियां"));
        list.add(new StoryTitleModel(R.drawable.fiction,"काल्पनिक कहानियांं"));

        StoryTitleAdapter storyTitleAdapter = new StoryTitleAdapter(list,this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        binding.recyclerView.setLayoutManager(gridLayoutManager);
        binding.recyclerView.setAdapter(storyTitleAdapter);

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true);
//        binding.recyclerView.setLayoutManager(linearLayoutManager);
//        binding.recyclerView.setAdapter(storyTitleAdapter);
    }

    // this is for three dots, which show the option for about us
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch ((item.getItemId()))
        {
            case (R.id.settings):
                Intent intent1 = new Intent(TypesOfStoriesActivity.this,AboutUsActivity.class);
                startActivity(intent1);
                break;

        }
        return true;
    }

    @Override
    public void onBackPressed()
    {
        TypesOfStoriesActivity.this.finish();
    }

}