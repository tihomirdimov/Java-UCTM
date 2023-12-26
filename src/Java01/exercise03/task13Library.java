package Java01.exercise03;

import java.util.List;

public class task13Library {
    public static class Library {
        private String name;
        private String address;
        private String phoneNum;
        private List<Volume> books;

        public Library(String name, String address, String phoneNum, List<Volume> books){
            this.name = name;
            this.address = address;
            this.phoneNum = phoneNum;
            this.books = books;
        }
    }

    // "Volume" се използа вместо "Book" за да се избегнат конфликти с вече създаден клас със същото име
    public static class Volume {
        private String title;
        private String author;
        private String publisher;
        private int year;
        private int quantity;
        private double price;

        public Volume(String title, String author, String publisher, int year, int quantity, double price) {
            this.title = (String) title;
            this.author = author;
            this.publisher = publisher;
            this.year = year;
            this.quantity = quantity;
            this.price = price;
        }
    }
}
