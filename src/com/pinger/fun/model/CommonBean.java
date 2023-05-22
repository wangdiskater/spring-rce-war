package com.pinger.fun.model;


/**
 * @author : p1n93r
 * @date : 2022/3/29 18:22
 */
public class CommonBean {

    public CommonBean(){
        System.out.println("[+] had call:  com.example.spbdemo.pojo.CommonBean.CommonBean");
    }


    public String name;


    public String getName() {
        System.out.println("[+] had call: com.example.spbdemo.pojo.CommonBean.getName");
        return name;
    }

    public void setName(String name) {
        System.out.println("[+] had call: com.example.spbdemo.pojo.CommonBean.setName");
        this.name = name;
    }
}
