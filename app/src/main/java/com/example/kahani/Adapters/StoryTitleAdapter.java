package com.example.kahani.Adapters;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kahani.Adventure;
import com.example.kahani.FairyTaleAcitivity;
import com.example.kahani.Fiction;
import com.example.kahani.Models.StoryTitleModel;
import com.example.kahani.Mystery;
import com.example.kahani.Mythological;
import com.example.kahani.Panchtantra;
import com.example.kahani.R;

import java.util.ArrayList;

public class StoryTitleAdapter extends RecyclerView.Adapter<StoryTitleAdapter.viewHolder> {

    ArrayList <StoryTitleModel> adapterArrayList;

    Context context;

    public StoryTitleAdapter(ArrayList<StoryTitleModel> adapterArrayList, Context context) {
        this.adapterArrayList = adapterArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //System.out.println("@@@@@@@@@@@ ViewHolder");
        View view = LayoutInflater.from(context).inflate(R.layout.storytitle,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position)
    {

        //System.out.println("@@@@@@@@@@@ BindViewHolder");
        StoryTitleModel model = adapterArrayList.get(position);

        holder.image1.setImageResource(model.getPic());
        holder.titleStory.setText(model.getStoryCategory());

        switch (position)
        {

            case 0 :
                holder.image1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(context, Adventure.class);
                        context.startActivity(intent);
                    }
                });

                holder.titleStory.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context,"रोमांचित कहानियां",Toast.LENGTH_SHORT).show();
                    }
                });

                break;

            case 1 :
                holder.image1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(context,FairyTaleAcitivity.class);
                        context.startActivity(intent);

                    }
                });

                holder.titleStory.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context,"परियों की कहानिया",Toast.LENGTH_SHORT).show();
                    }
                });

                break;

            case 2 :
                holder.image1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(context, Mythological.class);
                        context.startActivity(intent);
                    }
                });

                holder.titleStory.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context,"पौराणिक कहानियां",Toast.LENGTH_SHORT).show();
                    }
                });

                break;

            case 3 :
                holder.image1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(context, Panchtantra.class);
                        context.startActivity(intent);

                    }
                });

                holder.titleStory.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context,"पंचतंत्र की कहानियां",Toast.LENGTH_SHORT).show();
                    }
                });

                break;


            case 4 :
                holder.image1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(context, Mystery.class);
                        context.startActivity(intent);

                    }
                });

                holder.titleStory.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context,"रहस्यमय कहानियां",Toast.LENGTH_SHORT).show();
                    }
                });

                break;


            case 5 :
                holder.image1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(context, Fiction.class);
                        context.startActivity(intent);

                    }
                });

                holder.titleStory.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context,"काल्पनिक कहानिया",Toast.LENGTH_SHORT).show();
                    }
                });
                break;
        }
    }

    @Override
    public int getItemCount() {
        return adapterArrayList.size();
    }


    public class viewHolder extends RecyclerView.ViewHolder
    {

        ImageView image1;
        TextView titleStory;
        public viewHolder(@NonNull View itemView)
        {
            super(itemView);
           // itemView.setOnClickListener(this);
            image1 = itemView.findViewById(R.id.image1);
            titleStory = itemView.findViewById(R.id.titleStory);

        }

    }
}
