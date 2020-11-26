import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, ParamMap } from '@angular/router';

@Component({
  selector: 'app-department',
  templateUrl: './department.component.html',
  styleUrls: ['./department.component.css']
})
export class DepartmentComponent implements OnInit {
  
  deptId: number;
  constructor(private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe((params: ParamMap) => {
			this.deptId = parseInt(params.get('deptId'));
			console.log('deptId', this.deptId);
			if (isNaN(this.deptId)) {
				console.log('sending back');
				this.router.navigate(['/notfound']);
			}
		});
  }

}
