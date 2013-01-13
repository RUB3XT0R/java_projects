function validarLogin(){
    var ra = document.forms.principal.ra;
    var raerro = document.forms.principal.raerro;
    var cpf = document.forms.principal.cpf;
    var cpferro = document.forms.principal.cpferro;

    limpa(raerro)
    limpa(cpferro)

    if(ra.value == ""){
        alertando(ra,raerro,'Preencha o campo RA.');
        return;
    }
    if(cpf.value == ""){
        alertando(cpf,cpferro,'Preencha o campo CPF.');
        return;
    }
    if(isNaN(ra.value)){
        alertando(ra,raerro,'RA deve ser número.');
        return;
    }
    if(isNaN(cpf.value)){
        alertando(cpf,cpferro,'CPF deve ser número.');
        return;
    }
    document.forms.principal.submit();
}

function alertando(campo,campoerro,msgerro){
    campoerro.type='text';
    campoerro.value=msgerro;
    campo.focus();
}
function limpa(campoerro){
    campoerro.type='hidden';
    campoerro.value='';
}

function confirmar(){
    var confirma = document.forms.principal.confirma;
    var email = document.forms.principal.email;
    var emailcadastrado = document.forms.principal.emailcadastrado;

    if(confirma.checked){
        email.value = emailcadastrado.value;
        validarEmail();
    }else{
        email.value = ""
    }
}
function validarEmail(){
    var email = document.forms.principal.email;
    var emailErro = document.forms.principal.emailerro;

    if(email.value == ""){
        alertando(email,emailErro,'Preencha Email.');
        return;
    }
    var er = new RegExp(/^[A-Za-z0-9_\-\.]+@[A-Za-z0-9_\-\.]{2,}\.[A-Za-z0-9]{2,}(\.[A-Za-z0-9])?/);
    if (!er.test(email.value)) {
        alertando(email,emailErro,'Email inválido.');
        return;
    }
    if (email.value.length > 45) {
        alertando(email,emailErro,'Email muito grande.');
        return;
    }
    document.forms.principal.submit();
}


