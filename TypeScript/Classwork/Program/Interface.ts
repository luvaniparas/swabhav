interface iStudent{
    id:number
    name:String
    cgpa:number
}

function printInfo(Students : iStudent[]){
    for(let s of Students){
        console.log(s);
    }
}
printInfo([
    {id:1,name:"paras",cgpa:7},
    {id:2,name:"jayant",cgpa:7},
    {id:3,name:"kaushik",cgpa:7},
    {id:4,name:"shailesh",cgpa:7},
])