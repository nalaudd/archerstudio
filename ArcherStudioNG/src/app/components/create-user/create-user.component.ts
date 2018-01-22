import { Component, OnInit } from '@angular/core';
import { UserCreation } from '../../models/UserCreation';

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

  constructor() { }

  ngOnInit() {
    this.uc = new UserCreation();
  }

  register(){
    if (this.uc.password !== this.password){
      alert("Passwords do not match!");
    } else {
      this.birthday = this.year + '-' + this.month + '-' + this.day;
      this.uc.birthday = this.birthday;
      console.log(this.uc);
    }
    
  }

}
