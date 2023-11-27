package hexlet.code.app;

import java.util.LinkedHashMap;
import java.util.List;

public class Menu {
    private static final List<String> ITEMS = List.of(
            "Greet",
            "Even",
            "Calc",
            "GCD",
            "Progressions",
            "Prime",
            "Exit"
    );
    public static LinkedHashMap<Integer, String> getMenu() {
        var resultMap = new LinkedHashMap<Integer, String>();
        for (var i = 0; i < ITEMS.size(); i++) {
            var index = i != ITEMS.size() - 1 ? i + 1 : 0;
            resultMap.put(index, ITEMS.get(i));
        }
        return resultMap;
    }
}
