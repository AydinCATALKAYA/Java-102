public class Book implements Comparable<Book>{
    private String bookName;
    private int bookPage;
    private String author;
    private String releaseDate;

    public Book(String bookName, int bookPage, String writer, String releaseDate) {
        this.bookName = bookName;
        this.bookPage = bookPage;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPage() {
        return bookPage;
    }

    public void setBookPage(int bookPage) {
        this.bookPage = bookPage;
    }

    public String getWriter() {
        return author;
    }

    public void setWriter(String writer) {
        this.author = writer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book o) {
        return this.bookName.compareTo(o.bookName);
    }

    public String toString(){
        return "Book name : " + bookName + "/ Book page : " + bookPage + "/ Author : " + author + "/ Release Date : " + releaseDate ;

    }

}

