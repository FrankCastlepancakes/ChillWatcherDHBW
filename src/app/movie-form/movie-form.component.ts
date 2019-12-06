import { Component, OnInit } from '@angular/core';
import { Movie } from '../model/movie';
import { MovieServiceService } from '../service/movie-service.service';

@Component({
  selector: 'app-movie-form',
  templateUrl: './movie-form.component.html',
  styleUrls: ['./movie-form.component.sass']
})
export class MovieFormComponent implements OnInit {

  startDate = new Date(2019, 12, 1);

  constructor(private movieService: MovieServiceService) {
  }

  ngOnInit() {
  }

  model = new Movie("Lol", 100.0, "6/12/2020", "Hello");

  submitted = false;

  onSubmit() { this.submitted = true; }

  newMovie() {
    this.movieService.addMovie(this.model);
  }

}
