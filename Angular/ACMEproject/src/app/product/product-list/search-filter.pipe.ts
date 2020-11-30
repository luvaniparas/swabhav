import { Pipe, PipeTransform } from '@angular/core';
import { IProduct } from './IProduct';

@Pipe({
  name: 'searchFilter'
})
export class SearchFilterPipe implements PipeTransform {

  transform(product: IProduct[],searchValue:string): any {
    searchValue = searchValue.toLocaleLowerCase();

    return product.filter(product => {
      return product.productName.toLocaleLowerCase().includes(searchValue);
    });
  }
}


