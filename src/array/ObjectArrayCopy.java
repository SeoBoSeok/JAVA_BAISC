package array;

public class ObjectArrayCopy {

    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] library2 = new Book[5];

        library[0] = new Book("JAVA", "JAVA M");
        library[1] = new Book("SPRING", "SPRING M");
        library[2] = new Book("JSP", "JSP M");
        library[3] = new Book("JAVASCIPRT", "JAVASCIPRT M");
        library[4] = new Book("WEB", "WEB M");

        library2[0] = new Book();
        library2[1] = new Book();
        library2[2] = new Book();
        library2[3] = new Book();
        library2[4] = new Book();

        for(int i=0; i<library.length; i++) {
            library2[i].setTitle(library[i].getTitle());
            library2[i].setAuthor(library[i].getAuthor());
        }

//        System.arraycopy(library, 0, library2, 0, 5);

        // 향상된 for 문 :: (type 변수 : 인스턴스)
//        for(Book book : library2) {
//            book.showBookInfo();
//        }

        library[0] = new Book("JAVA", "NEW BOOK");

        for(Book book : library) {
            book.showBookInfo();
        }

        for(Book book : library2) {
            book.showBookInfo();
        }

    }

}
