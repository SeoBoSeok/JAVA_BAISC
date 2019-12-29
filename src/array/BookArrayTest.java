package array;

public class BookArrayTest {

    public static void main(String[] args) {

        Book[] library = new Book[5]; // 책이 5권 생긴것이 아니라 우선 null로 초기화

//        library[0] = new Book("JAVA", "JAVA M");
//        library[1] = new Book("SPRING", "SPRING M");
//        library[2] = new Book("JSP", "JSP M");
//        library[3] = new Book("JAVASCIPRT", "JAVASCIPRT M");
//        library[4] = new Book("WEB", "WEB M");

        for(int i=0; i<library.length; i++) {
            System.out.println(library[i]); // null
//            library[i].showBookInfo();
        }

    }

}
