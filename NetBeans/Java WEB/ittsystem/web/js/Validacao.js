/*----------------------------------------------------------------------------
FormataÃ§Ã£o para qualquer mascara
-----------------------------------------------------------------------------*/
function formatar(src, mask){
  var i = src.value.length;
  var saida = mask.substring(0,1);
  var texto = mask.substring(i)
if (texto.substring(0,1) != saida)
  {
    src.value += texto.substring(0,1);
  }
}

/*----Validação de Clientes----*/
function valCliente(){
    var msg = document.forms.novoCli.msg;
    
    var cpf = document.forms.novoCli.cpf; 
    if(cpf.value==""){
        msg.value="O CPF não pode estar em branco.";
        msg.style.color="red";
        cpf.focus();
        return;
    }
    
    var nome = document.forms.novoCli.nome; 
    if(nome.value==""){
        msg.value="O nome não pode estar em branco.";
        msg.style.color="red";
        nome.focus();
        return;
    }
    
    var email = document.forms.novoCli.email;
    if(email.value==""){
        msg.value="O email não pode estar em branco.";
        msg.style.color="red";
        email.focus();
        return;
    }
    
    var tipo = document.forms.novoCli.tipo; 
    if(tipo.value==""){
        msg.value="O tipo não pode estar em branco.";
        msg.style.color="red";
        tipo.focus();
        return;
    }
    
    var uf = document.forms.novoCli.uf;
    if(uf.value==""){
        msg.value="O UF não pode estar em branco.";
        msg.style.color="red";
        uf.focus();
        return;
    }
    
    var rg = document.forms.novoCli.rg; 
    if(rg.value==""){
        msg.value="O RG não pode estar em branco.";
        msg.style.color="red";
        rg.focus();
        return;
    }
    
    var bairro = document.forms.novoCli.bairro;
    if(bairro.value==""){
        msg.value="O bairro não pode estar em branco.";
        msg.style.color="red";
        bairro.focus();
        return;
    }
    
    var endereco = document.forms.novoCli.endereco;
    if(endereco.value==""){
        msg.value="O endereço não pode estar em branco.";
        msg.style.color="red";
        endereco.focus();
        return;
    }
    
    var cidade = document.forms.novoCli.cidade;
    if(cidade.value==""){
        msg.value="A cidade não pode estar em branco.";
        msg.style.color="red";
        cidade.focus();
        return;
    }
    
    var cep = document.forms.novoCli.cep;
    if(cep.value==""){
        msg.value="O CEP não pode estar em branco.";
        msg.style.color="red";
        cep.focus();
        return;
    }
    
    var telR = document.forms.novoCli.telR; 
    var telCo = document.forms.novoCli.telCo;
    var telCe = document.forms.novoCli.telCe;
    if(telR.value=="" && telCo.value=="" && telCe.value==""){
        msg.value="Forneça pelo menos um telefone";
        msg.style.color="red";
        cep.focus();
        return;
    }
    
    document.forms.novoCli.submit();
    
    
    
}
/*-----------------------------*/

/*----Validação de Cursos----*/
function valCurso(){
    var msg = document.forms.novoCur.msg;
    
    var nome = document.forms.novoCur.nome; 
    if(nome.value==""){
        msg.value="O nome não pode estar em branco.";
        msg.style.color="red";
        nome.focus();
        return;
    }
    
    var hora = document.forms.novoCur.hora;
    if(hora.value==""){
        msg.value="A Carga Horária não pode estar em branco.";
        msg.style.color="red";
        hora.focus();
        return;
    }
    if(isNaN(hora.value)){
        msg.value="A Carga Horária deve ser um número.";
        msg.style.color="red";
        hora.focus();
        return;
    }
    
    var inves = document.forms.novoCur.inves; 
    if(inves.value==""){
        msg.value="O investimento não pode estar em branco.";
        msg.style.color="red";
        inves.focus();
        return;
    }
    if(isNaN(inves.value)){
        msg.value="O investimento deve ser um número.";
        msg.style.color="red";
        inves.focus();
        return;
    }
    
    document.forms.novoCur.submit();
    
}
/*-----------------------------*/

/*----Validação de Instrutores----*/
function valInstrutores(){
    var msg = document.forms.novoIns.msg;
       
    var cpf = document.forms.novoIns.cpf;
    if(cpf.value==""){
        msg.value="O CPF não pode estar em branco.";
        msg.style.color="red";
        cpf.focus();
        return;
    }
    var rg = document.forms.novoIns.rg; 
    if(rg.value==""){
        msg.value="O RG não pode estar em branco.";
        msg.style.color="red";
        rg.focus();
        return;
    }
    var nome = document.forms.novoIns.nome; 
    if(nome.value==""){
        msg.value="O nome não pode estar em branco.";
        msg.style.color="red";
        nome.focus();
        return;
    }
    var email = document.forms.novoIns.email;
    if(email.value==""){
        msg.value="O Email não pode estar em branco.";
        msg.style.color="red";
        email.focus();
        return;
    }
       
    var telefone = document.forms.novoIns.telefone; 
    if(telefone.value==""){
        msg.value="O Telefone não pode estar em branco.";
        msg.style.color="red";
        telefone.focus();
        return;
    }
    
    document.forms.novoIns.submit();
    
}
/*-----------------------------*/





