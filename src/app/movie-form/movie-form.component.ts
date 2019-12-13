import { Component, OnInit } from '@angular/core';
import {FormControl} from '@angular/forms';
import { Movie } from '../model/movie';
import { MovieServiceService } from '../service/movie-service.service';

@Component({
  selector: 'app-movie-form',
  templateUrl: './movie-form.component.html',
  styleUrls: ['./movie-form.component.sass']
})
export class MovieFormComponent implements OnInit {

  startDate = new Date(2019, 12, 1);

  movies: Movie[];

  constructor(private movieService: MovieServiceService) {
  }

  ngOnInit() {
    //console.log(this.movieService.findAll().source.source);
    this.movieService.findAll().subscribe(data => {
      this.movies = data;
      const numbers = data.map( o => o.movieName);
      for (var _i = 0; _i < numbers.length; _i++) {
        data[_i].linkToWallpaper = "assets/img/Filme/" + data[_i].movieName + ".jpg";
      }
    });
  }

  model = new Movie("", "", "", "", 0, 0, false, "");

  submitted = false;

  onSubmit() { this.submitted = true; }

  newMovie() {
    this.model.linkToWallpaper = "assets/img/Filme/" + this.model.movieName + ".jpg";
    this.movieService.addMovie(this.model);
  }

  search(event : any) {
    if (event.keyCode === 13){
      let inputText = event.target.value;
      this.movieService.findMatching(inputText).subscribe(data => {
        this.movies = data;
        const numbers = data.map( o => o.movieName);
        for (var _i = 0; _i < numbers.length; _i++) {
          data[_i].linkToWallpaper = "assets/img/Filme/" + data[_i].movieName + ".jpg";
        }
        console.log(data);
      }); 
    } 
  }

}
