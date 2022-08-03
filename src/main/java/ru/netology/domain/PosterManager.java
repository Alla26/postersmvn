package ru.netology.domain;

import ru.netology.repository.PosterRepository;

public class PosterManager {

    private PosterRepository repo;

    public PosterManager(PosterRepository repo) {
        this.repo = repo;
    }

    public Film[] add(Film poster) {
        repo.save(poster);
        return new Film[0];
        // return new Film[getPosters().length];
    }

    public Film[] getPosters() {
        Film[] all = repo.getPosters();
        Film[] newlyCreated = new Film[all.length];
        for (int i = 0; i < newlyCreated.length; i++) {
            newlyCreated[i] = all[i];
        }
        return newlyCreated;
    }


   /* public void findAllFilm() {             //возвращает все ф
        repo.findAll();
       return;
    }





   /* private Film[] posters = new Film[0];




    public Film[] findAll() {                          //возвращает все ф
        Film[] all = getPosters();
        Film[] list = new Film[all.length];
        for (int i = 0; i < list.length; i++) {
            list[i] = all[i];
        }
        return list;

    }

    public Film[] findLast() {                        //возвращает все в обр порядке
        Film[] all = getPosters();
        Film[] reversed = new Film[all.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

    public Film[] findLastTen() {                       //возвращает последние 10 добавленных ф
        int quantity = 10;
        Film[] reversed = findLast();
        Film[] abbreviated = new Film[quantity];
        for (int i = 0; i < quantity; i++) {
            abbreviated[i] = reversed[i];
        }
        return abbreviated;

    }

    public Film[] findLastRandom(int quantity) {             //возвращает последние Х добавленных ф
        Film[] reversed = findLast();
        Film[] abbreviatedRandom = new Film[quantity];
        for (int i = 0; i < quantity; i++) {
            abbreviatedRandom[i] = reversed[i];
        }
        return abbreviatedRandom;
    }*/

}
