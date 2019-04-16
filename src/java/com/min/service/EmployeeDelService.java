package com.min.service;

import com.min.dao.CompanyDao;
import com.min.dao.CompanyDaoImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmployeeDelService {
    @Resource
    private CompanyDao companyDao;
    public void employeeDel(String id){
        companyDao.deleteEmployee(id);
    }
}
