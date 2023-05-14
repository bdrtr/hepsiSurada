package com.example.hepsisurada;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hepsisurada.databinding.ObjectDesignBinding;
import com.example.hepsisurada.viewModel.SearchFragmentview;

import java.util.List;


public class BasketAdapter extends RecyclerView.Adapter<BasketAdapter.ObjectHolder> {

    public Context cnt;
    public List<Object> list;
    public SearchFragmentview view;

    public BasketAdapter(Context cnt, List<Object> list, SearchFragmentview view) {
        this.cnt = cnt;
        this.list = list;
        this.view = view;
    }

    public class ObjectHolder  extends RecyclerView.ViewHolder {
        private TextView text;
        private CardView cv;


        public ObjectHolder(@NonNull View itemView) {
            super(itemView);
            cv = itemView.findViewById(R.id.names_card);
            text = itemView.findViewById(R.id.name_text);


        }
    }

    @NonNull
    @Override
    public ObjectHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //LayoutInflater layoutInflater = LayoutInflater.from(cnt);
        View view = LayoutInflater.from(cnt).inflate(R.layout.object_names, parent, false);
        return new ObjectHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ObjectHolder holder, int position) {
        Object obj = list.get(position);
        Toast.makeText(cnt, obj.getName(),Toast.LENGTH_SHORT).show();
        holder.text.setText(obj.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

