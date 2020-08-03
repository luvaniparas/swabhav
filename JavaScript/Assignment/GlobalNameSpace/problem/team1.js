function customer(fName,lName){
   this.fName = fName;
   this.lName = lName ;

   this.getfName = function(){
      return this.fName + " " + this.lName ;
      }
}
