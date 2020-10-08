package com.smallart;

public abstract class Code {
    public abstract void subOperation(String upload);
    public void decode(String upload){
        System.out.println("公共处理第一步");
        subOperation(upload);
        System.out.println("公共处理第二部");
    }
}
