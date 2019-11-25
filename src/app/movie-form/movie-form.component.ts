import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { MovieServiceService } from '../service/movie-service.service';
import { Movie } from '../model/movie';

@Component({
  selector: 'app-movie-form',
  templateUrl: './movie-form.component.html',
  styleUrls: ['./movie-form.component.sass']
})
export class MovieFormComponent {

  movie: Movie;
 
  constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private movieService: MovieServiceService) {
    this.movie = new Movie();
  }
 
  onSubmit() {
    this.movieService.save(this.movie).subscribe(result => this.gotoMovieList());
  }
 
  gotoMovieList() {
    this.router.navigate(['/movies']);
  }

}
