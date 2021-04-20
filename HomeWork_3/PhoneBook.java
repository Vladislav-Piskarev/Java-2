package Java_2.Lesson_3.HomeWork_3;

import java.util.*;

public class PhoneBook {

    public HashMap<String, List<String>> book;

    public PhoneBook() {
        this.book = new HashMap<>();
    }

    public void add (String surname, String number) {
        if (book.containsKey(surname)) {
            List<String> numbers = book.get(surname);
            if (!numbers.contains(number)) {
                numbers.add(number);
                System.out.printf("Номер %s добавлен для фамилии %s%n", number, surname);
            } else {
                System.out.printf("Номер %s уже существует для фамилии %s%n", number, surname);
            }
        } else {
            book.put(surname, new ArrayList<>(Collections.singletonList(number)));
            System.out.printf("Номер %s добавлен для фамилии %s%n", number, surname);
        }
    }

    public List<String> get (String surname) {
        if (book.containsKey(surname)) {
            return book.get(surname);
        } else {
            System.out.printf("В справочнике нет фамилии %s%n", surname);
            return new ArrayList<>();
        }
    }
}
