package com.smallert.Pattern;

import com.smallert.domin.Message;

import java.util.ArrayList;
import java.util.List;

public class FilterManage implements Filter {
    protected List<Filter> filters =new ArrayList<>();
    public FilterManage setFilter(Filter filter){
        filters.add(filter);
        return this;
    }

    @Override
    public void doFilter(Message message) {
        for (Filter filter : filters) {
            filter.doFilter(message);
        }
    }
}
