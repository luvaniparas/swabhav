import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MathObservableService {

  constructor() { }

  getSquare(num): Observable<number> {
    return new Observable((observer) => {
      if(num > 0 ) {
        observer.next(num * num);
        
        observer.complete();
        return;
      }
      observer.error(new Error("Can't square the number"));  
    })

  }
}

