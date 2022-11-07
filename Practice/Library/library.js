const url = "http://localhost:8080";

document.getElementById("getBooksButton").onclick = getBooks; // This button will GET  all books.
document.getElementById("submitBookButton").onclick = postBooks;



// This function is an async function which uses a fetch request to get data from our API.
// async functions return promise objects, which promise that some HTTP response will be returned.
async function getBooks(){
    // a varaible that holds the  result of a fetch request for Book data from the API
    let response = await fetch(url + "/books")



}


async function postBooks(){

    //gather the user's input from the submit book input boxes 
    let titleInput = document.getElementById("title").value;
    let authorInput = document.getElementById("author").value;

    let newBook = {
        id : 0,
        title : titleInput,
        author : authorInput,
        returnDate : 0
    }

    let response = await fetch(url + "/books",{
        method: "POST",
        body: JSON.stringify(newBook)
    });
}