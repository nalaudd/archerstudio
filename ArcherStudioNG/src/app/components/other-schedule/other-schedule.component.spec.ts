import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OtherScheduleComponent } from './other-schedule.component';

describe('OtherScheduleComponent', () => {
  let component: OtherScheduleComponent;
  let fixture: ComponentFixture<OtherScheduleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OtherScheduleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OtherScheduleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
