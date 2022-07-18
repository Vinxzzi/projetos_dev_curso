import { NgModule } from "@angular/core";
import {  RouterModule } from "@angular/router";
import { NavbarComponent } from "./component/nav-bar/nav-bar.component";
import { Erro404Component } from "./component/404/404.component";

@NgModule({
    declarations:[
        NavbarComponent,
        Erro404Component
    ],

    imports:[
        RouterModule.forChild([
            {
            
                    path: '**', component:Erro404Component
                
            }
        ])
    ],
    exports:[
        NavbarComponent

    ]
})

export class CoreModule{


}