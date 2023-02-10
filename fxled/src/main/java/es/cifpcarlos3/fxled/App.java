/*
 * Copyright (c) 2013. by Gerrit Grunwald
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package es.cifpcarlos3.fxled;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class App extends Application {
    private static int noOfNodes = 0;

    @Override public void start(Stage stage) {
        var control = new ShapeLed();
        control.setPrefWidth(200);
        control.setPrefHeight(200);

        StackPane pane = new StackPane();
        pane.getChildren().setAll(control);

        Scene scene = new Scene(pane);

        stage.setTitle("JavaFX Led Canvas");
        stage.setScene(scene);
        stage.show();
        
        control.setBlinking(true);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}