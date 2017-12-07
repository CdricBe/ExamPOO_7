package Club;

import java.util.ArrayList;
import java.util.List;

public class AffichageType {
    private static List<TypeClub> type = new ArrayList<>();

    static {
        type.add(new TypeClub("Volley-ball"));
        type.add(new TypeClub("Hand-ball"));
        type.add(new TypeClub("Rugby"));
        type.add(new TypeClub("Basket-ball"));
    }
    public List<TypeClub> recupereTypeClub(){
        return type;
    }
}
