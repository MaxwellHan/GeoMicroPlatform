package com.GeoMicroPlatform.Actions;

import com.GeoMicroPlatform.Dao.DBConnector;
import com.GeoMicroPlatform.Models.User;

import com.GeoMicroPlatform.Models.Video;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class LoginImp implements Login {

    @Resource
    private DBConnector dbConnector;

    @Override
    @RequestMapping("/login")
    public void login(HttpServletRequest request, HttpServletResponse response)throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String id = request.getParameter("id");
        String password = request.getParameter("password");
        User user = dbConnector.selectUser(id,password);

        String userJsonStr = JSON.toJSONString(user);
        PrintWriter out = response.getWriter();

        out.print(userJsonStr);
    }

    @Override
    @RequestMapping("/selectVideoList")
    public void selectVideoAll(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        List<Video> resList = dbConnector.selectVideoAll();

        String userJsonStr = JSON.toJSONString(resList);
        PrintWriter out = response.getWriter();

        out.print(userJsonStr);
    }
}
