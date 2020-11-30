import { Pipe, PipeTransform } from '@angular/core';
import { IProduct } from './IProduct';

@Pipe({
  name: 'searchFilter'
})
export class SearchFilterPipe implements PipeTransform {

  transform(product: IProduct,searchValue:string): string {
    return 
    // if(searchValue != ""){
    //   return this.products.filter(product => 
    //     product.productName.toLocaleLowerCase().includes(this.searchValue.toLocaleLowerCase())
    //   )
    // }
  }

}
