import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from "@angular/forms";

import { AppComponent } from './app.component';
import { PipesComponent } from './pipes/pipes.component';
import { StudentComponent } from './student/student.component';
import { TwoWayBindingComponent } from './two-way-binding/two-way-binding.component';
import { SnakCasePipe } from './snak-case.pipe';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './parent/child/child.component';
import { MyParentComponent } from './my-parent/my-parent.component';
import { MyChildComponent } from './my-parent/my-child/my-child.component';
import { StarRatingsComponent } from './star-ratings/star-ratings.component';
import { StarsComponent } from './star-ratings/stars/stars.component';

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
    StarRatingsComponent,
    StarsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
