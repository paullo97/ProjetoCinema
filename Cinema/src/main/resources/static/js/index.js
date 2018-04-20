$(document).ready(function() {
    //Buscar sala por nome do filme
    $("#btnBuscarSala").click(function() {
        var nomeFilme = $("#nomeFilme").val();
        var url = "/salaFilme/"+nomeFilme+"";

        $(".movie-feed").empty();
        //queryString
        $.getJSON(url, function(data) {
        	console.log(data);
            var itens = [];
            $.each(data, function(i) {
                itens.push(
                    "<div class='card'><div class='card-body'><p class='h6'>Sala "+this.numeroSala+"</p></div></div>"
                );
            });
            $(".movie-feed").append(itens);
        });
    });

    /*$("#roomfeed").load(function() {
        url = "/salas";
    
        $.getJSON(url, function(data) {
            var itens = [];
            
            $.each(data, function(i) {
                itens.push(
                    "<div class='card'><div class='card-body'><div class='left'><h3>Sala "+this.numeroSala+"</h3></div><hr class='my-01'><div class='left'><div class='between'><div class='between_'><h6>Nome do filme</h6></div><div class='between_'><h6>Horario</h6></div> </div><hr class='my-00'><div class='between'><div class='between_'><p>"+this.filme.nomeFilme+"</p></div><div class='between_'><p>"+this.filme.horario+"h</p></div></div></div></div></div>"
                );
            });
            $(".room-feed").append(itens);
        });
    });*/
});

function cadastrarUsuario() {
    var iptNome = $("#iptNome").val();
    var iptCpf = $("#iptCpf").val();
    var iptNumSala = $("#iptNumSala").val();
    var iptLetra = $("#iptLetra").val();
    var iptNumero = $("#iptNumero").val();
    var url = "/usuario/addUsuario/"+iptNome+"/"+iptCpf+"/"+iptNumSala+"/"+iptLetra+"/"+iptNumero+"";

    console.log(iptNome);
    console.log(iptCpf);
    console.log(iptNumSala);
    console.log(iptLetra);
    console.log(iptNumero);
    alert("Cadastrado!");

    $.getJSON(url, function(data) {});

    $(location).attr('href', '../index.html');
}

function cadastrarFilme() {
    var iptNomeFilme = $("#iptNomeFilme").val();
    var iptNumeroSala = $("#iptNumeroSala").val();
    var iptDescricao = $("#iptDescricao").val();
    var iptAno = $("#iptAno").val();
    var iptHorario = $("#iptHorario").val();
    var url = "/sala/addSala/"+iptNumeroSala+"/"+iptNomeFilme+"/"+iptAno+"/"+iptDescricao+"/"+iptHorario+"";

    alert("Cadastrado!");

    $.getJSON(url, function(data) {});

    $(location).attr('href', '../index.html');
}

function excluirUsuario() {

}

function getAllInfo() {
    getAllRooms();
    getAllUsers();
}

function getAllRooms() {
    url = "/salas";
    
    $.getJSON(url, function(data) {
        var itens = [];
        
        $.each(data, function(i) {
            itens.push(
                "<div class='card'><div class='card-body'><div class='left'><h3>Sala "+this.numeroSala+"</h3></div><hr class='my-01'><div class='left'><div class='between'><div class='between_'><h6>Nome do filme</h6></div><div class='between_'><h6>Horario</h6></div> </div><hr class='my-00'><div class='between'><div class='between_'><p>"+this.filme.nomeFilme+"</p></div><div class='between_'><p>"+this.filme.horario+"h</p></div></div></div></div></div>"
            );
        });
        $(".room-feed").append(itens);
    });
}

function getAllUsers() {
    url = "/usuarios";

    $.getJSON(url, function(data) {
        var itens = [];

        $.each(data, function(i) {
            itens.push(
                "<div class='card'><div class='card-body'><div class='between'><h5>Nome</h5><h5>CPF</h5></div><hr class='my-00'><div class='between'><p>"+this.nome+"</p><p>"+this.cpf+"</p></div></div></div>"
            );
        });
        $(".user-feed").append(itens);
    });
}

function teste() {
    var teste = $("#cpf").val();

    console.log(teste)
}