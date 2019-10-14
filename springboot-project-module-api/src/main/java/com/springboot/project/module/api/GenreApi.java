package com.springboot.project.module.api;

import com.springboot.project.module.entity.Genre;
import com.springboot.project.module.service.GenreService;
import com.springboot.project.module.utils.BaseJsonDataCode;
import com.springboot.project.module.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GenreApi implements BaseJsonDataCode {

    @Autowired
    private GenreService genreService;

    /**
     * 获取Essay数据列表
     * @return
     */
    public String apiGetGenreList(){
        List<Genre> genreList = genreService.findAll();
        return JsonUtil.outJson(SUCCESS,"请求成功", genreList);
    }

    /**
     * 获取Essay标题列表
     * @return
     */
    public String apiGetGenreNameList(){
        StringBuilder stringBuilder = new StringBuilder();
        List<Genre> genreList = genreService.findAll();
        for(Genre genre : genreList){
            stringBuilder.append(genre.getGenreName());
        }
        return JsonUtil.outJson(SUCCESS,"请求成功",stringBuilder);
    }

}
