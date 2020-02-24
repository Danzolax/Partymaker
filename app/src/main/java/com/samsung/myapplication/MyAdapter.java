package com.samsung.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    ArrayList<Event> data;

    MyAdapter(ArrayList<Event> data) {
        this.data = data;
    }

    //Создается ViewHolder для каждого предмета в списке (только 1 раз)
    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_party, parent, false);

        return new MyViewHolder(view);
    }

    //Соединяем данные с ViewHolder
    //Кладем данные во View
    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    //Сколько предметов в списке
    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView eventAge;
        TextView eventName;
        TextView eventPosition;
        TextView eventTime;
        TextView eventDate;
        TextView eventPlace;
        ImageView imageView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            eventAge = itemView.findViewById(R.id.eventAge);
            eventName = itemView.findViewById(R.id.eventName);
            eventPosition = itemView.findViewById(R.id.eventPosition);
            eventTime = itemView.findViewById(R.id.eventTime);
            eventDate = itemView.findViewById(R.id.eventDate);
            eventPlace = itemView.findViewById(R.id.eventPlace);
            imageView = itemView.findViewById(R.id.imageEventView);

            itemView.setBackgroundResource(R.drawable.corners);//lGOTO
            imageView.setBackgroundResource(R.drawable.corners);


        }

        public void bind(Event event) {
            eventAge.setText(event.age);
            eventName.setText(event.name);
            eventPosition.setText(event.position);
            eventTime.setText(event.time);
            eventPlace.setText(event.place);
            eventDate.setText(event.date);
            imageView.setImageResource(event.imageId);
        }
    }
}
