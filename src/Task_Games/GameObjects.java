package Task_Games;

import java.util.*;

public class GameObjects {
    public static void main(String[] args) {
        Game game1 = new Game("aaaa", Genre.STRATEGY, 59, 100);
        Game game2 = new Game("bbb", Genre.WAR, 5, 1000);
        Game game3 = new Game("cccc", Genre.HISTORY, 49, 30);
        Game game4 = new Game("dddd", Genre.STRATEGY, 89, 50);

        List<Game> games = new ArrayList<>();
        games.add(game1);
        games.add(game2);
        games.add(game3);
        games.add(game4);

        System.out.println("3. Use foreach to go through array of games and print it:");

        for (Game game : games) {
            System.out.println(game);
        }

        System.out.println(" ");
        System.out.println("4. Remove second game and move Printing to the method and print list again:");

        games.remove(1);

        printing(games);

        System.out.println(" ");
        System.out.println("5.1. Sort Games by Price ascending:");

        Collections.sort(games, new GamePriceComparator());
        printing(games);

        System.out.println(" ");
        System.out.println("5.2. Sort Games by Price descending:");

        Collections.sort(games, new GamePriceComparator().reversed());
        printing(games);

        System.out.println(" ");
        System.out.println("1. Using Streams ForEach method increment price:");

        games.stream().forEach(game -> game.incrementPrice(10));
        printing(games);

        System.out.println(" ");
        System.out.println("3. Using Stream Filter games by price (more than 10 euros) and copies sold (more than 50):");

        List<Game> more10EurosSoldMore50Copies = games.stream().filter(game -> game.getPrice() > 10).filter(game -> game.getCopiesSold() > 50).toList();
        printing(more10EurosSoldMore50Copies);

        System.out.println(" ");
        System.out.println("1. Using Streams Sorted sort Games by copies sold:");

        List<Game> sortedGames = games.stream().sorted(Comparator.comparingInt(Game::getCopiesSold)).toList();
        printing(sortedGames);

        System.out.println(" ");
        System.out.println("2. Using Streams Min/Max find Games that has sold minimum copies and maximum:");

        Optional<Game> minCopiesSold = games.stream().min(Comparator.comparingInt(Game::getCopiesSold));
        System.out.println("Games that sold min copies: " + minCopiesSold);

        Optional<Game> maxCopiesSold = games.stream().max(Comparator.comparingInt(Game::getCopiesSold));
        System.out.println("Games that sold max copies: " + maxCopiesSold);
    }

    private static void printing(List<Game> games) {
        for (Game game : games) {
            System.out.println(game);
        }
    }
}
