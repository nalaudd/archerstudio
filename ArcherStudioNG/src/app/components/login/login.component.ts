import { Component, OnInit } from '@angular/core';
import { LoginService } from '../../services/login-service/login-service.service';
import { Login } from '../../models/Login';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username: string;
  password: string;
  loginBlock: Login;

  constructor(private loginService: LoginService) { }

  ngOnInit() {
    this.loginBlock = new Login();
  }

  login(){
    this.loginBlock.username = this.username;
    this.loginBlock.password = this.password;
    console.log('username: ' + this.username);
    console.log('password: ' + this.password);
    this.loginService.login(this.loginBlock).subscribe(data => {
      console.log(JSON.stringify(data.json()));
      localStorage.setItem('currentUser', JSON.stringify(data.json()))
    })
    console.log();
  }

}
