import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  apiUrl='https://sheet.best/api/sheets/89ac3a83-bc84-485d-8408-d181ca2e12f0'
  constructor(private httpClient: HttpClient) { }
  
  //C.R.U.D - CREATE, READ, UPDATE, DELETE
  //retorna a lista de usuarios

  getUsers():Observable<User[]>{
    return this.httpClient.get<User[]>(this.apiUrl);
  }


}
