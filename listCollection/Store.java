import java.util.ArrayList;
import java.util.List;

public class Store {

    private ArrayList<Book> books; 
    

    public Store(){
        this.books= new ArrayList<>(); 
    }

    public Book getBook(int index){
        Book bookCopy = new Book(this.books.get(index));  
        return bookCopy; 
    }

    public void setBook(int index, Book newbook){
        this.books.set(index, new Book(newbook));
    }

    public void addBook(Book newBook){
        this.books.add(new Book(newBook)); 
    }


    public boolean contains(Book book) {
        return this.books.contains(book);
    }

    public void sellBook(String title){
        for(int i=0; i<books.size(); i++){
            if(this.books.get(i).getTitle().equals(title)){
                this.books.remove(i); 
            }
        }
    }
    
}
