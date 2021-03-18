public class Book{
 
 private String title;
 private String author;
 private int words;
 private double review; /* ranges from 0 to 10 */
 
 public Book(String title, String author, int words){
   this.title = title; /* constructor method */
   this.author = author;
   this.words = words;
 }
 
 public String getTitle(){
   return(title); /* accessor method */
 }
 
 public void giveReview(int bookReview){
   review = bookReview; /* mutator method */
 }
}
