package com.min.service;

import com.min.dao.CompanyDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CheckLoginService {
    @Resource
    private CompanyDao companyDao;

    public String checkLogin(String name, String password){
        return companyDao.check(name,password);
    }
}
