package com.example.myapplication.ui.boards;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.Toast;

import com.applandeo.materialcalendarview.CalendarDay;
import com.applandeo.materialcalendarview.listeners.OnCalendarDayClickListener;
import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentBoardsBinding;
import com.example.myapplication.databinding.FragmentDeadlineBinding;
import com.example.myapplication.databinding.FragmentTasksBinding;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class DeadlineFragment extends Fragment {

    private FragmentDeadlineBinding binding;


    public DeadlineFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Extract the views from this fragment and display
        binding = FragmentDeadlineBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //Storing the deadlines
        ArrayList<CalendarDay> calendars = new ArrayList<>();
        HashMap<String, String> events = new HashMap<>();


        //Deadline example
        events.put("20241111", "Present Prototype");
        calendars.add(addDeadline(2024,11,11));

        events.put("20241115", "Milestone 4 Report Due");
        calendars.add(addDeadline(2024,11,15));

        //Set the calendar view accordingly with created deadlines
        binding.calendarView.setCalendarDays(calendars);

        //Listen to the input of the user when the calendar has been clicked
        binding.calendarView.setOnCalendarDayClickListener(new OnCalendarDayClickListener() {
            @Override
            public void onClick(@NonNull CalendarDay calendarDay) {
                String day = String.format("%02d", calendarDay.getCalendar().get(Calendar.DAY_OF_MONTH));
                String month = String.format("%02d", calendarDay.getCalendar().get(Calendar.MONTH)+1);
                String year = String.format("%d", calendarDay.getCalendar().get(Calendar.YEAR));


                //Notify the user about the deadline
                if(events.containsKey(year+month+day)){
                    Toast.makeText(getActivity(), events.get(year+month+day), Toast.LENGTH_SHORT).show();
                }
            }
        });


        return root;
    }

    //Add a deadline for the calendar
    public CalendarDay addDeadline(int y, int m, int d){
        Calendar calendar = Calendar.getInstance();
        calendar.set(y,m-1,d);
        CalendarDay calendarDay = new CalendarDay(calendar);
        calendarDay.setLabelColor(R.color.red);
        calendarDay.setImageResource(R.drawable.baseline_circle_24);
        return calendarDay;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}