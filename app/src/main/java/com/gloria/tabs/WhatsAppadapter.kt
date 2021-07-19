package com.gloria.tabs

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.gloria.tabs.Views.Call
import com.gloria.tabs.Views.Chat
import com.gloria.tabs.Views.Status

class WhatsAppadapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "Chat"
            1 -> "Status"
            2 -> "Calls"
            else -> "Chat"

        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> Chat()
            1 -> Status()
            2 -> Call()
            else -> Chat()


        }
    }
}