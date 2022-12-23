public class BonusMilesService {

    public int calculate(int cost) {
        int bonusMili = 20;

        int miles = cost / bonusMili;
        return miles;
    }
}