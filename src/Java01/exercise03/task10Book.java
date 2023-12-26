package Java01.exercise03;

public class task10Book {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "Джордж Оруел", 1948, 316, 9.78);
        book1.ToString();
    }

    public static class Book {
        private String title;
        private String author;
        private int year;
        private int pages;
        private double price;

        public Book(String title, String author, int year, int pages, double price) {
            this.title = (String) title;
            this.author = (String) author;
            this.year = year;
            this.pages = pages;
            this.price = price;
        }

        public void ToString() {
            System.out.printf("Книга: %s | Автор: %s | Година: %d | Стриници: %d | Цена: %.2f  ",
                    this.title,
                    this.author,
                    this.year,
                    this.pages,
                    this.price);
        }

        public String getTitle() {
            return this.title;
        }
        public int getYear() {
            return this.year;
        }
        public double getPrice() {
            return this.price;
        }
    }
}
