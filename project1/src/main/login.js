const url = "http://localhost:8080";


document.getElementById("loginButton").onclick = postlogin;

async function postlogin(){

    let usernameInput = document.getElementById("username").value;
    let passwordInput = document.getElementById("password").value;

    let login = {
        username: usernameInput,
        password: passwordInput
    }

    // Holds the variable result of the fetch request for Login data from API
    let response = await fetch(url + "/login",{
        method: "POST",
        body: JSON.stringify(login)
    });



    
    console.log(response);

    if(response.status === 202){
        alert("You have successfully logged in as " + usernameInput);
        location.href = "./index.html";
    }
    else{
        alert("You have entered an incorrect username or password!");
    }

}