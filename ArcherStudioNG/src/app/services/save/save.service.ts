import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { User } from '../../models/User';

@Injectable()
export class SaveService {

  constructor(private http: Http) { }

  updateInfo(user: User){
    this.http.post('http://localhost:8085/ArcherStudioMVN/rest/User/update', user).subscribe();
  }
}
