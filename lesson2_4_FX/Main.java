/*
Сделать с помощью JavaFx

1. Создать окно для клиентской части чата: большое текстовое поле для отображения переписки
в центре окна. Однострочное текстовое поле для ввода сообщений и кнопка для отсылки
сообщений на нижней панели. Сообщение должно отсылаться либо по нажатию кнопки на
форме, либо по нажатию кнопки Enter. При «отсылке» сообщение перекидывается из нижнего поля в центральное.
Должна осуществляться "прокрутка" сообщений
 */


package lesson2_4_FX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Чат");
        primaryStage.setScene(new Scene(root, 350, 375));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
