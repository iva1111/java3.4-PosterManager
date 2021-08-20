package ru.netology.manager;

import ru.netology.domain.PostFilms;

public class AfishaManager {
    private PostFilms[] items = new PostFilms[0];
    private int filmLength;

    public AfishaManager() {
    }

    public AfishaManager(int filmLength) {
        this.filmLength = filmLength;
    }

    public void add(PostFilms item) {
        int length = items.length + 1;
        PostFilms[] tmp = new PostFilms[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public PostFilms[] getLast() {
        int length = filmLength;
        if (items.length < length) {
            length = items.length;
        }
        PostFilms[] result = new PostFilms[length];
        for (int i = 0; i < length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

}
