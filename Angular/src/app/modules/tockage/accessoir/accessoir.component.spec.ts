import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AccessoirComponent } from './accessoir.component';

describe('AccessoirComponent', () => {
  let component: AccessoirComponent;
  let fixture: ComponentFixture<AccessoirComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AccessoirComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AccessoirComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
