import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { WelcomeComponent } from './welcome/welcome.component';
import { StudentComponent } from './student/student.component'
import { TwoWayBindingComponent } from './two-way-binding/two-way-binding.component';
import { SnakeCasePipe } from './snake-case.pipe';
import { from } from 'rxjs';
import { BlueBallGameComponent } from './blue-ball-game/blue-ball-game.component';

@NgModule({
  declarations: [
    WelcomeComponent,
    StudentComponent,
    TwoWayBindingComponent,
    SnakeCasePipe,
    BlueBallGameComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [WelcomeComponent,StudentComponent,TwoWayBindingComponent]
})
export class AppModule { }
