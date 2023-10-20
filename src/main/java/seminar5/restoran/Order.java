package seminar5.restoran;

import java.util.ArrayList;
import java.util.List;

// Класс, представляющий заказ
public class Order {
    private List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public List<MenuItem> getItems() {
        return items;
    }
}
