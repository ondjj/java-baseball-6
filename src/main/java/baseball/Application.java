package baseball;

import baseball.controller.BaseballController;
import baseball.util.NumberGenerator;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        NumberGenerator numberGenerator = new NumberGenerator();
        BaseballController baseballController = new BaseballController(inputView, outputView, numberGenerator);

        baseballController.run();
        baseballController.retry();
    }
}
