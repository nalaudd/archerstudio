import { Component, OnInit } from '@angular/core';
import { SearchBirthdayService } from '../../services/search-birthday/search-birthday.service';
import { Person } from '../../models/Person';

@Component({
  selector: 'app-birthday',
  templateUrl: './birthday.component.html',
  styleUrls: ['./birthday.component.css']
})
export class BirthdayComponent implements OnInit {

  person: Person;
  fname: string;
  lname: string;
  userId: number;

  constructor(private birthdayService: SearchBirthdayService) { }

  ngOnInit() {
    this.person = new Person();
  }

  searchById() {
    this.birthdayService.searchById(this.userId).subscribe( data => {
      if (data !== null){
        this.person = data.json();
      }
    });
  }

  searchByName() {
    this.birthdayService.searchByName(this.fname, this.lname).subscribe( data => {
      if (data !== null){
        this.person = data.json();
      }
    });
  }

}
