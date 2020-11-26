import { Component, OnInit } from '@angular/core';
import { FormGroup,FormBuilder,Validators} from '@angular/forms';
import { ActivatedRoute, Router} from '@angular/router';
import { StudentsService } from '../AppService/studentService';

@Component({
  selector: 'app-update-students',
  templateUrl: './update-students.component.html',
  styleUrls: ['./update-students.component.css']
})

export class UpdateStudentsComponent implements OnInit {
  currentStudentInfo : any ;
  updateStudent: FormGroup;
  updatedName : string;
  updatedRollNo : number;
  updatedAge : number;
  updatedEmail : string;
  updatedDate : string;
  updatedGender: any;

  constructor( private formBldr : FormBuilder , private ss : StudentsService , private route: ActivatedRoute, private router: Router ){
    this.currentStudentInfo = this.router.getCurrentNavigation().extras.state ;
   }

  ngOnInit(): void {
    this.updateStudent = this.formBldr.group({
      updatedName : ['',Validators.required],
      updatedRollNo : ['',Validators.required],
      updatedAge : ['',Validators.required],
      updatedEmail : ['',[Validators.required,Validators.email]],
      updatedDate : ['',Validators.required],
      updatedGender: ['',Validators.required]
    });
  }

  updateStudentData(updatedStudent: any){

    this.updatedName = updatedStudent.controls.updatedName.value;
    this.updatedRollNo = updatedStudent.controls.updatedRollNo.value;
    this.updatedAge = updatedStudent.controls.updatedAge.value;
    this.updatedEmail = updatedStudent.controls.updatedEmail.value;
    this.updatedDate = updatedStudent.controls.updatedDate.value;
    this.updatedGender = updatedStudent.controls.updatedGender.value;

    let sId = this.currentStudentInfo.id;
    
    this.ss.updateData(sId,{
      name: updatedStudent.controls.updatedName.value,
      rollNo: updatedStudent.controls.updatedRollNo.value,
      age: updatedStudent.controls.updatedAge.value,
      email: updatedStudent.controls.updatedEmail.value,
      date:  updatedStudent.controls.updatedDate.value,
      isMale: updatedStudent.controls.updatedGender.value
    }).subscribe(
      result =>{
        alert("Student updated Successfully");
        this.router.navigate(['/studentDetails'])
      },
    error => {console.log("Error : "+error);}
    )
  }
}
  

  



  



