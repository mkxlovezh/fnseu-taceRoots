package com.min.action;

import com.min.service.EmployeeDelService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class EmployeeDelAction extends ActionSupport {
    @Resource
    private EmployeeDelService employeeDelService;
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public String execute(){
        employeeDelService.employeeDel(id);
        return "success";
    }
}
