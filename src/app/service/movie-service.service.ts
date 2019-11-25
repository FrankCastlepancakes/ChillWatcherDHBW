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
    //console.log(this.http.get(this.moviesUrl));
    //console.log(this.http.get<Movie[]>(this.moviesUrl));
    return this.http.get<Movie[]>(this.moviesUrl);
  }
 
  public save(movie: Movie) {
    return this.http.post<Movie>(this.moviesUrl, movie);
  }
}
