package racingcar.domain;

public enum CarSetting {

    MAX_NAME_LENGTH(5),
    INIT_POSITION(0);
    private final int setting;

    CarSetting(int setting) {
        this.setting = setting;
    }

    public int getSetting() {
        return setting;
    }
}
