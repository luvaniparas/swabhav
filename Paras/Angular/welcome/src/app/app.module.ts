import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { PipesComponent } from './pipes/pipes.component';
import { StudentComponent } from './student/student.component';
import { TwoWayBindingComponent } from './two-way-binding/two-way-binding.component';
import { SnakCasePipe } from './snak-case.pipe';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './parent/child/child.component';
import { MyParentComponent } from './my-parent/my-parent.component';
import { MyChildComponent } from './my-parent/my-child/my-child.component';
import { FormsComponent } from './forms/forms.component';
import { ReactiveFormsComponent } from './reactive-forms/reactive-forms.component';


@NgModule({
  declarations: [
    AppComponent,
    PipesComponent,
    StudentComponent,
    TwoWayBindingComponent,
    SnakCasePipe,
    ParentComponent,
    ChildComponent,
    MyParentComponent,
    MyChildComponent,
    FormsComponent,
    ReactiveFormsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
