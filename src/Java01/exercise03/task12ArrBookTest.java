package Java01.exercise03;

import java.util.ArrayList;
import java.util.List;

public class task12ArrBookTest {
    public static void main(String[] args) {

        task10Book.Book book1 = new task10Book.Book(
                "1984", "Джордж Оруел",
                1948, 316, 20.00);
        task10Book.Book book2 = new task10Book.Book(
                "Фермата на Животните", "Джордж Оруел",
                1950, 110, 12.60);
        task10Book.Book book3 = new task10Book.Book(
                "Изворът", "Айн Ранд",
                1936, 830, 29.00);
        List<task10Book.Book> booksToAdd = new ArrayList<task10Book.Book>();
        booksToAdd.add(book1);
        booksToAdd.add(book2);
        booksToAdd.add(book3);
        task11ArrBook.ArrBook books = new task11ArrBook.ArrBook(booksToAdd);
        System.out.printf("Средната цена на всички книги в колекцията е %.2f %n", books.AveragePrice());
        books.SortByTitle();
        books.SortByYear();
        books.SearchBook("Изворът");
        books.SearchBook("Пътеводител на галактическия стопаджия");
    }
}
