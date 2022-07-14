import { NgModule, Pipe } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { CourseListComponent } from './courses/courses-list.component';
import { StarComponent } from './start/star.component';
import { ReplacePipe } from './pipe/replace.pipe';
import { NavbarComponent } from './nav-bar/nav-bar.component';
import { Erro404Component } from './404/404.component';

@NgModule({
  declarations: [
    AppComponent,
    CourseListComponent,
    StarComponent,
    ReplacePipe,
    NavbarComponent,
    Erro404Component,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot([
      {
        path:'',redirectTo:'courses',pathMatch:'full'
      },
      {
        path: 'courses',component:CourseListComponent
      },
      {
        path: '**', component:Erro404Component
      }
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
