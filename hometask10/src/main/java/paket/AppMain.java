package paket;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.*;
import java.lang.ref.WeakReference;

public class AppMain extends Application {
    Stage primaryStage;
    TextField dogName = new TextField("");
    TextField dogAge = new TextField("0");
    TextField ownerName = new TextField("Harri");
    WeakReference<Dog> dogit;
    ByteArrayOutputStream baos;
    ObjectOutputStream oos;
    ByteArrayInputStream bais;
    ObjectInputStream ois;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        try {
            Button createDog = new Button("Create Dog");
            Button nextScene = new Button("Next");
            Label dogNameText = new Label("Dog Name");
            Label dogAgeText = new Label("Dog age");
            Label ownerNameText = new Label("Owner name");
            GridPane root = new GridPane();

            dogAge.textProperty().addListener(new ChangeListener<String>() {
                @Override
                public void changed(ObservableValue<? extends String> observable, String oldValue,
                                    String newValue) {
                    if (!newValue.matches("\\d*")) {
                        dogAge.setText(newValue.replaceAll("[^\\d]", ""));
                    }
                }
            });

            root.setAlignment(Pos.CENTER);
            root.setHgap(10);
            root.setVgap(10);
            root.setPadding(new Insets(25, 25, 25, 25));
            root.add(dogNameText, 0, 0);
            root.add(dogName, 1, 0);
            root.add(dogAgeText, 0, 1);
            root.add(dogAge, 1, 1);
            root.add(ownerNameText, 0, 2);
            root.add(ownerName, 1, 2);
            root.add(createDog, 0, 3);
            root.add(nextScene, 1, 3);

            nextScene.setOnAction((event) -> {
                nextScene();
            });

            createDog.setOnAction((event -> {
                Dog dog = new Dog(dogName.getText(), Integer.valueOf(dogAge.getText()), new Owner(ownerName.getText()));
                dogit = new WeakReference<>(dog);

                try {
                    baos = new ByteArrayOutputStream();
                    oos = new ObjectOutputStream(baos);
                    oos.writeObject(dog);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println(dog);
                dog = null;
            }));

            Scene scene = new Scene(root, 400, 400);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void nextScene() {
        Button gc = new Button("GC");
        Button getDog = new Button("Get Dog");
        Label field = new Label();
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25, 25, 25, 25));
        root.add(getDog, 0, 0);
        root.add(gc, 0, 1);
        root.add(field, 2, 2);

        getDog.setOnAction((event -> {
            System.out.println("Try get Dog");

            if (dogit.get() != null) {
                System.out.println("Dog is alive");
                field.setText(dogit.get().toString());
            } else {
                System.out.println("Dog from cash");
                try {
                    bais = new ByteArrayInputStream(baos.toByteArray());
                    ois = new ObjectInputStream(bais);
                    Dog cloneDog = (Dog) ois.readObject();
                    field.setText(cloneDog.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }));

        gc.setOnAction((event) -> {
            field.setText("");
            System.out.println("Kill the dog");
            System.gc();
        });

        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}