package com.springboot.project.module.service.impl;

import com.springboot.project.module.entity.Genre;
import com.springboot.project.module.mapper.GenreMapper;
import com.springboot.project.module.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {

    @Autowired
    private GenreMapper genreMapper;

    @Override
    public List<Genre> findAll() {
        return genreMapper.findAll();
    }
}
