import { Component, OnInit } from '@angular/core';
import { UserCreation } from '../../models/UserCreation';
import { RegisterUserService } from '../../services/register-user/register-user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-user',
  templateUrl: './create-user.component.html',
  styleUrls: ['./create-user.component.css']
})
export class CreateUserComponent implements OnInit {
  
  uc: UserCreation;
  password: string;
  birthday: string;
  month: number;
  day: number;
  year: number;

  constructor(private rs: RegisterUserService, private router: Router) { }

  ngOnInit() {
    this.uc = new UserCreation();
  }

  register(){
    if (this.uc.password !== this.password){
      alert("Passwords do not match!");
    } else {
      this.birthday = this.year + '-' + this.month + '-' + this.day;
      this.uc.birthday = this.birthday;
      this.rs.registerUser(this.uc);
      this.router.navigateByUrl('/login');
    }
    
  }

}
