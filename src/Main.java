import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
//    Создайте класс Wine, который содержит переменные name, sort и year.
//    Создайте три экземпляра этого класса.
//    Выведите на консоль значения их переменных методом toString.
//
//    Добавить в класс Wine метод: onStock, имеет один параметр – количество бутылок.
//    Выводит на консоль сообщение "На складе имеется количество бутылок".
//
//    Задайте метод getYear – возвращает год производства вина.
//    Вызвать этот метод для каждого из объектов.

    List<Wine> wines = new ArrayList<>();

    Wine wine1 = new Wine();
    wine1.name = "Gewurztraminer";
    wine1.sort = "white, half sweet";
    wine1.year = 2020;
    wines.add(wine1);

    Wine wine2 = new Wine();
    wine2.name = "Chablis";
    wine2.sort = "white, dry";
    wine2.year = 2021;
    wines.add(wine2);

    Wine wine3 = new Wine();
    wine3.name = "Merlot";
    wine3.sort = "red, dry";
    wine3.year = 2021;
    wines.add(wine3);

    for(Wine wine : wines){
      System.out.println(wine.toString());
    }




  }














}