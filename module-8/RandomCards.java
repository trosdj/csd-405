// DJ Trost | CSD405 | Assignment 8 
// Displays 4 randomly chosen cards

import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RandomCards extends Application {
    @Override
    public void start(Stage primaryStage) {
        ArrayList<String> cardList = new ArrayList<>();
        addCards(cardList);

        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5, 5, 5, 5));

        Image card1 = new Image("file:cards/" + cardList.get(0));
        ImageView iv1 = new ImageView(card1);
        pane.getChildren().add(iv1);

        Image card2 = new Image("file:cards/" + cardList.get(1));
        ImageView iv2 = new ImageView(card2);
        pane.getChildren().add(iv2);

        Image card3 = new Image("file:cards/" + cardList.get(2));
        ImageView iv3 = new ImageView(card3);
        pane.getChildren().add(iv3);

        Image card4 = new Image("file:cards/" + cardList.get(3));
        ImageView iv4 = new ImageView(card4);
        pane.getChildren().add(iv4);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Random Cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void addCards(ArrayList<String> cardList) {
        for (int i = 0; i < 52; i++) {
            cardList.add(i + ".png");
        }

        Collections.shuffle(cardList);
    }

    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }
}
