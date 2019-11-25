import { Component, OnInit } from '@angular/core';
import { Movie } from '../model/movie';
import { MovieServiceService } from '../service/movie-service.service';

@Component({
  selector: 'app-video-list',
  templateUrl: './video-list.component.html',
  styleUrls: ['./video-list.component.sass']
})
export class VideoListComponent implements OnInit {

  movies: Movie[];
 
  constructor(private movieService: MovieServiceService) {
  }

  ngOnInit() {
    //console.log(this.movieService.findAll().source.source);
    this.movieService.findAll().subscribe(data => {
      //console.log('Hello', data);
      this.movies = data;
    });
  }

}
