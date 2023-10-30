package racingcar.domain;

import static racingcar.domain.RaceRoundSetting.*;
import static racingcar.exception.RaceRoundExceptionMessage.*;

public class RaceRound {


    private final int totalRound;
    private int currentRound;

    public RaceRound(final int totalRound, final int currentRound) {
        validateTotalRound(totalRound);
        validateInitCurrentRound(currentRound);
        this.totalRound = totalRound;
        this.currentRound = currentRound;
    }

    public Boolean increaseCurrentRound() {
        Boolean increased = isLeftRound();
        if (increased) {
            this.currentRound++;
        }
        return increased;
    }

    public Boolean isLeftRound() {
        return currentRound < totalRound ? true : false;
    }


    private void validateTotalRound(final int totalRound) {
        if (totalRound < MIN_TOTAL_GAME_ROUND_COUNT.getSetting()) {
            throw new IllegalArgumentException(ERROR_TOTAL_GAME_ROUND_COUNT.getMessage());
        }
    }

    private void validateInitCurrentRound(final int currentRound) {
        if (currentRound != INIT_CURRENT_GAME_ROUND_COUNT.getSetting()) {
            throw new IllegalArgumentException(ERROR_INIT_CURRENT_GAME_ROUND.getMessage());
        }
    }


}
