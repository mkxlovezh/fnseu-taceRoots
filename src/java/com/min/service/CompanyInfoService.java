package com.min.service;

import com.min.dao.CompanyDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class CompanyInfoService {
    @Resource
    private CompanyDao companyDao;
    public Map<String,Object> CompanyInfo(String LoginName){
        return companyDao.CompanyInfomationDisplay(LoginName);
    }
}
