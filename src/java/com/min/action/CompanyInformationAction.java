package com.min.action;

import com.min.service.CompanyInfoService;
import net.sf.json.JSONObject;
import org.apache.struts2.json.annotations.JSON;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.Map;

@Controller
public class CompanyInformationAction {
    @Resource
    private CompanyInfoService companyInfoService;
    private String loginName;
    private JSONObject jsonObject;
    @JSON(serialize=false)
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setJsonObject(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }

    public String execute(){
        Map<String,Object> result= companyInfoService.CompanyInfo(loginName);
        System.out.println(result.toString());
        try {
            JSONObject json=JSONObject.fromObject(result);
            setJsonObject(json);
        }catch (Exception e){
            System.out.println("jdddddddddddddddddddddddddddddddddddddd");
        }


        return "success";
    }
}
