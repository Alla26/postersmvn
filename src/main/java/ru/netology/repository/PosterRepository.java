package ru.netology.repository;

import ru.netology.domain.Film;

public class PosterRepository {

    private Film[] posters = new Film[0];

    public Film[] getPosters() {
        return posters;
    }

    public void save(Film poster) {                  //сохраняет новый ф
        Film[] tmp = new Film[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public Film[] findAll() {                          //возвращает все ф
        Film[] all = getPosters();
        Film[] list = new Film[all.length];
        for (int i = 0; i < list.length; i++) {
            list[i] = all[i];
        }
        return list;

    }

    public void findById(int id) {
        Film[] tmp = new Film[1];
        int copyToIndex = 0;
        for (Film poster : posters) {
            if (poster.getId() == id) {
                tmp[copyToIndex] = poster;
                copyToIndex++;
            }
        }
        posters = tmp;
    }

    public void removeById(int id) {
        Film[] tmp = new Film[posters.length - 1];
        int copyToIndex = 0;
        for (Film poster : posters) {
            if (poster.getId() != id) {
                tmp[copyToIndex] = poster;
                copyToIndex++;
            }
        }
        posters = tmp;
    }


    public void removeAll() {
        posters = new Film[0];
        /*Film[] all = getPosters();
        Film[] list = new Film[0];
        for (int i = 0; i < list.length; i++) {
            list[i] = null;*/
    }
    // return list;








      /*  public Film[] findLast() {                        //возвращает все в обр порядке
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
