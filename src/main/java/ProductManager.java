public class ProductManager {
    private static ProductRepository  ProductRepository;

    public ProductManager(ProductRepository  ProductRepository) {
        this.ProductRepository =  ProductRepository;
    }

    public static void add(Product product) {
        ProductRepository.add(product);
    }

    public static void removeById(Book book3) {
    }


    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product product:  ProductRepository.findAll()) {
            if(matches(product, text)){
                Product[] tmp = new Product[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;
    }

    private boolean matches(Product product, String search) {
        if (product.getName().contains(search)) {
            return true;
        } else {
            return false;
        }
    }
}
