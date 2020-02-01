import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { SpellTrackerComponent } from './spell-tracker/spell-tracker.component';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'spell-tracker', component: SpellTrackerComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
