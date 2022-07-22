package ru.netology.domain;

public class PosterManager {

    public int limit;

    private Film[] posters = new Film[0];

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public PosterManager() {

    }

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


    public Film[] findLastRandom(int limit) {                        //возвращает последние Х добавленных ф
        int resultLength = posters.length;
        if (resultLength >= limit) {
            resultLength = limit;
        } else {
            resultLength = resultLength;
        }
        Film[] all = getPosters();
        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = all[all.length - 1 - i];
        }
        return result;

    }

    public Film[] findLastTen() {                        //возвращает последние 10 добавленных ф
        int limit = 10;
        Film[] all = getPosters();
        Film[] result = new Film[limit];
        for (int i = 0; i < limit; i++) {
            result[i] = all[all.length - 1 - i];
        }
        return result;

    }

    /*  public Film[] findLast() {                        //возвращает все в обр порядке
        Film[] all = getPosters();
        Film[] reversed = new Film[all.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }*/

    /*  public Film[] findLastRandom(int quantity) {             //возвращает последние Х добавленных ф
        Film[] reversed = findLast();
        Film[] abbreviatedRandom = new Film[quantity];
        for (int i = 0; i < quantity; i++) {
            abbreviatedRandom[i] = reversed[i];
        }
        return abbreviatedRandom;
    }*/

    /*  public Film[] findLastTen() {                       //возвращает последние 10 добавленных ф
        int quantity = 10;
        Film[] reversed = findLast();
        Film[] abbreviated = new Film[quantity];
        for (int i = 0; i < quantity; i++) {
            abbreviated[i] = reversed[i];
        }
        return abbreviated;

    }*/


}
