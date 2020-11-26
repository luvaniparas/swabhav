import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClient } from "@angular/common/http";

import { WelcomeComponent } from './welcome/welcome.component';
import { StudentComponent } from './student/student.component'
import { TwoWayBindingComponent } from './two-way-binding/two-way-binding.component';
import { SnakeCasePipe } from './snake-case.pipe';
import { BlueBallGameComponent } from './blue-ball-game/blue-ball-game.component';
import { ParentComponent } from './parent/parent.component';
import { ToggleComponent } from './parent/toggle/toggle.component';
import { StarRatingComponent } from './star-rating/star-rating.component';
import { StarComponent } from './star-rating/star/star.component';
import { ObservableComponent } from './observable/observable.component';


@NgModule({
  declarations: [
    WelcomeComponent,
    StudentComponent,
    TwoWayBindingComponent,
    SnakeCasePipe,
    BlueBallGameComponent,
    ParentComponent,
    ToggleComponent,
    StarRatingComponent,
    StarComponent,
    ObservableComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClient
  ],
  providers: [],
  bootstrap: [WelcomeComponent,StudentComponent,TwoWayBindingComponent]
})
export class AppModule { }
