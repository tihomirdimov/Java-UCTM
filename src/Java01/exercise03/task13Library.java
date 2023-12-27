package Java01.exercise03;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.List.*;

public class task13Library {
    public static class Library {
        private String name;
        private String address;
        private String phoneNum;
        private List<Volume> books;

        public Library(String name, String address, String phoneNum, List<Volume> books) {
            this.name = name;
            this.address = address;
            this.phoneNum = phoneNum;
            this.books = books;
        }

        public void getAllVolumes(){
            for (Volume volume : this.books) {
                volume.getVolume();
            }
        }

        public void addVolume(Volume volume) {
            this.books.add(volume);
        }

        public void deleteVolume(String title) {
            this.books.removeIf(v -> v.getVolumeTitle().equals(title));
        }

        public void searchVolumeByAuthor(String author) {
            List<Volume> filtered = this.books
                    .stream()
                    .filter(v -> v.getVolumeAuthor().contains(author))
                    .toList();
            for (Volume volume : filtered) {
                volume.getVolume();
            }
        }

        public void searchVolumeByTitle(String title) {
            List<Volume> filtered = this.books
                    .stream()
                    .filter(v -> v.getVolumeTitle().equals(title))
                    .toList();
            for (Volume volume : filtered) {
                volume.getVolume();
            }
        }

        public void searchVolumeByYear(int year) {
            List<Volume> filtered = this.books.stream().filter(v -> v.getVolumeYear() == year).toList();
            for (Volume volume : filtered) {
                volume.getVolume();
            }
        }

        public void getTotalNumberOfVolumes(){
            System.out.printf("Общият брой на книгите в библиотеката е %d %n", this.books.size());
        }
        public void getDistinctVolumes(){
            List<Volume> filtered = books.stream()
                    .filter(distinctByKey(p -> p.getVolumeTitle()))
                    .collect(Collectors.toList());
            System.out.printf("Броят на уникалните заглавия в библиотеката е %d %n", filtered.size());
        }

        public static <T> Predicate<T> distinctByKey(
                Function<? super T, ?> keyExtractor) {

            Map<Object, Boolean> seen = new ConcurrentHashMap<>();
            return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
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

        public void getVolume() {
            System.out.printf("Книга: %s | Автор: %s | Издателство: %s | Година: %d | Бройки: %d | Цена: %.2f %n",
                    this.title,
                    this.author,
                    this.publisher,
                    this.year,
                    this.quantity,
                    this.price);
        }

        public String getVolumeTitle() {
            return this.title;
        }

        public String getVolumeAuthor() {
            return this.author;
        }

        public int getVolumeYear() {
            return this.year;
        }
    }
}
