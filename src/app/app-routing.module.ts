import { NgModule }              from '@angular/core';
import { RouterModule, Routes }  from '@angular/router';

import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { LoginComponent } from './login/login.component';
import { MoviesComponent } from './movies/movies.component';
import { SeriesComponent } from './series/series.component';
import { MyListComponent } from './my-list/my-list.component';
import { RecentlyAddedComponent } from './recently-added/recently-added.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { HomeComponent } from './home/home.component';
import { MovieFormComponent } from './movie-form/movie-form.component';
import { PrivacyComponent } from './privacy/privacy.component';
import { ThrillerComponent } from './thriller/thriller.component';
import { KomoedienComponent } from './komoedien/komoedien.component';
import { DramaComponent } from './drama/drama.component';
import { HorrorComponent } from './horror/horror.component';
import { KidsComponent } from './kids/kids.component';
import { ImpressumComponent } from './impressum/impressum.component';
import { KontoDetailsComponent } from './konto-details/konto-details.component';
import { SmartHomeComponent } from "./smart-home/smart-home.component";

const appRoutes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'movies', component: MoviesComponent },
  { path: 'series', component: SeriesComponent },
  { path: 'my-list', component: MyListComponent },
  { path: 'recently-added', component: RecentlyAddedComponent },
  { path: 'sign-up', component: SignUpComponent },
  { path: 'movie-Form', component: MovieFormComponent },
  { path: 'privacy', component: PrivacyComponent },
  { path: 'thriller', component: ThrillerComponent },
  { path: 'komoedien', component: KomoedienComponent },
  { path: 'drama', component: DramaComponent },
  { path: 'horror', component: HorrorComponent },
  { path: 'kids', component: KidsComponent }, 
  { path: 'impressum', component:ImpressumComponent },
  { path: 'konto-details', component:KontoDetailsComponent },
  { path: 'smart-home', component:SmartHomeComponent },
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
