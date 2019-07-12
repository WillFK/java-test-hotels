package hotel;

public class LakewoodHotel extends AbstractHotel{

    @Override
    public String name() {
        return "Lakewood";
    }

    @Override
    public int ranking() {
        return 3;
    }

    @Override
    int getWeekdayCostRegular() {
        return 110;
    }

    @Override
    int getWeekdayCostRewards() {
        return 80;
    }

    @Override
    int getWeekendCostRegular() {
        return 90;
    }

    @Override
    int getWeekendCostRewards() {
        return 80;
    }
}
