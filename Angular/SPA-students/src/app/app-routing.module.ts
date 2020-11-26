import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddStudentsComponent } from './add-students/add-students.component';
import { HomeComponent } from './home/home.component';
import { StudentsDetailsComponent } from './students-details/students-details.component';
import { UpdateStudentsComponent } from './update-students/update-students.component';

const routes: Routes = [
  {path:'home',component:HomeComponent},
  {path:'addStudent',component:AddStudentsComponent},
  {path:'studentDetails',component:StudentsDetailsComponent},
  {path:'updateStudent',component:UpdateStudentsComponent},
  {path: '', redirectTo: '/home', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

