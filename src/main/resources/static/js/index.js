$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/sedes/agrupacion"
    }).then(function(data) {
        $('.sedes-valor').append(data.valor);
        $('.sedes-veces').append(data.veces);
        $('.sedes-idPais').append(data.idPais);
        $('.sedes-descripcion').append(data.descripcion);
        $('.sedes-nombrePais').append(data.nombrePais);
        $('.sedes-nombreCiudad').append(data.nombreCiudad);
        $('.sedes-idCiudad').append(data.idCiudad);
    });
});