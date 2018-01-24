import { Injectable } from '@angular/core';
import { Http } from '@angular/http';

@Injectable()
export class SearchBirthdayService {

  constructor(private http: Http) { }

  searchById(id: number) {
    return this.http.get('http://localhost:8085/ArcherStudioMVN/rest/UserInfo/Person/' + id);
  }

  searchByName(fname: string, lname: string) {
    return this.http.get('http://localhost:8085/ArcherStudioMVN/rest/UserInfo/Person/' + lname + '/' + fname);
  }
  
}
