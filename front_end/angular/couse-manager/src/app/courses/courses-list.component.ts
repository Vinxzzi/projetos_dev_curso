import { Component, OnInit } from "@angular/core";

import { Course } from './course';
import { CourseService } from "./course.service";




@Component({

    

    templateUrl: './courses-list.component.html'

})

export class CourseListComponent implements OnInit{

    _filteredCourses:Course[]=[];
    
    filterBy !:string;
    _courses: Course[] = [];

    

        constructor(private courseService: CourseService){

        }

    ngOnInit(): void{

       this.retriveAll();
    }
    retriveAll():void{
        this.courseService.retrieveAll().subscribe({
            next: courses =>{
                this._courses=courses;
                this._filteredCourses=this._courses;
            },
            error: err =>console.log('Error',err) 
        })
        
    }

    deleteById(courseId:number):void{
        this.courseService.deleteById(courseId).subscribe({
            next:()=> {
                console.log("dele with success");
                this.retriveAll();
            },
            error:err=>console.log('Error',err)
        })
    }

    set filter(value:string){
        this.filterBy=value;
        this._filteredCourses=this._courses.filter((course: Course)=> course.name.toLocaleLowerCase().indexOf(this.filterBy.toLocaleLowerCase())> -1);
        
    }

    get filter(){
        return this.filterBy;
    }

}