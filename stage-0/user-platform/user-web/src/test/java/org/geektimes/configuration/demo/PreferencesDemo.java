package org.geektimes.configuration.demo;

import java.util.HashMap;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

public class PreferencesDemo {

//    public static void main(String[] args) throws BackingStoreException {
//        Preferences userPreferences = Preferences.userRoot();
//        userPreferences.put("my-key", "Hello,World");
//        userPreferences.flush();
//        System.out.println(userPreferences.get("my-key", null));
////        Preferences.systemRoot();
//    }



        public static void main(String[] args) {
            // 创建一个 HashMap
            HashMap<String, Integer> prices = new HashMap<>();

            // 往HashMap中添加映射项
            prices.put("Shoes", 200);
            prices.put("Bag", 300);
            prices.put("Pant", 150);
            System.out.println("HashMap: " + prices);

            // 计算 Shirt 的值
            int shirtPrice = prices.computeIfAbsent("Shirt", key -> 280);
            System.out.println("Price of Shirt: " + shirtPrice);
            int shoesPrice = prices.computeIfAbsent("Shoes", key -> 1);
            System.out.println("Price of shoes: " + shoesPrice);
            // 输出更新后的HashMap
            System.out.println("Updated HashMap: " + prices);
        }
}
