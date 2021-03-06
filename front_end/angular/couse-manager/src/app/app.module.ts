import { NgModule, Pipe } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { CourseModule } from './courses/course-module';
import { CoreModule } from './corr/core-module';


@NgModule({
  declarations: [
    AppComponent,
   
    
  ],
  imports: [
    BrowserModule,
    CourseModule,
    HttpClientModule,
    CoreModule,
   
    RouterModule.forRoot([
      {
        path:'',redirectTo:'courses',pathMatch:'full'
      },
     
     
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
