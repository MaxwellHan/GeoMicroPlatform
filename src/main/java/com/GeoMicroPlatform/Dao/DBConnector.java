package com.GeoMicroPlatform.Dao;

import com.GeoMicroPlatform.Models.User;
import com.GeoMicroPlatform.Models.Video;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DBConnector {
    User selectUser(@Param("id")String id, @Param("password")String password);
    List<Video> selectVideoAll();
}
