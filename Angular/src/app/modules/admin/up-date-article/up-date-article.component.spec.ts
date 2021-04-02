import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpDateArticleComponent } from './up-date-article.component';

describe('UpDateArticleComponent', () => {
  let component: UpDateArticleComponent;
  let fixture: ComponentFixture<UpDateArticleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpDateArticleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UpDateArticleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
