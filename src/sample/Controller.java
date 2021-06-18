package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    @FXML
    private Button button1;

    /**
     * Метод, показывающий диаграмму при нажатии на кнопку.
     */
    @FXML
    private void buttonClicked() {
        Diagram.PROG();
    }
}