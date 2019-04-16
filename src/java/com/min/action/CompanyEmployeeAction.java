package com.min.action;

import com.min.service.CompanyEmployeeService;
import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CompanyEmployeeAction extends ActionSupport {
    @Resource
    private CompanyEmployeeService companyEmployeeService;
    private String Flag;
    private String LoginName;
    private JSONArray json;
    public void setFlag(String flag) {
        Flag = flag;
    }
    public void setLoginName(String loginName) {
        LoginName = loginName;
    }

    public void setJson(JSONArray json) {
        this.json = json;
    }

    public JSONArray getJson() {
        return json;
    }

    public String execute(){
        ArrayList<ArrayList<Object>> list=companyEmployeeService.getEmployeeList(Flag,LoginName);
        Map<String,Object> r=new HashMap<String, Object>();
        List<Object> men=new ArrayList<Object>();
        for(ArrayList<Object> manInfo:list){
            Map<String,Object> oneman=new HashMap<String ,Object>();
            oneman.put("id",manInfo.get(0).toString());
            oneman.put("name",manInfo.get(1).toString());
            oneman.put("INo",manInfo.get(2).toString());
            oneman.put("CNo",manInfo.get(3).toString());
            men.add(oneman);
        }
//        r.put("allmen",men);
        JSONArray json=JSONArray.fromObject(men);
        setJson(json);
        System.out.println("success");
        return "success";
    }
}
