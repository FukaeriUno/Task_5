public class BonusMilesService {
    public int calculate(int cost) {
        int oneMileCost = 20;
        int miles = cost/oneMileCost;
        return miles;
    }
}
