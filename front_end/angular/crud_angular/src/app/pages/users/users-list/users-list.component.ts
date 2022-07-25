import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/models/user';

@Component({
  selector: 'app-users-list',
  templateUrl: './users-list.component.html',
  styleUrls: ['./users-list.component.css']
})
export class UsersListComponent implements OnInit {
  users:Array<User>=[];

 // constructor(private userService:UserService) { }

  ngOnInit(): void {
  }

  getUsers(){
    
  }

}
