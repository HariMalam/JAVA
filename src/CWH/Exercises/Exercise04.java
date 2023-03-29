package CWH.Exercises;

// Exercise 04 : implement a library using java class library
// Methods : addBook, issueBook, returnBook, showAvailableBooks
// Property : Array to store the available books,
//            Array to store the issued books.

import java.util.Scanner;

class Library {
    private String[] availableBooks = new String[100];
    private String[] issueBooks = new String[100];
    private String[] returnBooks = new String[100];

    public Library() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to My Library 👋");
        boolean b = false;
        while (!b) {
            System.out.println("\nAvailable books - " + totalCount);
            System.out.println("issue books - " + issueCount);

            System.out.print("(1) Show Available Books\t");
            System.out.println("(2) Add Book in Library");
            System.out.print("(3) Issue Book\t\t\t\t");
            System.out.println("(4) Return Book");
            System.out.print("(5) Show Issue Book\t\t\t");
            System.out.println("(6) Show Return Book");
            System.out.println("(0) Exit Library");

            System.out.print("Select One Option : ");
            int s = sc.nextInt();
            switch (s) {
                case 0 -> {
                    b = true;
                    System.out.println("\nExit...");
                }
                case 1 -> showBooks();
                case 2 -> addBook();
                case 3 -> issueBook();
                case 4 -> returnBooks();
                case 5 -> showIssueBooks();
                case 6 -> showReturnBooks();
                default -> System.out.println("\n[Please select valid option!]");
            }
        }
    }

    int totalCount = 0;

    public void addBook() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Book name that you want to add in Library : ");
        String newBook = sc.nextLine();
        availableBooks[totalCount] = newBook;
        totalCount++;
        System.out.println("Added Successfully...");
    }

    public void showBooks() {
        System.out.println();
        if (totalCount <= 0) {
            System.out.println("\n[There are not a books available]");
        }
        for (int i = 0; i < totalCount; i++) {
            System.out.format("(%d) %s\n", i + 1, availableBooks[i]);
        }
    }

    int issueCount = 0;

    public void issueBook() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nAvailable Books in this library is :");
        showBooks();
        System.out.print("Please select number of book for issue : ");
        int n = sc.nextInt();
        issueBooks[issueCount] = availableBooks[n - 1];
        issueCount++;
        System.out.println("Issued Successfully...");
    }

    public void showIssueBooks() {
        if (issueCount <= 0) {
            System.out.println("\n[There are not a books available]");
        }
        for (int i = 0; i < issueCount; i++) {
            System.out.format("(%d) %s\n", i + 1, issueBooks[i]);
        }
    }

    int returnConunt = 0;

    public void returnBooks() {
        Scanner sc = new Scanner(System.in);

        System.out.println("You have following books :");
        showIssueBooks();
        System.out.print("Please select number of book for return :");
        int n = sc.nextInt();
        returnBooks[returnConunt] = issueBooks[n - 1];

        for (int i = n - 1; i < issueCount; i++) {
            issueBooks[i] = issueBooks[i + 1];
        }
        issueCount--;
        returnConunt++;
        System.out.println("Returned Successfully...");
    }

    public void showReturnBooks() {
        if (returnConunt <= 0) {
            System.out.println("\n[There are not a books available]");
        }
        for (int i = 0; i < returnConunt; i++) {
            System.out.format("(%d) %s\n", i + 1, returnBooks[i]);
        }
    }
}

public class Exercise04 {
    public static void main(String[] args) {
        Library myLibrary = new Library();
    }
}