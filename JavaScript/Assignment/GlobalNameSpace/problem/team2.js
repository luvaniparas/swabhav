function customer(fName,mName,lName){
    this.fName = fName;
    this.mName = mName;
    this.lName = lName ;
 
    this.getfName = function(){
       return `${this.fName} ${this.mName} ${this.lName}` ;
       }
 }
 