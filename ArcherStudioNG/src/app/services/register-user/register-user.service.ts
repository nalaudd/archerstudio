import { Injectable } from '@angular/core';
import { UserCreation } from '../../models/UserCreation';
import { Http } from '@angular/http';

@Injectable()
export class RegisterUserService {
  
  constructor(private http: Http) { }

  registerUser(uc: UserCreation) {
    this.http.post('http://localhost:8085/ArcherStudioMVN/rest/create_user/register', uc).subscribe();
  }

}
