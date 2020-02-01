import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SpellTrackerComponent } from './spell-tracker.component';

describe('SpellTrackerComponent', () => {
  let component: SpellTrackerComponent;
  let fixture: ComponentFixture<SpellTrackerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SpellTrackerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SpellTrackerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
