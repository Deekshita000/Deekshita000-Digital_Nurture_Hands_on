public class Main {

    public static void main(String[] args) {

        Book[] books = {

                new Book(101,
                        "C++ Programming",
                        "Bjarne Stroustrup"),

                new Book(102,
                        "Data Structures",
                        "Mark Allen Weiss"),

                new Book(103,
                        "Java Programming",
                        "Herbert Schildt"),

                new Book(104,
                        "Python Basics",
                        "Eric Matthes"),

                new Book(105,
                        "Web Development",
                        "Jon Duckett")
        };

        String searchTitle = "Java Programming";

        // Linear Search
        Book linearResult =
                LibrarySearch.linearSearch(books, searchTitle);

        System.out.println("Linear Search Result:");

        if (linearResult != null) {
            System.out.println(linearResult);
        } else {
            System.out.println("Book Not Found");
        }

        // Binary Search
        Book binaryResult =
                LibrarySearch.binarySearch(books, searchTitle);

        System.out.println("\nBinary Search Result:");

        if (binaryResult != null) {
            System.out.println(binaryResult);
        } else {
            System.out.println("Book Not Found");
        }
    }
}