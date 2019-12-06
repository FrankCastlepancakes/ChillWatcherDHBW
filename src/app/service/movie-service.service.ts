import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Movie } from '../model/movie';
import { Observable } from 'rxjs';

@Injectable()
export class MovieServiceService {

  private moviesUrl: string;

  movies: Movie[];
 
  constructor(private http: HttpClient) {
    //this.moviesUrl = 'https://restchillwatcher.herokuapp.com';
    this.moviesUrl = "http://localhost:8080/movies";
  }
 
  public findAll(): Observable<Movie[]> {
    return this.http.get<Movie[]>(this.moviesUrl);
  }

  /*public findMatching(searchInput: String): Observable<Movie[]> {
    return null;
    //return this.http.get<Movie[]>(this.moviesUrl + "?name=" + searchInput);
  }*/
 
  public addMovie(movie: Movie) {
    this.http.post("http://localhost:8080/addMovie", movie).toPromise();
  }
}
