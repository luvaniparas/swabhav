import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-forms',
  templateUrl: './forms.component.html',
  styleUrls: ['./forms.component.css']
})
export class FormsComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  addStudentData(addStudent){
    console.log(addStudent.value);
    //console.log("Name : "+addStudent.controls.name.value);
    
  }

}
