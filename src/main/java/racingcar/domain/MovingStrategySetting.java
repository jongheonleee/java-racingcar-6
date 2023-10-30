package racingcar.domain;

public enum MovingStrategySetting {
    MOVABLE_NUMBER(4),
    RANGE_START_NUMBER(0),
    RANGE_END_NUMBER(9);

    private final int setting;

    MovingStrategySetting(int setting) {
        this.setting = setting;
    }

    public int getSetting() {
        return setting;
    }
}
