import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> Console = new ArrayList<>();
        Console.add("PS5");
        Console.add("Switch");
        Console.add("Xbox");

        System.out.println(Console.get(0));
        System.out.println(Console.size());

        Map<Integer , String> games = new HashMap<>();
        games.put(1, "SONY:PS5");
        games.put(2, "任天堂:Switch");
        games.put(3, "Microsoft:Xbox");

        System.out.println(games.get(1));
        System.out.println(games.size());

        games.clear();
        System.out.println(games.size());

        try {
            System.out.println(pcGamesById(6));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Map<Integer, String> pcGamesById = new HashMap<>(){{
        put(1, "フォートナイト");
        put(2, "APEX");
        put(3, "AVA");
        put(4, "原神");
        put(5, "エルデンリング");
    }};

    private static String pcGamesById(int id) throws Exception{
        String pcGames = pcGamesById.get(id);
        if (pcGames == null){
            throw new Exception("該当するゲームがありません。" + id);
        }
        return pcGames;

    }



}
