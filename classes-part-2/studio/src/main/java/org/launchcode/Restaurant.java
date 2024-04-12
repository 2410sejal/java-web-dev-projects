package org.launchcode;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
        // write your code here
//        Create several items and add them to a menu.

        MenuItem item1 = new MenuItem("Samosa",2.99,"a spicy and tasty","Breakfast");
        MenuItem item2 = new MenuItem("butter panner",12.99,"cheese gravy","Maincouse");
        MenuItem item3 = new MenuItem("biryani",14.99,"spicy rice with veggi","Maincourse");
        MenuItem item4 = new MenuItem("GulabJamun",7.99,"sweet","Dessert");
        MenuItem item5 = new MenuItem("Rasmalai",5.99,"sweet","Dessert");
        Date today = Calendar.getInstance().getTime();
        System.out.println(item1);
//                Print the entire, updated menu to the screen.
        ArrayList<MenuItem> item = new ArrayList<>();
        item.add(item1);
        item.add(item2);
        item.add(item3);
        item.add(item4);
        item.add(item5);
        Menu Mymenu = new Menu(today, item);
        System.out.println(Mymenu);

//        Print an individual menu item to the screen.
//        Delete an item from a menu, then reprint the menu.
    }
}
