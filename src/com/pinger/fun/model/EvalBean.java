package com.pinger.fun.model;


/**
 * @author : p1n93r
 * @date : 2022/3/29 17:34
 */

public class EvalBean {

    public EvalBean() throws ClassNotFoundException {
        System.out.println("[+] had call: EvalBean.EvalBean");
    }

    public String name;

    public CommonBean commonBean;


    public String getName() {
        System.out.println("[+] had call: EvalBean.getName");
        return name;
    }

    public void setName(String name) {
        System.out.println("[+] had call: EvalBean.setName");
        this.name = name;
    }

    public CommonBean getCommonBean() {
        System.out.println("[+] had call: EvalBean.getCommonBean");
        return commonBean;
    }

    public void setCommonBean(CommonBean commonBean) {
        System.out.println("[+] had call: EvalBean.setCommonBean");
        this.commonBean = commonBean;
    }
}
