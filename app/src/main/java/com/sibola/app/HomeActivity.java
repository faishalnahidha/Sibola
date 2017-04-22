package com.sibola.app;

import android.icu.util.Calendar;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.CalendarMode;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener;

public class HomeActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        MaterialCalendarView materialCalendarView =(MaterialCalendarView) findViewById(R.id.calendarView);
        materialCalendarView.state().edit()
                .setFirstDayOfWeek(Calendar.MONDAY)
                .setMinimumDate(CalendarDay.from(2017 , 1, 1))
                .setMaximumDate(CalendarDay.from(2017, 12, 1))
                .setCalendarDisplayMode(CalendarMode.MONTHS)
                .commit();

        materialCalendarView.setOnDateChangedListener(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(@NonNull MaterialCalendarView widget, @NonNull CalendarDay date, boolean selected) {
                Toast.makeText(HomeActivity.this, "" + date, Toast.LENGTH_SHORT).show();
            }
        });
    }


}
