package com.example.chat.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chat.Fragments.CallsFragment;
import com.example.chat.Fragments.ChatsFragment;
import com.example.chat.Fragments.StatusFragment;
import com.google.android.material.textfield.TextInputEditText;

public class FragmentsAdapter extends FragmentPagerAdapter {


    public FragmentsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
       switch (position)
       {
           case 0: return new ChatsFragment();
           case 1: return  new StatusFragment();
           case 2: return  new CallsFragment();
           default: return new ChatsFragment();
       }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title =null;
        if (position==0)
        {
            title="CHATS";

        }
        if (position==1)
        {
            title="STATUS";

        }
        if (position==2)
        {
            title="CALLS";

        }
        return title;
    }
}
