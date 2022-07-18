import { Component, OnInit } from "@angular/core";
import { ActivatedRoute } from "@angular/router";
import { CourseService } from "./course.service";
import { Course } from "./course";

@Component({
    templateUrl: './course-info.component.html'
})
export class CourseInfoComponents implements OnInit{
    
    course !: Course;
    constructor(private activateRoute:ActivatedRoute, private courseService:CourseService){}
    
    ngOnInit():void{
           this.courseService.retrieveById(+this.activateRoute.snapshot.paramMap.get('id')!).subscribe({
               next:course=> this.course=course,
               error:err=>console.log('Error',err)
           });
    }

    save():void{
        this.courseService.save(this.course).subscribe({
            next:course=>console.log('Saved with success',course),
            error:err=>console.log('Error',err)
        })
    }

}