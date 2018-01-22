/**
 * Login component will only use one method which is the login from the login service.
 * It will then store the user into the local storage to keep track of the session.
 * @author Nasir Alauddin
 */
import { Component, OnInit } from '@angular/core';
import { LoginService } from '../../services/login-service/login-service.service';
import { Login } from '../../models/Login';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username: string;
  password: string;
  loginBlock: Login;

  constructor(private loginService: LoginService, private router: Router) { }

  ngOnInit() {
    this.loginBlock = new Login();
  }

  login(){
    this.loginBlock.username = this.username;
    this.loginBlock.password = this.password;
    
    this.loginService.login(this.loginBlock).subscribe(data => {
      localStorage.setItem('currentUser', JSON.stringify(data.json()));
      this.router.navigateByUrl('#');
    })

  }

}
