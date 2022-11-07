const url = "http://localhost:8080";

document.getElementById("getTicketsButton").onclick = getTicket;

async function getTicket(){
    let response = await fetch(url + "/tickets")

    console.log(response);

    let data = await response.json();

    console.log(data);

    if(response.status === 200){
        for(let ticket of data){
            let row = document.createElement("tr");

            //create a table data cell (td) for each of the book's fields
            let cell1 = document.createElement("td");
            //fill the cell with the appropriate data
            cell1.innerHTML = ticket.id;
            //add the new cell to the row
            row.appendChild(cell1)

            let cell2 = document.createElement("td");
            cell2.innerHTML = ticket.amount;
            row.appendChild(cell2)

            let cell3 = document.createElement("td");
            cell3.innerHTML = ticket.descriptions;
            row.appendChild(cell3)

            let cell4 = document.createElement("td");
            cell4.innerHTML = ticket.ukey;
            row.appendChild(cell4)

            let cell5 = document.createElement("td");
            cell5.innerHTML = ticket.status;
            row.appendChild(cell5)

            let cell6 = document.createElement("td");
            cell6.innerHTML = ticket.rtypes;
            row.appendChild(cell6)

            //finally, we need to actually APPEND THE ROW to the table body
            //a new row will be appended FOR EVERY BOOK that got returned in the fetch
            document.getElementById("ticketsBody").appendChild(row);
    }
    }

}