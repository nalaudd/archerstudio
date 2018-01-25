import { Injectable } from '@angular/core';
import { Http } from '@angular/http';

@Injectable()
export class SearchScheduleService {

  constructor(private http: Http) { }

  search(userId: number){
    return this.http.get('http://localhost:8085/ArcherStudioMVN/rest/UserInfo/Schedule/' + userId);
  }

}
