package app.controllers;

import app.entities.HueColor;
import app.entities.Movie;
import app.entities.User;
import app.repositories.MovieRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "http://pfobs.de")
@RestController
public class BackendController {

    private final MovieRepository movieRepository;

    public BackendController(final MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        System.out.println(movieRepository.findAll());
        return (List<Movie>) movieRepository.findAll();
    }

    @GetMapping("/movie")
    @ResponseBody
    public List<Movie> getMovie(@RequestParam final String movieName) {
        String url = "https://jrlk1cde9h:n6e17tdyu8@chillwatcher-7128080757.eu-central-1.bonsaisearch.net/movies/_search?q=movieName:"
                + movieName;
        try {
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            String userCredentials = "jrlk1cde9h:n6e17tdyu8";
            String basicAuth = "Basic " + new String(Base64.getEncoder().encode(userCredentials.getBytes()));
            con.setRequestProperty("Authorization", basicAuth);
            if (200 <= con.getResponseCode() && con.getResponseCode() <= 299) {
                BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String response = br.readLine();
                br.close();
                String wordToFind = "_source";
                Pattern word = Pattern.compile(wordToFind);
                Matcher match = word.matcher(response);
                while (match.find()) {
                    String sourceResponse = response.substring(match.end()+2, response.length()-4);
                    ObjectMapper mapper = new ObjectMapper();
                    Movie movie = mapper.readValue(sourceResponse, Movie.class);
                    List<Movie> movieList = new ArrayList<>();
                    movieList.add(movie);
                    return movieList;
                }
            } else {
                BufferedReader br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
                br.close();
            }
        } catch (MalformedURLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        return null;
    }

    @PostMapping("/addMovie")
    void addMovie(@RequestBody final Movie movie) {
        ObjectMapper Obj = new ObjectMapper();
        try { 
            String jsonStr = Obj.writeValueAsString(movie); 
            String url = "https://jrlk1cde9h:n6e17tdyu8@chillwatcher-7128080757.eu-central-1.bonsaisearch.net:443/movies/_doc/";
            CloseableHttpClient client = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(url);
            StringEntity entity = new StringEntity(jsonStr);
            httpPost.setEntity(entity);
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-type", "application/json");
            CloseableHttpResponse response = client.execute(httpPost);
            System.out.println(response.getStatusLine().getStatusCode());
            client.close();
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
    }

    @PostMapping("/addUser")
    void addUser(@RequestBody final User user) {
        System.out.println(user.getIBAN()); 
        ObjectMapper Obj = new ObjectMapper();
        try { 
            String jsonStr = Obj.writeValueAsString(user);
            System.out.println(jsonStr); 
            String url = "https://jrlk1cde9h:n6e17tdyu8@chillwatcher-7128080757.eu-central-1.bonsaisearch.net:443/user/_doc/?";
            CloseableHttpClient client = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(url);
            StringEntity entity = new StringEntity(jsonStr);
            httpPost.setEntity(entity);
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-type", "application/json");
            CloseableHttpResponse response = client.execute(httpPost);
            System.out.println(response.getStatusLine().getStatusCode());
            client.close();
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
    }

    @PutMapping("/changeColor")
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
    }
}