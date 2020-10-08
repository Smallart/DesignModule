package com.smallert.exercise;

import com.smallert.exercise.domin.Request;
import com.smallert.exercise.domin.Response;

public class SpecialNumFilter extends FilterChain {
    @Override
    public void doFilter(Request request, Response response) {
        System.out.print("SpecialNumFilter--");
        request.setMsg(request.getMsg().replace("abc","ooo"));
        if (filterChain!=null){
            filterChain.doFilter(request,response);
        }
        System.out.print("SpecialNumFilter--");
        response.setMsg(response.getMsg().replace("ooo","000"));
    }
}
