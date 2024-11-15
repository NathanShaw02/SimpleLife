package com.simplelife;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        //BorderPane firstPageBorder = new BorderPane();

        //creating a gridpane for which the front page will be arranged on
        GridPane entryPageGridpane = new GridPane();
        entryPageGridpane.setMinSize(1600,900);
        entryPageGridpane.setHgap(15);

        //defines spacing for gridpane

        //defining elements that will appear on first page
        Label greetingsLabel = new Label("Welcome! What happened today?");
        Button historyButton = new Button("History");
        Label dayRatingLabel =  new Label("How today felt out of 10:  ");
        String oneToTen[] = {"1","2","3","4","5","6","7","8","9","10"};
        ComboBox dayRatingCombobox = new ComboBox(FXCollections.observableArrayList(oneToTen));
        HBox dayRatingHbox = new HBox(dayRatingLabel,dayRatingCombobox);
        Label dateSelectionLabel =  new Label("Date:");
        DatePicker entryDate = new DatePicker();
        VBox datePickerVbox = new VBox(dateSelectionLabel,entryDate);
        Label SOTDTitleLabel = new Label("Song of the day:  ");
        Label SOTDNameLabel = new Label("Song Name:  ");
        TextField SOTDNameTextField = new TextField();
        Label SOTDArtistLabel = new Label("Artist:");
        TextField SOTDArtistTextField = new TextField();
        HBox SOTDHbox = new HBox(SOTDNameLabel,SOTDNameTextField,SOTDArtistLabel,SOTDArtistTextField);
        SOTDHbox.setSpacing(20);
        Label dayNotesLabel = new Label("Plans/Occurances today:  ");
        TextArea todaysNotesTextArea = new TextArea();
        todaysNotesTextArea.setMinSize(400,250);
        todaysNotesTextArea.setWrapText(true);

        //adds elements to gridpane
        entryPageGridpane.add(greetingsLabel,0,0);
        entryPageGridpane.add(historyButton,2,0);
        entryPageGridpane.add(dayRatingHbox,0,1);
        entryPageGridpane.add(datePickerVbox,2,1);
        entryPageGridpane.add(SOTDTitleLabel,0,3);
        entryPageGridpane.add(dayNotesLabel,2,3);
        entryPageGridpane.add(SOTDHbox,0,4);
        entryPageGridpane.add(todaysNotesTextArea,2,4);






        //defines the first scene that all elements operate on
        Scene firstPageScene = new Scene(entryPageGridpane,1600,900);
        stage.setScene(firstPageScene);
        stage.setTitle("Simple Life");
        stage.show();
    }

    public static void main(String[] args) {//defines main class where the program originates
        System.out.println("Launching!");
        launch();//launches program
    }

}