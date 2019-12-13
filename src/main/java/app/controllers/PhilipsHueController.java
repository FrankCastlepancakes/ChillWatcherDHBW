package app.controllers;

import app.entities.HueColor;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PhilipsHueController {

    /*@PutMapping("/changeColor")
    void changeColor(@RequestBody final String name) {
        System.out.println(name);
        HueColor hueColor = null;
        if (name.equals("Robin Hood")){
            hueColor = new HueColor(true, 250, 254, 20000);
        } else if (name.equals("Umbridge")){
            hueColor = new HueColor(true, 100, 254, 1000);
        } else {
            hueColor = new HueColor(true, 200, 254, 40000);
        }
        ObjectMapper Obj = new ObjectMapper();
        try { 
            String jsonStr = Obj.writeValueAsString(hueColor);
            System.out.println(jsonStr);
            URL url = new URL("192.168.253.163/api/ZVHxeKAysLvDyzZddrwuouXC-PacH-c6NLywg3qr/lights/6/state");
            try {
                HttpURLConnection connection = (HttpURLConnection) url.openConnection() ;
                connection.setDoOutput( true ) ;
                connection.setRequestMethod( "PUT" ) ;
                connection.setRequestProperty( "Content-Type", "application/json" ) ;
                OutputStreamWriter os = new OutputStreamWriter( connection.getOutputStream() ) ;
                os.write( jsonStr ) ;
                os.close();
                int status = connection.getResponseCode() ;
                System.out.println(status);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}