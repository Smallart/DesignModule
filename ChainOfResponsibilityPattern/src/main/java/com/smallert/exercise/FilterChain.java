package com.smallert.exercise;

import com.smallert.exercise.domin.Request;
import com.smallert.exercise.domin.Response;

public abstract class FilterChain {
    protected FilterChain filterChain;

    public void setFilterChain(FilterChain filterChain){
        this.filterChain = filterChain;
    }

    public abstract void doFilter(Request request, Response response);

}
