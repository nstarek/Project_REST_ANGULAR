import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PCAccessoireComponent } from './pc-accessoire.component';

describe('PCAccessoireComponent', () => {
  let component: PCAccessoireComponent;
  let fixture: ComponentFixture<PCAccessoireComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PCAccessoireComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PCAccessoireComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
