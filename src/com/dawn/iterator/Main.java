package com.dawn.iterator;

/**
 * @Author xdc90
 * @Date 2018/5/7
 */
public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.appendBook(new Book("111"));
        bookShelf.appendBook(new Book("222"));
        bookShelf.appendBook(new Book("333"));

        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            System.out.println(((Book)it.next()).getName());
        }

    }
}
