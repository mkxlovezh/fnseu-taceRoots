package com.min.action;

import com.min.service.CheckLoginService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserLoginAction extends ActionSupport {
    @Resource
    private CheckLoginService checkLoginService;
    private String name;
    private String password;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute(){
        System.out.println(password + name);
        String result=checkLoginService.checkLogin(name,password);
        setStatus(result);
        return "success";
    }
}
