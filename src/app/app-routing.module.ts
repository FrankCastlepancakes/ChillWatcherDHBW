import { NgModule }              from '@angular/core';
import { RouterModule, Routes }  from '@angular/router';

import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { VideoListComponent } from './video-list/video-list.component';
import { MovieFormComponent } from './movie-form/movie-form.component';
import { HomeComponent } from './home/home.component';

const appRoutes: Routes = [
  { path: 'movies', component: VideoListComponent },
  { path: 'addvideo', component: MovieFormComponent },
  { path: 'home', component: HomeComponent },
  { path: '',   redirectTo: '/home', pathMatch: 'full' },
  { path: '**', component: PageNotFoundComponent }
];

@NgModule({
  imports: [
    RouterModule.forRoot(appRoutes)
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule {}
