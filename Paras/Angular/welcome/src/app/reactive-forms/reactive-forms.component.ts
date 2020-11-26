import { Component, OnInit } from '@angular/core';
import { FormGroup,FormControl,FormBuilder,Validators} from '@angular/forms'

@Component({
  selector: 'app-reactive-forms',
  templateUrl: './reactive-forms.component.html',
  styleUrls: ['./reactive-forms.component.css']
})
export class ReactiveFormsComponent implements OnInit {

  updatedStudent : FormGroup ; 
  name: string;
  rollNo: number;
  age: number;
  email: string;
  date: string;
  gender: any;

  constructor(private formBldr : FormBuilder) { 

    this.updatedStudent = formBldr.group({
      name: ['',Validators.required],
      rollNo: ['',Validators.required],
      age: ['',Validators.required],
      email: ['',Validators.required,Validators.email],
      date: ['',Validators.required],
      gender: ['',Validators.required]
    });

  }

  ngOnInit(): void {
  } 

  updateStudentData(updatedStudent: any){
    console.log(updatedStudent.controls);
    this.name = updatedStudent.controls.name.value;
    this.rollNo = updatedStudent.controls.rollNo.value;
    this.age = updatedStudent.controls.age.value;
    this.email = updatedStudent.controls.email.value;
    this.date = updatedStudent.controls.date.value;
    this.gender = updatedStudent.controls.gender.value;

    console.log("Name : "+this.name+" Roll Number : "+this.rollNo+" Age : "+this.age+" Email : "+this.email+" Date : "+this.date+" Gender : "+this.gender);
  }

}
