package com.practice01;

import java.util.*;

public class Lee03 {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("西游记",16));
        list.add(new Book("红楼梦",15));
        list.add(new Book("三国演义",18));

        for (Object o : list) {
            System.out.println(o);
        }

        System.out.println("排序后");

        Lee03.sort(list);
        for (Object o1 : list) {
            System.out.println(o1);
        }


    }
    public static void sort(List list){
        for (int i = 0; i <list.size()-1 ; i++) {
            for (int j = 0; j <list.size()-1 ; j++) {
                    Book book1 = (Book) list.get(j);
                    Book book2 = (Book) list.get(j+1);
                    if (book1.getPrice() > book2.getPrice()){
                        list.set(j,book2);
                        list.set(j+1,book1);
                    }
            }
        }
    }
}
class Book{
    private String name;

    private int price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Book(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Book{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }


}
