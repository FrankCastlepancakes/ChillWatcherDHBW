export class Movie {

    movieName: string;
    movieReleaseDate: string;
    movieDescription: string;
    movieCategory: string;
    thumpsUp: number;
    thumpsDown: number;
    myList: boolean;
    linkToWallpaper: string;

    constructor(
        movieName: string,
        movieReleaseDate: string,
        movieDescription: string,
        movieCategory: string,
        thumpsUp: number,
        thumpsDown: number,
        myList: boolean,
        linkToWallpaper: string
      ) {
          this.movieName = movieName,
          this.movieReleaseDate = movieReleaseDate,
          this.movieDescription = movieDescription,
          this.movieCategory = movieCategory,
          this.thumpsUp = thumpsUp,
          this.thumpsDown = thumpsDown,
          this.myList = myList,
          this.linkToWallpaper = linkToWallpaper
      }

}
