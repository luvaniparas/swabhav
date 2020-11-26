import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { StudentsService } from '../AppService/studentService'

@Component({
  selector: 'app-add-students',
  templateUrl: './add-students.component.html',
  styleUrls: ['./add-students.component.css']
})
export class AddStudentsComponent implements OnInit {

  constructor( private ss : StudentsService , private route : Router) { }

  ngOnInit(): void {
  }

  addStudent(addNewStudent){
    console.log(addNewStudent.form.controls.name.value);

    this.ss.addData({
      name: addNewStudent.form.controls.name.value,
      rollNo: addNewStudent.form.controls.rollNo.value,
      age: addNewStudent.form.controls.age.value,
      email: addNewStudent.form.controls.email.value,
      date: addNewStudent.form.controls.date.value,
      isMale: addNewStudent.form.controls.gender.value
    }).subscribe(
        result =>{
          console.log("Added Successfully ");
          this.route.navigate(['/studentDetails'])
        },
      error => {console.log("Error : "+error);}
    )
    } 
}
