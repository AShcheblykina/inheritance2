public class ProductRepository {
    private static Product[] products = new Product[0];

    public static void add(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public static Product[] findAll() {

        return products;
    }

    public Product[] removeById(int removeId) {
        Product[] tmp = new Product[products.length - 1];
        int index = 0;
        for (Product product : products) {
            if (product.getId() != removeId) {
                tmp[index] = product;
                index++;
            }
        }
        products = tmp;
        return tmp;
    }

    public Product[] searchById() {
        Product[] result = new Product[0];
        for (Product product : ProductRepository.findAll()) ;

        return result;
    }
}
