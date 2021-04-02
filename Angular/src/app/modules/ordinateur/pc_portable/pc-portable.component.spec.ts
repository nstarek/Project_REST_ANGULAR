import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PCPortableComponent } from './pc-portable.component';

describe('PCPortableComponent', () => {
  let component: PCPortableComponent;
  let fixture: ComponentFixture<PCPortableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PCPortableComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PCPortableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
