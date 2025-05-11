package com.example.glamourfx.main;

import com.example.glamourfx.data.Appointment;
import com.example.glamourfx.data.Customer;
import com.example.glamourfx.data.Hairdresser;
import com.example.glamourfx.data.Service;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/glamourfx/welcome.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("GlamourFX");
        primaryStage.setScene(scene);

        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("");

        primaryStage.show();
    }

    public static void main(String[] args) {launch(args);
        /*
        Service s1 = new Service("a",42.5,5);
        Service s2 = new Service("b",42.5,5);
        List<Service> services = List.of(s1,s2);
        Hairdresser h = new Hairdresser("h",3);
        Customer c = new Customer("a","a","a","a");
        System.out.println(h);

        Appointment a = new Appointment("cita1", LocalDateTime.now(),c,h,services,20.0,15);
        System.out.println(a);
        */
    }
}
