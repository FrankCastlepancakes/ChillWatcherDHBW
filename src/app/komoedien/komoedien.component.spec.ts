import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { KomoedienComponent } from './komoedien.component';

describe('KomoedienComponent', () => {
  let component: KomoedienComponent;
  let fixture: ComponentFixture<KomoedienComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ KomoedienComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(KomoedienComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
