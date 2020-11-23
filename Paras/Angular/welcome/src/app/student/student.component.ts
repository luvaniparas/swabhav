import { Component, OnInit } from '@angular/core';
import { IStudent } from './IStudent';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  showTable : boolean = false ;
  student : IStudent = {rollNumber : 1 , name : "Student1" , cgpa : 7}
  studentsList : IStudent[];
  profilePhoto : string ="assets/pPhoto.png";
  constructor() { }

  ngOnInit(): void {

    this.studentsList = [
      {rollNumber : 101 , name : "Paras" , cgpa : 7},
      {rollNumber : 102 , name : "Jayant" , cgpa : 7},
      {rollNumber : 103 , name : "Kaushik" , cgpa : 7},
      {rollNumber : 104 , name : "Shailesh" , cgpa : 7}
    ]
  }

  loadAllStudents() {
    console.log("Inside loadAllStudents()");
    this.showTable = (this.showTable ? false : true);  
  }

}
