import { Injectable } from "@angular/core";
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {book} from "./model/book";


@Injectable()

export class bookService{
    private url= 'https://localhost:44382/api/bookstore';

    httpOption={
        Headers: new HttpHeaders({'content-type': 'aplicatiob/json'})
    }
    constructor(private http:HttpClient){}

    getBook(){
        return this.http.get(this.url)
    }
}