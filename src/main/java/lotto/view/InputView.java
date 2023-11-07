package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.validation.AmountValidator;
import lotto.validation.WinningNumberValidator;

public class InputView {

    public String inputAmount() {
        String amount = Console.readLine();
        AmountValidator.validateAmount(amount);
        return amount;
    }

    public String inputWinningNumbers() {
        String winningNumbers = Console.readLine();
        WinningNumberValidator.validateWinningNumbers(winningNumbers);
        return winningNumbers;
    }
}
