import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";
import { RouterModule } from "@angular/router";
import { AppPipeModule } from "../shared/component/pipe/app-pipe-module";
import { StartModule } from "../shared/component/start/star-module";
import { CourseInfoComponents } from "./course-info.component";
import { CourseListComponent } from "./courses-list.component";




@NgModule({
    declarations:[
        CourseListComponent,
        CourseInfoComponents
     
    
    ],
    imports:[
        CommonModule,
        FormsModule,
        AppPipeModule,
        StartModule,
        RouterModule.forChild([
            {
                path:'course/info/:id', component: CourseInfoComponents
            },
            {
                path: 'courses',component:CourseListComponent
            }
        ])
    ]
})

export class CourseModule{

}

