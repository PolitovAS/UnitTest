package seminar2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CartTest {
    private Cart cart;
    private Product product1;
    private Product product2;

    @BeforeEach
    public void  setUp() {
        cart = new Cart();
        product1 = new Product(1, "Apple", 1.2, 10);
        product2 = new Product(2, "Banana", 1.8, 3);
    }

    @Test
    public void TestCalculateTotal(){
        cart.addItem(product1);
        cart.addItem(product2);
        double expectedTotal = 17.4;
        double actualTotal = cart.calculateTotal();
        assertEquals(expectedTotal, actualTotal, "uncorrect");
    }
}
