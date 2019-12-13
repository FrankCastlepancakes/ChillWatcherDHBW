import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-smart-home',
  templateUrl: './smart-home.component.html',
  styleUrls: ['./smart-home.component.sass']
})
export class SmartHomeComponent {

  private philipsURL: string;
 
  constructor(private http: HttpClient) {
    this.philipsURL = "http://localhost:8080/";
  }
 
  public changeColorToNorthwind() {
    this.http.put("http://localhost:8080/changeColor", "Northwind").toPromise();
  }

  public changeColorToUmbridge() {
    this.http.put("http://localhost:8080/changeColor", "Umbridge").toPromise();
  }

  public changeColorToRobinHood() {
    this.http.put("http://localhost:8080/changeColor", "Robin Hood").toPromise();
  }

}
