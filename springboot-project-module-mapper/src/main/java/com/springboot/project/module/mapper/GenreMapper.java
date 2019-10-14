package com.springboot.project.module.mapper;

import com.springboot.project.module.entity.Genre;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface GenreMapper {

    List<Genre> findAll();

}
