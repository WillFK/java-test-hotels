package hotel;

import org.jetbrains.annotations.NotNull;
import util.DateUtils;

import java.util.Date;

public abstract class AbstractHotel {

    public abstract String name();

    public abstract int ranking();

    abstract int getWeekdayCostRegular();
    abstract int getWeekdayCostRewards();

    abstract int getWeekendCostRegular();
    abstract int getWeekendCostRewards();

    public int getCost(@NotNull Date date, boolean isReward) {

        boolean isWeekend = DateUtils.isWeekend(date);
        int cost;

        if (isReward) {
            if (isWeekend) {
                cost = getWeekendCostRewards();
            } else {
                cost = getWeekdayCostRewards();
            }
        } else {
            if (isWeekend) {
                cost = getWeekendCostRegular();
            } else {
                cost = getWeekdayCostRegular();
            }
        }
        return cost;
    }

    @Override
    public String toString() {
        return name();
    }
}
