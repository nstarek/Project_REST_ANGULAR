import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AccessoirTelephoneComponent } from './accessoir-telephone.component';

describe('AccessoirTelephoneComponent', () => {
  let component: AccessoirTelephoneComponent;
  let fixture: ComponentFixture<AccessoirTelephoneComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AccessoirTelephoneComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AccessoirTelephoneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
