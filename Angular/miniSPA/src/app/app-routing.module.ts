import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { CareerComponent } from './career/career.component';
import { DepartmentComponent } from './department/department.component';
import { HomeComponent } from './home/home.component';
import { ServiceComponent } from './service/service.component';

const routes: Routes = [
  {path:'home',component:HomeComponent},
  {path:'service',component:ServiceComponent},
  {path:'career',component:CareerComponent},
  {path:'about',component:AboutComponent},
  {path:'department/:deptId',component:DepartmentComponent},
  {path: '', redirectTo: '/home', pathMatch: 'full' }
  //{ path: '**', component: NotfoundComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
