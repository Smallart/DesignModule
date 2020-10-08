package com.smallert;

import com.smallert.Pattern.FilterManage;
import com.smallert.Pattern.SpecialFCharsFilter;
import com.smallert.Pattern.SpecialHttpFilter;
import com.smallert.Pattern.SpecialNumFilter;
import com.smallert.domin.Message;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args) {
        Message small = new Message("small", "www.aacc99.com");
        FilterManage filterManage = new FilterManage();
        filterManage.setFilter(new SpecialFCharsFilter()).setFilter(new SpecialNumFilter());
        filterManage.doFilter(small);
        System.out.println(small);
        FilterManage fm = new FilterManage();
        fm.setFilter(new SpecialHttpFilter());
        filterManage.setFilter(fm);
        filterManage.doFilter(small);
        System.out.println(small);
    }
}
