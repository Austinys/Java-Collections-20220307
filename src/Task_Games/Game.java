package Task_Games;

public class Game {
    private String title;
    private Genre genre;
    private double price;
    private int copiesSold;

    public Game(String title, Genre genre, double price, int copiesSold) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.copiesSold = copiesSold;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;
    }

    public int getCopiesSold() {
        return copiesSold;
    }

    @Override
    public String toString() {
        return "Task_Games.Game{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                ", price=" + price +
                ", copiesSold=" + copiesSold +
                '}';
    }

    public void incrementPrice(double increment) {
        price = price + increment;
    }
}
