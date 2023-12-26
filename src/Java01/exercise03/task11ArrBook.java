package Java01.exercise03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class task11ArrBook {

    public static class ArrBook {
        private List<task10Book.Book> books;

        public ArrBook(List<task10Book.Book> books) {
            this.books = books;
        }

        public void AddBook(task10Book.Book book) {
            books.add(book);
        }

        public double AveragePrice() {
            double sum = 0;
            for (task10Book.Book book : this.books) {
                sum += book.getPrice();
            }
            int count = books.size();
            return (double) sum / count;
        }

        public void SortByTitle() {
            List<task10Book.Book> sortedList = books.stream()
                    .sorted(Comparator.comparing(task10Book.Book::getTitle))
                    .toList();
            System.out.println("Всички книги, сортирани по заглавие:");
            for (task10Book.Book book : sortedList) {
                System.out.println(book.getTitle());
            }
        }

        public void SortByYear() {
            List<task10Book.Book> sortedList = books.stream()
                    .sorted(Comparator.comparingInt(task10Book.Book::getYear))
                    .toList();
            System.out.println("Всички книги, сортирани по година:");
            for (task10Book.Book book : sortedList) {
                System.out.println(book.getTitle() + " | " + book.getYear());
            }
        }

        public void SearchBook(String filter) {
            boolean isPresent = false;
            for (task10Book.Book book : this.books) {
                if (book.getTitle().equals(filter)) {
                    isPresent = true;
                }
            }
            String result = (isPresent) ? "Книгата е намерена" : "Книгата не е намерена";
            System.out.println(result);
        }
    }
}
