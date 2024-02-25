package strategy.util;

import strategy.model.Travel;

import java.util.List;

public class DestinationsRepository {

    public static List<Travel> getTravelOptions() {

        return List.of(
                new Travel(1, "Nova York - Estados Unidos", 2200),
                new Travel(2, "Paris - França", 1850),
                new Travel(3, "Buenos Aires - Argentina", 1100),
                new Travel(4, "Londres - Inglaterra", 890),
                new Travel(5, "Roma - Itália", 1200)
        );
    }
}
