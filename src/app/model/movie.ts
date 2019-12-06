export class Movie {

    movieName: string;
    movieRating: number;
    movieReleaseDate: string;
    movieDesription: string;
    linkToWallpaper: string;

    constructor(
        movieName: string,
        movieRating: number,
        movieReleaseDate: string,
        movieDesription: string,
      ) {
          this.movieName = movieName;
          this.movieRating = movieRating;
          this.movieReleaseDate = movieReleaseDate;
          this.movieDesription = movieDesription;
      }

}
