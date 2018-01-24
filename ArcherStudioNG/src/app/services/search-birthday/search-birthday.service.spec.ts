import { TestBed, inject } from '@angular/core/testing';

import { SearchBirthdayService } from './search-birthday.service';

describe('SearchBirthdayService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [SearchBirthdayService]
    });
  });

  it('should be created', inject([SearchBirthdayService], (service: SearchBirthdayService) => {
    expect(service).toBeTruthy();
  }));
});
