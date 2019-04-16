package com.min.service;

import com.min.dao.CompanyDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class CompanyEmployeeService {
    @Resource
    private CompanyDao companyDao;
    public ArrayList<ArrayList<Object>> getEmployeeList(String Flag,String LoginName){
        String ID=companyDao.getID(LoginName);
        ArrayList<ArrayList<Object>> result=null;
        if(Flag.equals("1")){
            result=companyDao.getEmployeeList(ID,"app_producerregistry");
        }else if (Flag.equals("2")){
            result=companyDao.getEmployeeList(ID,"app_quarantineregistry");
        }else if(Flag.equals("3")){
            result=companyDao.getEmployeeList(ID,"app_processorregistry");
        }else if(Flag.equals("4")){
            result=companyDao.getEmployeeList(ID,"app_transporterregistry");
        }else if(Flag.equals("5")){
            result=companyDao.getEmployeeList(ID,"app_sellerregistry");
        }
        return result;
    }
}
