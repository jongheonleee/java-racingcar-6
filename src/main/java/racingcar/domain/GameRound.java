package racingcar.domain;

public class GameRound {

    private static final Integer MIN_ROUND_COUNT = 1;

    private final int totalRound;
    private int currentRound;

    public GameRound(int totalRound, int currentRound) {
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


    private void validateTotalRound(int totalRound) {
        if (totalRound < MIN_ROUND_COUNT) {
            throw new IllegalArgumentException("[ERROR] 게임 실행 회수 입력값은 1 이상이어야 합니다.");
        }
    }

    private void validateInitCurrentRound(int currentRound) {
        if (currentRound != 0) {
            throw new IllegalArgumentException("[ERROR] 현재 실행된 게임 회수의 초기값은 0이어야 합니다.");
        }
    }


}
