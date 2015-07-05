package com.rahul.stormy.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rahul.stormy.R;
import com.rahul.stormy.weather.Hour;

/**
 * Created by Apple on 10/05/15.
 */
public class HourAdapter extends RecyclerView.Adapter<HourAdapter.HourViewHolder> {

    private Hour[] mHours;

    @Override
    public HourViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.hourly_list_item,viewGroup,false);
        HourViewHolder viewHolder = new HourViewHolder(view);

        return viewHolder;
    }

    public HourAdapter(Hour[] hours){
        mHours = hours;
    }
    @Override
    public void onBindViewHolder(HourViewHolder hourViewHolder, int i) {
            hourViewHolder.bindHour(mHours[i]);
    }

    @Override
    public int getItemCount() {
        return mHours.length;
    }

    public class HourViewHolder extends RecyclerView.ViewHolder{

        public TextView mTimeLabel;
        public TextView mTemperatureLabel;
        public TextView mSummaryLabel;
        public ImageView mIconImageLabel;


        public HourViewHolder(View itemView) {
            super(itemView);

            mTimeLabel = (TextView) itemView.findViewById(R.id.timeLabel);
            mSummaryLabel = (TextView) itemView.findViewById(R.id.summaryLabel);
            mTemperatureLabel = (TextView) itemView.findViewById(R.id.temperatureLabel);
            mIconImageLabel = (ImageView) itemView.findViewById(R.id.iconImageView);

        }

        public void bindHour(Hour hour){
            mTimeLabel.setText(hour.getHour());
            mIconImageLabel.setImageResource(hour.getIconId());
            mTemperatureLabel.setText(hour.getTemperature() + "");
            mSummaryLabel.setText(hour.getSummary());
        }
    }
}
