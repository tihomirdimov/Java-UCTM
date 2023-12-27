package Java01.exercise03;

import Java01.exercise03.task13Library.Library;
import Java01.exercise03.task13Library.Volume;

import java.util.ArrayList;
import java.util.List;

public class task14TestLibrary {
    public static void main(String[] args) {
        List<Volume> bookCollection = new ArrayList<Volume>();
        Volume book1 = new Volume(
                "1984", "Джордж Оруел", "Хеликон",
                1948, 3, 20.00);
        Volume book2 = new Volume(
                "Фермата на Животните", "Джордж Оруел", "Сиела",
                1950, 4, 12.60);
        Volume book3 = new Volume(
                "Изворът", "Айн Ранд", "Народна младеж",
                1936, 1, 29.00);
        Volume book4 = new Volume(
                "Фермата на Животните", "Джордж Оруел", "Хеликон",
                1950, 1, 10.00);
        Volume book5 = new Volume(
                "Конникът без глава", "Майн Рид", "Отечество",
                1865, 7, 12.00);
        bookCollection.add(book1);
        bookCollection.add(book2);
        bookCollection.add(book3);
        bookCollection.add(book4);
        // Създване на библиотека
        Library library = new Library(
                " Софийска библиотека",
                "Пл. Славейков 2",
                "359 88888888",
                bookCollection);
        // Показване на всички книги в библиотеката
        library.getAllVolumes();
        // Изтриване на всички книги с определено заглавие в библиотеката
        library.deleteVolume("Фермата на Животните");
        // Показване на всички книги в библиотеката след изтриване на томове
        library.getAllVolumes();
        // Повторно добавяне на книгите
        library.addVolume(book2);
        library.addVolume(book4);
        library.addVolume(book5);
        // Показване на всички книги в библиотеката след повторно добавяне на томовете
        library.getAllVolumes();
        // Търсене на всички книги в библиотеката по автор
        library.searchVolumeByAuthor("Айн");
        // Търсене на всички книги в библиотеката по заглавие
        library.searchVolumeByTitle("Фермата на Животните");
        library.getTotalNumberOfVolumes();
        library.getDistinctVolumes();
    }
}
