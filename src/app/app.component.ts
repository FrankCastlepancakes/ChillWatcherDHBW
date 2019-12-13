import { Component } from '@angular/core';
import { Movie } from './model/movie';
import { MovieServiceService } from './service/movie-service.service';
import { Event } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.sass']
})
export class AppComponent {

  movies: Movie[];
  title: string;
 
  constructor(private movieService: MovieServiceService) {
    this.title = 'Chillwatcher';
  }

}
