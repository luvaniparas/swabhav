import { Component, OnInit } from '@angular/core';
import { StudentsService } from '../AppService/studentService'
import { IStudents } from '../home/IStudents';

@Component({
  selector: 'app-students-details',
  templateUrl: './students-details.component.html',
  styleUrls: ['./students-details.component.css']
})
export class StudentsDetailsComponent implements OnInit {
  
  students : IStudents [];
  selectedId : any ;
  constructor(private ss : StudentsService) { }

  ngOnInit(): void {
  }
  
  getStudentsData(){
    console.log("Inside getStudentsData()");

    this.ss.getData().subscribe(
      result => {
        this.students = result ;
        for (let i = 0; i < this.students.length; i++) {
          this.students[i].isMale = this.students[i].isMale == true? "Female":"Male";  
        }
        console.log(this.students);
      },
      error => {console.log("Error : "+error);}
    )
  }

  deleteStudents(sid){
    console.log("Inside deleteStudents() : "+sid);

    if (confirm("Are you sure u want to delete student ?")) {

      this.ss.deleteData(sid).subscribe(
        result => {
          this.selectedId = sid ;
          console.log("Deleted Successfully : "+sid);
          location.reload();
        },error => {console.log("Error : "+error)}
      )
    } else {
        console.log("Dont delete");
    }
  }
}
