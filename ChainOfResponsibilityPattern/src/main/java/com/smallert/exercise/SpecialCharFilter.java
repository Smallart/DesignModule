package com.smallert.exercise;

import com.smallert.exercise.domin.Request;
import com.smallert.exercise.domin.Response;

public class SpecialCharFilter extends FilterChain{
    @Override
    public void doFilter(Request request, Response response) {
        System.out.print("SpecialCharFilter--");
        request.setMsg(request.getMsg().replace("123","000"));
        if (filterChain!=null){
            filterChain.doFilter(request,response);
        }
        System.out.print("SpecialCharFilter--");
        response.setMsg(response.getMsg().replace("000","123"));
    }
}
