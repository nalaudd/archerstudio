import { TestBed, inject } from '@angular/core/testing';

import { SearchScheduleService } from './search-schedule.service';

describe('SearchScheduleService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [SearchScheduleService]
    });
  });

  it('should be created', inject([SearchScheduleService], (service: SearchScheduleService) => {
    expect(service).toBeTruthy();
  }));
});
