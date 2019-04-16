package com.min.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@Controller
public class LoadFileAction extends ActionSupport{
    private String pic;
    private InputStream inputStream;

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }
    /**
     * 读取图片
     *
     * @return
     */
    public String readImg() {
        try {
            inputStream = new FileInputStream(new File("E:/allpictures/"+pic+".png"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }



    public String execute(){

        return "success";
    }
}
