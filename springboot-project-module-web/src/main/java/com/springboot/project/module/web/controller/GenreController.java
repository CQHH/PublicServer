package com.springboot.project.module.web.controller;

import com.springboot.project.module.api.GenreApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/crud",method = {RequestMethod.GET,RequestMethod.POST})
public class GenreController {

    @Autowired
    private GenreApi genreApi;

    @RequestMapping("getGenrelist")
    public String getGenrelist(){
        return genreApi.apiGetGenreList();
    }

    @RequestMapping("getGenreNameList")
    public String getGenreNameList(){
        return genreApi.apiGetGenreNameList();
    }

}
