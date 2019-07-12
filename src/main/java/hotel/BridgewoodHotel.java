package hotel;

public class BridgewoodHotel extends AbstractHotel {

    @Override
    public String name() {
        return "Bridgewood";
    }

    @Override
    public int ranking() {
        return 4;
    }

    @Override
    int getWeekdayCostRegular() {
        return 160;
    }

    @Override
    int getWeekdayCostRewards() {
        return 110;
    }

    @Override
    int getWeekendCostRegular() {
        return 60;
    }

    @Override
    int getWeekendCostRewards() {
        return 50;
    }
}
