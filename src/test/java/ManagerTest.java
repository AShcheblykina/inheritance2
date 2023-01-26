import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class ManagerTest {

    @Test
    public void testAdd() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Book book1 = new Book(1, "The birth of tragedy", 100, "Nietzsche");
        Book book2 = new Book(2, "On the other side of good and evil", 400, "Nietzsche");
        Book book3 = new Book(3, "Thus spoke Zarathustra", 600, "Nietzsche");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);


        Product[] expected = {book1, book2, book3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearch() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Book book1 = new Book(1, "The birth of tragedy", 100, "Nietzsche");
        Book book2 = new Book(2, "On the other side of good and evil", 400, "Nietzsche");
        Book book3 = new Book(3, "Thus spoke Zarathustra", 600, "Nietzsche");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] expected = {book3};
        Product[] actual = manager.searchBy("spoke");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testDeleteBook() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);


        Book book1 = new Book(1, "The birth of tragedy", 100, "Nietzsche");
        Book book2 = new Book(2, "On the other side of good and evil", 400, "Nietzsche");
        Book book3 = new Book(3, "Thus spoke Zarathustra", 600, "Nietzsche");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] expected = {book2, book3};
        Product[] actual = repo.deletyById(1);

    }

    @Test
    public void testAddSearch() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Book book1 = new Book(1, "The birth of tragedy", 100, "Nietzsche");
        Book book2 = new Book(2, "On the other side of good and evil", 400, "Nietzsche");
        Book book3 = new Book(3, "Thus spoke Zarathustra", 600, "Nietzsche");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] expected = {book2};
        Product[] actual = manager.searchBy("ot");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddSearchBook() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Book book1 = new Book(1, "The birth of tragedy", 100, "Nietzsche");
        Book book2 = new Book(2, "On the other side of good and evil", 400, "Nietzsche");
        Book book3 = new Book(3, "Thus spoke Zarathustra", 600, "Nietzsche");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] expected = {book2};
        Product[] actual = manager.searchBy("the");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAddSomeSearchBook() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Book book1 = new Book(1, "The birth of tragedy", 100, "Nietzsche");
        Book book2 = new Book(2, "On the other side of good and evil", 400, "Nietzsche");
        Book book3 = new Book(3, "Thus spoke Zarathustra", 600, "Nietzsche");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] expected = {book1,book2, book3};
        Product[] actual = manager.searchBy("th");

        Assertions.assertArrayEquals(expected, actual);
    }

}
