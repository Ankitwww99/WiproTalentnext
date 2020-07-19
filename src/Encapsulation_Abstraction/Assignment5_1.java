package Encapsulation_Abstraction;
/*
Create a class Author with the following information.
Member variables : name (String), email (String), and gender (char)
Parameterized Constructor: To initialize the variables


Create a class Book with the following information.
Member variables : name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)
[Assumption: Each book will be written by exactly one Author]
Parameterized Constructor: To initialize the variables
Getters and Setters for all the member variables

In the main method, create a book object and print all details of the book (including the author details)
 */
class Author{
    String name, email;
    char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Author [ Name=" + name + ", Email=" + email + ", Gender=" + gender + " ]";
    }
}
class Book{
    String name;
    Author author;
    double price;
    int qytInStock;

    public Book(String name, Author author, double price, int qytInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qytInStock = qytInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQytInStock() {
        return qytInStock;
    }

    public void setQytInStock(int qytInStock) {
        this.qytInStock = qytInStock;
    }
    @Override
    public String toString() {
        return "Book [ Name=" + name + ", Author=" + author + ", price=" + price + ", qtyInStock=" + qytInStock + " ]";
    }
}
public class Assignment5_1 {
    public static void main(String[] args) {
        Author myAuthor = new Author("Yashvant", "yashvant@gmail.com", 'M');
        Book myBook = new Book("Java Basic", myAuthor, 299.0, 800);
        System.out.println(myAuthor);
        System.out.println(myBook);
        myBook.setPrice(350);
        myBook.setQytInStock(500);
        System.out.println("Name of Book: " + myBook.getName());
        System.out.println("Price of Book: " + myBook.getPrice());
        System.out.println("Qyt. in Stick: " + myBook.getQytInStock());
        System.out.println("Author : " + myBook.getAuthor());
    }
}
