package hotel;

public class RidgewoodHotel extends AbstractHotel {

    @Override
    public String name() {
        return "Ridgewood";
    }

    @Override
    public int ranking() {
        return 6;
    }

    @Override
    int getWeekdayCostRegular() {
        return 220;
    }

    @Override
    int getWeekdayCostRewards() {
        return 100;
    }

    @Override
    int getWeekendCostRegular() {
        return 150;
    }

    @Override
    int getWeekendCostRewards() {
        return 40;
    }
}
