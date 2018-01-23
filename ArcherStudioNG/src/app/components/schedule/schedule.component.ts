import { Component, OnInit } from '@angular/core';
import { User } from '../../models/User';
import { SaveService } from '../../services/save/save.service';

@Component({
  selector: 'app-schedule',
  templateUrl: './schedule.component.html',
  styleUrls: ['./schedule.component.css']
})
export class ScheduleComponent implements OnInit {

  editable: boolean;
  user: User;

  sunstart: string;
  monstart: string;
  tuestart: string;
  wedstart: string;
  thustart: string;
  fristart: string;
  satstart: string;

  sunend: string;
  monend: string;
  tueend: string;
  wedend: string;
  thuend: string;
  friend: string;
  satend: string;

  csunstart: string;
  cmonstart: string;
  ctuestart: string;
  cwedstart: string;
  cthustart: string;
  cfristart: string;
  csatstart: string;

  csunend: string;
  cmonend: string;
  ctueend: string;
  cwedend: string;
  cthuend: string;
  cfriend: string;
  csatend: string;

  constructor(private saveService: SaveService) { }

  ngOnInit() {
    this.editable = false;
    this.user = JSON.parse(localStorage.getItem('currentUser'));
  }

  edit(){
    if (this.editable){
      this.editable = false;
    } else {
      this.editable = true;
    }
  }

  save(){
    this.user.ws.sun = this.sunstart + ' - ' + this.sunend;
    this.user.ws.mon = this.monstart + ' - ' + this.monend;
    this.user.ws.tue = this.tuestart + ' - ' + this.tueend;
    this.user.ws.wed = this.wedstart + ' - ' + this.wedend;
    this.user.ws.thu = this.thustart + ' - ' + this.thuend;
    this.user.ws.fri = this.fristart + ' - ' + this.friend;
    this.user.ws.sat = this.satstart + ' - ' + this.satend;
    
    this.user.cs.sun = this.csunstart + ' - ' + this.csunend;
    this.user.cs.mon = this.cmonstart + ' - ' + this.cmonend;
    this.user.cs.tue = this.ctuestart + ' - ' + this.ctueend;
    this.user.cs.wed = this.cwedstart + ' - ' + this.cwedend;
    this.user.cs.thu = this.cthustart + ' - ' + this.cthuend;
    this.user.cs.fri = this.cfristart + ' - ' + this.cfriend;
    this.user.cs.sat = this.csatstart + ' - ' + this.csatend;

    this.saveService.updateInfo(this.user);
    localStorage.setItem('currentUser', JSON.stringify(this.user));
    this.edit();
  }

}
