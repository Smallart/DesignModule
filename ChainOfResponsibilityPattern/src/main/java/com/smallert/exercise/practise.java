package com.smallert.exercise;

import com.smallert.exercise.domin.Request;
import com.smallert.exercise.domin.Response;

/**
 * 现在使用责任链的模式实现如下接口
 *  模拟request与response
 *  request与response使用一个过滤器过滤但是request先过滤之后response再过滤
 *  其中过滤顺序request为1，2，3 response 过滤顺序为3，2，1
 */
public class practise {
    public static void main(String[] args) {
        Request request = new Request();
        request.setMsg("123abc");
        Response response =new Response();
        response.setMsg("000ooo");
        System.out.print("request--");
        SpecialCharFilter specialCharFilter = new SpecialCharFilter();
        SpecialNumFilter specialNumFilter = new SpecialNumFilter();
        specialCharFilter.setFilterChain(specialNumFilter);
        specialCharFilter.doFilter(request,response);
        System.out.println("response");
    }
}
