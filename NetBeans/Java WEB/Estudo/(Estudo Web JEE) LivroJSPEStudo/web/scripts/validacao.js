function validar(){
    var nome = document.forms.principal.nome;
    var senha = document.forms.principal.senha;
    var nomee = document.forms.principal.nomeerro;
    var senhae = document.forms.principal.senhaerro;

    limpa(nome,nomee);
    limpa(senha,senhae);

    if(nome.value == ""){
        alertando(nome,nomee,"Nome de Usuário não pode estar vazio.");
        return;
    }
    if (senha.value == ""){
        alertando(senha,senhae,"Senha não pode estar vazia.");
        return;
    }
    if(senha.value.length <= 3){
        alertando(senha,senhae,"Senha deve ter mais de 3 caracteres.");
        return;
    }
    document.forms.principal.submit();
}
function validarCompras(){
    var item1 = document.forms.principal.item1;
    var qtde1 = document.forms.principal.qtde1;
    var item2 = document.forms.principal.item2;
    var qtde2 = document.forms.principal.qtde2;
    var item3 = document.forms.principal.item3;
    var qtde3 = document.forms.principal.qtde3;
    var campoErro = document.forms.principal.informe;

    if(!checkCompras (item1,qtde1,campoErro))return;
    if(!checkCompras (item2,qtde2,campoErro))return;
    if(!checkCompras (item3,qtde3,campoErro))return;
    document.forms.principal.submit();

}
function checkCompras(item,qtde,campoErro){
    limpa(qtde,campoErro);
    if (item.checked){
        if(qtde.value == ""){
            alertando(qtde,campoErro,"O campo não pode estar vazio.");
            return false;
        }
        if(isNaN(qtde.value)){
            alertando(qtde,campoErro,"A quantidade dev ser um número.");
            return false;
        }
        return true;
    }
    return true;
}
function selectedCheckQtde(check,caixa){
    if(check.checked){
        caixa.focus();
    }else{
        caixa.value="";
    }
}
function alertando(campo,campoerro,msgerro){
    campoerro.type='text';
    campoerro.value=msgerro;
    campo.focus();
    campo.value = "";
    campo.className = "campoErroActive";
}
function limpa(campo,campoerro){
    campoerro.type='hidden';
    campoerro.value='';
    campo.className = "campo";
}

