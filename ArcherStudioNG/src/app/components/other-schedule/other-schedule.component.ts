import { Component, OnInit } from '@angular/core';
import { SearchScheduleService } from '../../services/search-schedule/search-schedule.service';
import { Schedule } from '../../models/Schedule';
import { CustomSchedule } from '../../models/CustomSchedule';
import { WorkSchedule } from '../../models/WorkSchedule';

@Component({
  selector: 'app-other-schedule',
  templateUrl: './other-schedule.component.html',
  styleUrls: ['./other-schedule.component.css']
})
export class OtherScheduleComponent implements OnInit {

  userId: number;
  schedule: Schedule;

  constructor(private scheduleSearch: SearchScheduleService) { }

  ngOnInit() {
    this.schedule = new Schedule();
    this.schedule.ws = new WorkSchedule();
    this.schedule.cs = new CustomSchedule();
  }

  search(){
    this.scheduleSearch.search(this.userId).subscribe( data =>{
      this.schedule = data.json();
    });
  }

}
