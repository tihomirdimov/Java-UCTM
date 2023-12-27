package Java01.exercise03;

import java.util.ArrayList;
import java.util.List;

import static Java01.exercise03.task10Book.*;
import static Java01.exercise03.task11ArrBook.*;

public class task12ArrBookTest {
    public static void main(String[] args) {

        Book book1 = new Book(
                "1984", "Джордж Оруел",
                1948, 316, 20.00);
        Book book2 = new Book(
                "Фермата на Животните", "Джордж Оруел",
                1950, 110, 12.60);
        Book book3 = new Book(
                "Изворът", "Айн Ранд",
                1936, 830, 29.00);
        List<Book> booksToAdd = new ArrayList<Book>();
        booksToAdd.add(book1);
        booksToAdd.add(book2);
        booksToAdd.add(book3);
        ArrBook books = new ArrBook(booksToAdd);
        System.out.printf("Средната цена на всички книги в колекцията е %.2f %n", books.AveragePrice());
        books.SortByTitle();
        books.SortByYear();
        books.SearchBook("Изворът");
        books.SearchBook("Пътеводител на галактическия стопаджия");
    }
}
