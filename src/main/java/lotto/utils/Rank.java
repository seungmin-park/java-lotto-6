package lotto.utils;

import java.util.Arrays;

public enum Rank {
    NONE(0, 0),
    FIFTH(3, 5_000),
    FOURTH(4, 50_000),
    THIRD(5, 1_500_000),
    SECOND(5, 30_000_000),
    FIRST(6, 2_000_000_000);

    private final int matchCount;
    private final int prize;

    Rank(int matchCount, int prize) {
        this.matchCount = matchCount;
        this.prize = prize;
    }

    public static Rank getRank(int matchCount, boolean isContainBonusNumber) {
        if (isSecond(matchCount, isContainBonusNumber)) {
            return Rank.SECOND;
        }

        return Arrays.stream(Rank.values())
            .filter(rank -> rank.matchCount == matchCount)
            .findFirst()
            .orElse(Rank.NONE);
    }

    private static boolean isSecond(int matchCount, boolean isContainBonusNumber) {
        return matchCount == SECOND.matchCount && isContainBonusNumber;
    }

    public int getMatchCount() {
        return matchCount;
    }

    public int getPrize() {
        return prize;
    }
}
