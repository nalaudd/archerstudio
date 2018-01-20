/**
 * The login service will have two methods login and log out.
 * The login method will take the loginBlock object and hit the endpoint of a rest service to
 * retreive a user object. If the user is valid it retrieve all the credentials.
 * 
 * The logout method will invalidate the user from local storage so no private information will 
 * not be accessible to the inappropriate user.
 * @author Nasir Alauddin
 */
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
