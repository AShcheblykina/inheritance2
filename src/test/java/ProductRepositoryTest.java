import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class ProductRepositoryTest {
    @Test
    public void addedProduct() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(1, "A", 50, "B");
        Book book2 = new Book(2, "C", 100, "D");
        Book book3 = new Book(3, "E", 150, "F");

        ProductManager.add(book1);
        ProductManager.add(book2);
        ProductManager.add(book3);

        Product[] expected = {book1, book2, book3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addedOneProduct() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(1, "A", 50, "B");

        ProductManager.add(book1);

        Product[] expected = {book1};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addedTwoProduct() {
        ProductRepository repo = new ProductRepository();
        ProductManager ProductManager = new ProductManager(repo);

        Book book1 = new Book(1, "A", 50, "B");
        Book book2 = new Book(2, "C", 100, "D");

        ProductManager.add(book1);
        ProductManager.add(book2);

        Product[] expected = {book1, book2};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void deleteProduct() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(1, "A", 50, "B");
        Book book2 = new Book(2, "C", 100, "D");
        Book book3 = new Book(3, "E", 150, "F");

        ProductManager.add(book1);
        ProductManager.add(book2);
        ProductManager.removeById(book3);

        Product[] expected = {book1, book2};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void deleteTwoProduct() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(1, "A", 50, "B");
        Book book2 = new Book(2, "C", 100, "D");
        Book book3 = new Book(3, "E", 150, "F");

        ProductManager.add(book1);
        ProductManager.removeById(book2);
        ProductManager.add(book3);

        Product[] expected = {book1, book3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void deleteOneInProduct() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(1, "A", 50, "B");
        Book book2 = new Book(2, "C", 100, "D");
        Book book3 = new Book(3, "E", 150, "F");

        ProductManager.removeById(book1);
        ProductManager.add(book2);
        ProductManager.add(book3);

        Product[] expected = {book2, book3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void deleteTwoInProduct() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(1, "A", 50, "B");
        Book book2 = new Book(2, "C", 100, "D");
        Book book3 = new Book(3, "E", 150, "F");

        ProductManager.removeById(book1);
        ProductManager.removeById(book2);
        ProductManager.add(book3);

        Product[] expected = {book3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void deleteAllInProduct() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Book book1 = new Book(1, "A", 50, "B");
        Book book2 = new Book(2, "C", 100, "D");
        Book book3 = new Book(3, "E", 150, "F");

        ProductManager.removeById(book1);
        ProductManager.removeById(book2);
        ProductManager.removeById(book3);

        Product[] expected = {};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }
}