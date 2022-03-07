package com.example.kahani.Adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kahani.Models.SpecificStoriesModel;
import com.example.kahani.R;
import com.example.kahani.StoryDisplayActivity;

import java.util.ArrayList;

public class SpecificSoriesAdapter extends RecyclerView.Adapter<SpecificSoriesAdapter.viewHolder> {

    ArrayList<SpecificStoriesModel> list;
    Context context;

    public SpecificSoriesAdapter(ArrayList<SpecificStoriesModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.circularimage,parent,false);
        return new SpecificSoriesAdapter.viewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        SpecificStoriesModel model1 = list.get(position);

        holder.profileImage.setImageResource(model1.getDisplay());
        holder.storyName.setText(model1.getStorytitle());
        switch (position)
        {

            case 0 :
                holder.storyName.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(context, StoryDisplayActivity.class);
                        intent.putExtra("Title", model1.getStorytitle());
                        intent.putExtra("Description", model1.getStoryDes());
                        context.startActivity(intent);
                    }
                });
                holder.video.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent2 = new Intent(Intent.ACTION_VIEW);
                        intent2.setData(Uri.parse(model1.getVideoUrl()));
                        context.startActivity(intent2);
                    }
                });

            case 1 :
                holder.storyName.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(context, StoryDisplayActivity.class);
                        intent.putExtra("Title", model1.getStorytitle());
                        intent.putExtra("Description", model1.getStoryDes());
                        context.startActivity(intent);
                    }
                });
                holder.video.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent2 = new Intent(Intent.ACTION_VIEW);
                        intent2.setData(Uri.parse(model1.getVideoUrl()));
                        context.startActivity(intent2);
                    }
                });

            case 2 :
                holder.storyName.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(context, StoryDisplayActivity.class);
                        intent.putExtra("Title", model1.getStorytitle());
                        intent.putExtra("Description", model1.getStoryDes());
                        context.startActivity(intent);
                    }
                });
                holder.video.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent2 = new Intent(Intent.ACTION_VIEW);
                        intent2.setData(Uri.parse(model1.getVideoUrl()));
                        context.startActivity(intent2);
                    }
                });

            case 3 :
                holder.storyName.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(context, StoryDisplayActivity.class);
                        intent.putExtra("Title", model1.getStorytitle());
                        intent.putExtra("Description", model1.getStoryDes());
                        context.startActivity(intent);
                    }
                });
                holder.video.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent2 = new Intent(Intent.ACTION_VIEW);
                        intent2.setData(Uri.parse(model1.getVideoUrl()));
                        context.startActivity(intent2);
                    }
                });

            case 4 :
                holder.storyName.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(context, StoryDisplayActivity.class);
                        intent.putExtra("Title", model1.getStorytitle());
                        intent.putExtra("Description", model1.getStoryDes());
                        context.startActivity(intent);
                    }
                });
                holder.video.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent2 = new Intent(Intent.ACTION_VIEW);
                        intent2.setData(Uri.parse(model1.getVideoUrl()));
                        context.startActivity(intent2);
                    }
                });

                break;
        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        ImageView profileImage,video,audio;
        TextView storyName;

        public viewHolder(@NonNull View itemView)
        {
            super(itemView);

            profileImage = itemView.findViewById(R.id.profileImage);
            video = itemView.findViewById(R.id.video);
            storyName = itemView.findViewById(R.id.storyName);

        }

        @Override
        public void onClick(View view) {
            int position=this.getAdapterPosition();
            SpecificStoriesModel model = list.get(position);
        }
    }


}
