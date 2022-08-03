package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.mockito.Mockito.doReturn;

public class PosterRepositoryTest {

    PosterRepository repo = new PosterRepository();

    Film poster1 = new Film("Матрица", 1999, 1);
    Film poster2 = new Film("Пианист", 2002, 2);
    Film poster3 = new Film("Бойцовский клуб", 1999, 3);
    Film poster4 = new Film("Нефть", 2007, 4);
    Film poster5 = new Film("Превосходство", 2014, 5);
    Film poster6 = new Film("Начало", 2010, 6);
    Film poster7 = new Film("Игры разума", 2001, 7);
    Film poster8 = new Film("Распутник", 2004, 8);
    Film poster9 = new Film("Зеленая миля", 1999, 9);
    Film poster10 = new Film("Декан Спенли", 2008, 10);
    Film poster11 = new Film("Побег из Шоушенка", 1994, 11);
    Film poster12 = new Film("Нежность", 2011, 12);


    @BeforeEach
    public void setup() {
        repo.save(poster1);
        repo.save(poster2);
        repo.save(poster3);
        repo.save(poster4);
        repo.save(poster5);
        repo.save(poster6);
        repo.save(poster7);
        repo.save(poster8);
        repo.save(poster9);
        repo.save(poster10);
        repo.save(poster11);
        repo.save(poster12);
    }

    @Test

    public void shouldSavePosters() {               //проверяет, сохраняются ли новые ф


        Film[] expected = {poster1, poster2, poster3, poster4, poster5, poster6, poster7, poster8, poster9, poster10, poster11, poster12};
        Film[] actual = repo.getPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldReturnAllPosters() {               //проверяет, возвращает ли ф


        Film[] expected = {poster1, poster2, poster3, poster4, poster5, poster6, poster7, poster8, poster9, poster10, poster11, poster12};
        Film[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldReturnById() {


        Film[] expected = {poster9};
        Film[] actual = repo.findById(9);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldRemoveById() {


        Film[] expected = {poster1, poster2, poster4, poster5, poster6, poster7, poster8, poster9, poster10, poster11, poster12};
        Film[] actual = repo.removeById(3);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldRemoveAll() {


        Film[] expected = {};
        Film[] actual = repo.removeAll();

        Assertions.assertArrayEquals(expected, actual);
    }


}
