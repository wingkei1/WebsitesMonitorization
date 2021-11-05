async function getUserWebs() {
    const response = await fetch("http://localhost:8080/WebsitesMonitorization/web/webs");
    const myJson = await response.json(); //extract JSON from the http response
    return myJson;
    // do something with myJson
}
getUserWebs().then((data) => {
    var tbody = document.getElementById("body"); // set this to your table
    data.forEach(function (items) {
        var row = document.createElement("tr");
        var cell = document.createElement("td");
        cell.textContent = items.nombreWeb;
        row.appendChild(cell);
        var cell = document.createElement("td");
        cell.textContent = items.url;
        row.appendChild(cell);
        var cell = document.createElement("td");
        cell.textContent = items.update;
        row.appendChild(cell);
        tbody.appendChild(row);
    });
});
