import { Component, OnInit } from '@angular/core';
import { Istudent } from "./Istudent";

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  public showTable:boolean = false;
  headers = ["Profile Photo","ID","Name","CGPA"];
  profilePhotoUrl : string = "assets/profilephoto.jpg";
  studentList: Istudent[] = [];

  student : Istudent =  {id: 111 ,name: 'Student1', cgpa: 7};

  constructor() { }

  ngOnInit(): void {
    this.studentList =[
      {id: 1 ,name: 'Paras', cgpa: 7 },
      {id: 2,name: 'Jayant', cgpa: 7 },
      {id: 3,name: 'Kaushik', cgpa: 7 }
    ]
  }

  loadAllStudents(){
    this.showTable = (this.showTable ? false: true);
  }
}


