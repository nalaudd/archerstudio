import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { User } from '../../models/User';
import { Login } from '../../models/Login';

@Injectable()
export class LoginService {

  user: User;

  constructor(private http: Http) { }

  login(loginBlock: Login) {
    return this.http.post('http://localhost:8085/ArcherStudioMVN/rest/login/user', loginBlock);
  }

  logout(){
    localStorage.setItem('currentUser', null);
  }

}
