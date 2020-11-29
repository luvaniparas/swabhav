import { Pipe, PipeTransform } from '@angular/core';
import { IProducts } from './IProducts';

@Pipe({
  name: 'searchFilter'
})
export class SearchFilterPipe implements PipeTransform {

  transform(product: IProducts,searchValue:string): string {
    return 
    // if(searchValue != ""){
    //   return this.products.filter(product => 
    //     product.productName.toLocaleLowerCase().includes(this.searchValue.toLocaleLowerCase())
    //   )
    // }
  }

}
