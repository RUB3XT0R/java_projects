
function validar(){
    if(document.forms.principal.nome.value==""){
        alert("Nome não pode ficar em branco.");
        document.forms.formF.nome.focus();
        return;
    }
    if(document.forms.principal.login.value==""){
        alert("Login não pode ficar em branco.");
        document.forms.formF.login.focus();
        return;
    }
    if(document.forms.principal.senha.value==""){
        alert("Senha não pode ficar em branco.");
        document.forms.formF.senha.focus();
        return;
    }
    document.forms.principal.submit();
}