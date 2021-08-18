package ru.netology.manager;

import ru.netology.domain.PostFilms;

public class Manager {
    private PostFilms[] films = new PostFilms[0];
    private int filmsToReturn;
    private int filmsNoReturnDefault = 10;

    public Manager(int filmsToReturn) {
        this.filmsToReturn = filmsToReturn;
    }

    public void add(PostFilms filmsItem) {
        PostFilms[] tmp = new PostFilms[films.length + 1];
        System.arraycopy(films, 0, tmp, 0, films.length);
        tmp[tmp.length - 1] = filmsItem;   //?
        films = tmp;
    }

    public PostFilms[] getFilms() {
        int arrayLength;
        if (filmsToReturn <= 0) filmsToReturn = filmsNoReturnDefault;
        arrayLength = filmsToReturn;

        if (filmsToReturn > films.length) {
            arrayLength = films.length;
        }
        PostFilms[] result = new PostFilms[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}
