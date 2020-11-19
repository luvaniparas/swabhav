export class Customer {
    constructor(private _id,private _name){
    }

    get Id(){
        return this._id ; 
    }

    get Name(){
        return this._name ; 
    }

    set Id(id){
        this._id = id ;
    }

    set Name(name){
        this._name = name ;
    }
}
