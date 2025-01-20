package com.example.demo2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Label pour le titre
        Label titleLabel = new Label("Gestionnaire de Tâches");

        // Champ de saisie pour entrer les tâches
        TextField taskInput = new TextField();
        taskInput.setPromptText("Saisir une tâche");

        // Liste déroulante pour afficher les tâches
        ListView<String> taskList = new ListView<>();

        // Boutons pour les actions
        Button addButton = new Button("Ajouter");
        Button deleteButton = new Button("Supprimer");
        Button markDoneButton = new Button("Marquer comme terminée");

        // Action du bouton "Ajouter"
        addButton.setOnAction(e -> {
            String task = taskInput.getText();
            if (!task.isEmpty()) {
                taskList.getItems().add(task);
                taskInput.clear();
            } else {
                showAlert("Erreur", "Le champ de saisie est vide !");
            }
        });

        // Action du bouton "Supprimer"
        deleteButton.setOnAction(e -> {
            String selectedTask = taskList.getSelectionModel().getSelectedItem();
            if (selectedTask != null) {
                taskList.getItems().remove(selectedTask);
            } else {
                showAlert("Erreur", "Aucune tâche sélectionnée !");
            }
        });

        // Action du bouton "Marquer comme terminée"
        markDoneButton.setOnAction(e -> {
            String selectedTask = taskList.getSelectionModel().getSelectedItem();
            if (selectedTask != null) {
                int selectedIndex = taskList.getSelectionModel().getSelectedIndex();
                taskList.getItems().set(selectedIndex, selectedTask + " (Terminée)");
            } else {
                showAlert("Erreur", "Aucune tâche sélectionnée !");
            }
        });

        // Conteneur pour organiser les éléments
        HBox l1 = new HBox(10,titleLabel, taskInput);
        HBox l2 = new HBox(10,addButton, deleteButton, markDoneButton);

        VBox layout = new VBox(10, l1,l2, taskList);
        layout.setSpacing(10);

        // Configuration de la scène
        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Gestion des Tâches - JavaFX");
        primaryStage.show();
    }


    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}