package com.GeoMicroPlatform.Actions;

import com.GeoMicroPlatform.Models.User;
import org.springframework.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface Login {
    void login(HttpServletRequest request, HttpServletResponse response) throws IOException;
    void selectVideoAll(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
