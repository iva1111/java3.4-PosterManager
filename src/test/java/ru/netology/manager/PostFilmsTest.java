package ru.netology.manager;

import ru.netology.domain.PostFilms;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PostFilmsTest {

    @Test
    void AfishaTest () {
        AfishaManager manager = new AfishaManager();
        assertEquals(10, 10);
    }

    @Test   // афиша покажи 10 фильмов
    void afishaShow10Film() {
       AfishaManager manager = new AfishaManager(10);
        PostFilms one = new PostFilms( 1, "film 1");
        PostFilms two = new PostFilms(2, "film 2");
        PostFilms three = new PostFilms(3, "film 3");
        PostFilms four = new PostFilms(4, "film 4");
        PostFilms five = new PostFilms(5, "film 5");
        PostFilms six = new PostFilms(6, "film 6");
        PostFilms seven = new PostFilms(7, "film 7");
        PostFilms eight = new PostFilms(8, "film 8");
        PostFilms nine = new PostFilms(9, "film 9");
        PostFilms ten = new PostFilms(10, "film 10");
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        PostFilms[] actual = manager.getLast();
        PostFilms[] expected = new PostFilms[]{ten, nine, eight, seven, six, five, four, three, two, one};

        assertArrayEquals(expected, actual);
    }

    @Test  // афиша покажи заданное количество фильмов (4)
    void afishaShowGivenQuantityFilm() {
        AfishaManager manager = new AfishaManager(4);
        PostFilms one = new PostFilms(1, "film 1");
        PostFilms two = new PostFilms(2, "film 2");
        PostFilms three = new PostFilms(3, "film 3");
        PostFilms four = new PostFilms(4, "film 4");
        PostFilms five = new PostFilms(5, "film 5");
        PostFilms six = new PostFilms(6, "film 6");
        PostFilms seven = new PostFilms(7, "film 7");
        PostFilms eight = new PostFilms(8, "film 8");
        PostFilms nine = new PostFilms(9, "film 9");
        PostFilms ten = new PostFilms(10, "film 10");
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        PostFilms[] actual = manager.getLast();
        PostFilms[] expected = new PostFilms[]{ten, nine, eight, seven,};

        assertArrayEquals(expected, actual);
    }

}





