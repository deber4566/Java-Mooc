
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        
        ArrayList <Integer> bookArr= new ArrayList<>();
        
        for (Book b:books){
            bookArr.add(b.getId());
        }
        
        for (int i=0;i<bookArr.size();i++){
            if (bookArr.get(i)==searchedId){
                return i;
            }
        }
        
        
            
            
        return -1;
        
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        
        int pointer1=0;
        int pointer2=books.size()-1;
        int middle=0;
        
       
        
        
        while (pointer1<=pointer2){
            middle = (pointer1+pointer2)/2;
            Book book=books.get(middle);
            int bookID=book.getId();
            
            if (bookID==searchedId){
                return middle;
            }
            
            else if (bookID>searchedId){
                pointer2=middle-1;
            }
            
            else if (bookID<searchedId){
                pointer1=middle+1;
            }
        }
        
        return -1;
    }   
}

