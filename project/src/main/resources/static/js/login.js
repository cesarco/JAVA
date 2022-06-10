// Call the dataTables jQuery plugin
$(document).ready(function() {
    // on ready
});

async function iniciarSession() {

    let datos = {};

    datos.email =  document.getElementById('txtEmail').value;
    datos.password=  document.getElementById('txtPassword').value;

    const rawResponse = await fetch('api/login', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });
    const respuesta = await rawResponse.text();
if(respuesta != 'FAIL'){
    localStorage.token = respuesta;
    localStorage.email = datos.email;
    window.location.href = 'usuarios.html'
}else {
    alert("las credenciales son incorrectas. Por favor intente nuevamente");
}
}