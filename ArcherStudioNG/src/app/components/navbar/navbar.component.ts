/**
 * The navbar is primarily for moving around the page but will have one method to logout
 * a user in a session.
 * @author Nasir Alauddin
 */
import { Component, OnInit } from '@angular/core';
import { LoginService } from '../../services/login-service/login-service.service';
import { User } from '../../models/User';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  
  user: User;

  constructor(private loginService: LoginService, private router: Router) { }

  ngOnInit() {
    this.user = JSON.parse(localStorage.getItem('currentUser'));
    console.log(this.user);
  }

  logout(){
    this.loginService.logout();
    this.user = JSON.parse(localStorage.getItem('currentUser'));
    this.router.navigateByUrl('#');
  }

}
