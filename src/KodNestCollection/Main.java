package KodNestCollection;

import java.util.*;

class Product {
    String id;
    int price;

    public Product(String id, int price) {
        this.id = id;
        this.price = price;
    }
}

class Coupon {
    int discount;
    int minPrice;

    public Coupon(int discount, int minPrice) {
        this.discount = discount;
        this.minPrice = minPrice;
    }
}

public class Main {
    public static void main(String[] args) {

         List<Product> products = new ArrayList<>(List.of(
                new Product("P101", 500),
                new Product("P102", 1000),
                new Product("P103", 800),
                new Product("P104", 1500),
                new Product("P105", 400)
        ));

         List<Coupon> coupons = new ArrayList<>(List.of(
                new Coupon(200, 1000),
                new Coupon(150, 800),
                new Coupon(100, 500),
                new Coupon(50, 300)
        ));

        // Sort coupons by discount descending
        coupons.sort((a, b) -> b.discount - a.discount);
        Set<Integer> usedCoupons = new HashSet<>();
        Map<String,Integer> applied = new HashMap<>();
        int totalDiscount = 0;

        for (Product product : products) {
            for (int i = 0; i < coupons.size(); i++) {
                if (!usedCoupons.contains(i) && product.price >= coupons.get(i).minPrice) {
                    applied.put(product.id, coupons.get(i).discount);
                    totalDiscount += coupons.get(i).discount;
                    usedCoupons.add(i);
                    break;
                }
            }
        }

        // Output
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println(product.id + " - ₹" + product.price);
        }

        System.out.println("\nApplied Coupons:");
        for (Product product : products) {
            if (applied.containsKey(product.id)) {
                System.out.println(product.id + " - ₹" + applied.get(product.id) + " applied");
            } else {
                System.out.println(product.id + " - No coupon");
            }
        }

        System.out.println("\nTotal Discount Saved: ₹" + totalDiscount);
    }
}
