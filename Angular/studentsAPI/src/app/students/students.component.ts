import { Component, OnInit } from '@angular/core';
import { IStudents } from './IStudents';
import { GetStudentService } from '../appServices/get-student.service'

@Component({
  selector: 'app-students',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.css']
})
export class StudentsComponent implements OnInit {
  showTable : boolean = false;
  showForm : boolean = false;
  students : IStudents [];
  
  constructor(private ss : GetStudentService) { }

  ngOnInit(): void {

  }

  getStudentsData(){
    this.showTable = (this.showTable ? false : true);
    console.log("Inside getStudentsData()");

    this.ss.getData().subscribe(
      
      result => {
        console.log("Result : "+JSON.stringify(result)+" type : "+typeof(result));
        this.students = result ;
        for (let i = 0; i < this.students.length; i++) {
          this.students[i].isMale = this.students[i].isMale == true? "Male":"Female";  
        }
        console.log(this.students);
      },
      error => {console.log("Error : "+error);}
    )
  }

  addStudentsData(){
    console.log("Inside addStudentsData()");
    this.showForm = true ;
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
          console.log("Added ");
          this.showForm = false ;
          this.showTable = true;
        },
      error => {console.log("Error : "+error);}
    )

    }   
  }

