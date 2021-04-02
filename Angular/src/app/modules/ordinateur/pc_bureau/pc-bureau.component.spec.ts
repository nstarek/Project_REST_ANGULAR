import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PCBureauComponent } from './pc-bureau.component';

describe('PCBureauComponent', () => {
  let component: PCBureauComponent;
  let fixture: ComponentFixture<PCBureauComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PCBureauComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PCBureauComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
