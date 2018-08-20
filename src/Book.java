public class Book {
    private String title;
    private String author;
   private int releaseDate;
    private int pages;
    private String publisher;
    private String isbn;
   public Book(String title, String author,
         int releaseDate, int pages, String publisher, String isbn) {
        this.title=title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.pages=pages;
        this.publisher =publisher;
        this.isbn=isbn;
    }
    Book(Book book){
        this(book.getTitle(), book.getAuthor(), book.getReleaseDate(),book.getPages(),book.getPublisher(),book.getIsbn() );
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    void printInfo(){
            String info = title + ";" +  author + ";"+ releaseDate + ";"
                    + pages+ ";"+publisher + ";"+isbn;
            System.out.println(info);

    }
}
