function validar(){
    if(document.forms.principal.nome.value == ""){
        alert("Entre com o nome do produto.");
        document.forms.principal.nome.focus();
        return;
    }
    if(document.forms.principal.valor.value == ""){
        alert("Entre com o valor do produto.");
        document.forms.principal.valor.focus();
        return;
    }
    if(document.forms.principal.valor.value <= "0" ){
        alert("O valor não pode ser zero.");
        document.forms.principal.valor.focus();
        return;
    }
    if(isNaN(document.forms.principal.valor.value)){
        alert("O valor deve ser um número.");
        document.forms.principal.valor.focus();
        return;
    }
    document.forms.principal.submit();
}


