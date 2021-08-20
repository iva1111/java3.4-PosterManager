package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class PostFilms {
    private int id;
    private String filmName;

    public PostFilms(int id, String filmName) {
        this.id = id;
        this.filmName = filmName;
    }
}

