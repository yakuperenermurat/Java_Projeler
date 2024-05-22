package week5.teknikIcerik2;

public class Book implements Comparable <Book>{
    private String title;
    private int pageCount;
    private String author;
    private String publishDate;

    public Book(String title, int pageCount, String author, String publishDate) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishDate() {
        return publishDate;
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", author='" + author + '\'' +
                ", publishDate='" + publishDate + '\'' +
                '}';
    }

    //Sorting method by book title
    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }
}
