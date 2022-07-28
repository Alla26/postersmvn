package ru.netology.domain;

public class PosterManager {

    private int limit;        //переменная для количества выводимых фильмов. изменила на private

    private Film[] posters = new Film[0];   //хранит репо

    public PosterManager(int limit) {          //конструктор принимает лимит параметром
        this.limit = limit;
    }

    public PosterManager() {          //конструктор для лимита 10
        this.limit = 10;
    }

    public Film[] getPosters() {            //отдает массив
        return posters;
    }

    public void save(Film poster) {                  //сохраняет новый ф
        Film[] tmp = new Film[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;                  //запоминает новый массив в своем поле
    }

    public Film[] findAll() {                          //возвращает все ф
        Film[] all = getPosters();
        Film[] list = new Film[all.length];
        for (int i = 0; i < list.length; i++) {
            list[i] = all[i];
        }
        return list;

    }


    public Film[] findLast(/*int limit*/) {                        //сделала два разных метода на лимит 10 и рандомный лимит, потому что не разобралась до конца в подсказке по поводу двух конструкторов менеджера. Сразу стало все понятно - метод один, а с помощью разных конструкторов меняем лимит.
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

  /*  public Film[] findLastTen() {                        //возвращает последние 10 добавленных ф
        int limit = 10;
        Film[] all = getPosters();
        Film[] result = new Film[limit];
        for (int i = 0; i < limit; i++) {
            result[i] = all[all.length - 1 - i];
        }
        return result;

    }*/

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
