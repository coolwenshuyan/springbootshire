package com.coolwen.springbootshiro.specification;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;

import java.util.ArrayList;
import java.util.List;

public class SimpleSortBuilder {

    /**
     * 调用的时候使用SimpleSortBuilder.generateSort("name","xh_d");表示先以name升序，之后以xh降序
     */
    public static Sort generateSort(String... fields) {
        List<Order> orders = new ArrayList<Order>();
        for (String f : fields) {
            orders.add(generateOrder(f));
        }
        return Sort.by(orders);
    }

    private static Order generateOrder(String f) {
        Order order = null;
        String[] ff = f.split("_");
        if (ff.length >= 2) {
            if (ff[1].equals("d")) {
                order = new Order(Direction.DESC, ff[0]);
            } else {
                order = new Order(Direction.ASC, ff[0]);
            }
            return order;
        }
        order = Order.by(f);
        return order;
    }

}
