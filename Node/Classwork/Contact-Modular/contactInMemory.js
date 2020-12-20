class ContactMernRepo{

    contacts = [
        { name: "Paras", id: 1 },
        { name: "Jayant", id: 2 },
        { name: "Kaushik", id: 3},
        { name: "Shailesh", id: 4},
    ]
    
    get contact(){
        return new Promise((resolve,reject) => {
            return this.contacts;
        });
    }

    addContact(contact){
        return new Promise((resolve,reject) => {

            if(contact != null){
                this.Contacts.push(contact);           
            }
            
        });
    }

    getContactByIdRepo(id){
        return new Promise((resolve,reject) => {
            if(id != null){
                let contactId = this.contacts.find( x => x.id == id);
                resolve(contactId);
            }
        });    
    }


}

module.exports = ContactMernRepo;