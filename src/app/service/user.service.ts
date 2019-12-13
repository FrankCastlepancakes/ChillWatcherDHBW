import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../model/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  users: User[];
 
  constructor(private http: HttpClient) {
  }
 
  public addUser(user: User) {
    this.http.post("http://localhost:8080/addUser", user).toPromise();
    //this.http.post("https://restchillwatcher.herokuapp.com", movie).toPromise();
  }
}
