import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  count =0;


  pessoas=[

  {
    nome:"Vinicius",
    sobrenome:"Ferrreira"

  },

  {
    nome:"Adriana",
    sobrenome:"Ferrreira"
  },
  {
    nome:"Haroldo",
    sobrenome:"Vieira"
  }
  ]

  text=''

  ngOnInit(): void {
      let intervalo = setInterval(()=>{
        
        this.count++;
        if(this.count===10){
          clearInterval(intervalo);
        }
      },1000)
  }


}
