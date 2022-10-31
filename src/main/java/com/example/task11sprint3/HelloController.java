package com.example.task11sprint3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.*;

public class HelloController {
    @FXML
    private Label saveToFileText;


    @FXML
    private TextField förnamnInput;

    @FXML
    private TextField efternamnInput;

    @FXML
    private TextField emailInput;






    @FXML
    protected void onSparaButtonClick() {
        String path = "src/main/java/savedFile.txt";
        try(PrintWriter writer = new PrintWriter(new FileWriter(path,true))) {
            writer.write(förnamnInput.getText() + "," + efternamnInput.getText() + "," + emailInput.getText() + ",");
            saveToFileText.setText("Filerna sparades till fil");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}