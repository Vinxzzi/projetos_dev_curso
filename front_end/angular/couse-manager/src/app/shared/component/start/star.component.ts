import { Component, Input, OnChanges } from "@angular/core";

@Component({
    selector:'app-star',
    template:'./star.component.html'
})

export class StarComponent implements OnChanges{
    @Input()
    rating:number=0;

    starwidth !:number;

    ngOnChanges() :void{
        this.starwidth=this.rating*94/5;

    }

}