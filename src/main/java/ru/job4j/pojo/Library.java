package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", 375);
        Book twoFriends = new Book("Two Friends", 531);
        Book timeMachine = new Book("Time Machine", 686);
        Book cleanCode = new Book("Clean code", 282);
        Book[] books = new Book[4];
        books[0] = harryPotter;
        books[1] = twoFriends;
        books[2] = timeMachine;
        books[3] = cleanCode;

        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName());
        }

        Book temp = books[3];
        books[3] = books[1];
        books[1] = temp;

        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if ("Clean code".equals(bk.getName())) {
                System.out.println(bk.getName());
            }
        }
    }
}
