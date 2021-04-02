import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisqueDureComponent } from './disque-dure.component';

describe('DisqueDureComponent', () => {
  let component: DisqueDureComponent;
  let fixture: ComponentFixture<DisqueDureComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DisqueDureComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DisqueDureComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
