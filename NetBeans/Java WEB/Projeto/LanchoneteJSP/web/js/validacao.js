function valIngredientes(){
    
    var desc = document.forms.novoIngred.descricao;
    var preco = document.forms.novoIngred.preco;
    var tipo = document.forms.novoIngred.tipo;
    var msg = document.forms.novoIngred.msg;
        
        
    if(desc.value == ""){
        msg.value="A descrição não pode estar em branco.";
        msg.style.color="red";
        desc.focus();
        return;
    }
    if(preco.value == ""){
        msg.value="O preço não pode estar em branco.";
        msg.style.color="red";
        preco.focus();
        return;
    }
    if(isNaN(preco.value)){
        msg.value="O preço deve ser um número.";
        msg.style.color="red";
        preco.focus();
        return;
    }
    if(tipo.value == ""){
        msg.value="Escolha um tipo.";
        msg.style.color="red";
        preco.focus();
        return;
    }
    document.forms.novoIngred.submit();
            
}
function valBebidas(){
    
    var desc = document.forms.novaBebi.descricao;
    var msg = document.forms.novaBebi.msg;
        
    if(desc.value == ""){
        msg.value="A descrição não pode estar em branco.";
        msg.style.color="red";
        desc.focus();
        return;
    }
        
    var preco = document.forms.novaBebi.preco;
    if(preco.value == ""){
        msg.value="O preço não pode estar em branco.";
        msg.style.color="red";
        preco.focus();
        return;
    }
    if(isNaN(preco.value)){
        msg.value="O preço deve ser um número.";
        msg.style.color="red";
        preco.focus();
        return;
    }
        
    var qtde = document.forms.novaBebi.qtde;
    if(qtde.value == ""){
        msg.value="A quantidade não pode estar em branco.";
        msg.style.color="red";
        qtde.focus();
        return;
    }
    if(isNaN(qtde.value)){
        msg.value="A quantidade deve ser um número.";
        msg.style.color="red";
        qtde.focus();
        return;
    }
    document.forms.novaBebi.submit();
            
}
function valFuncionarios(){
    var msg = document.forms.novoFunci.msg;
    
    var cpf = document.forms.novoFunci.cpf;
    if(cpf.value=="" || cpf.value.length<14){
        msg.value="O CPF não pode estar vazio ou incompleto";
        msg.style.color="red";
        cpf.focus();
        return;
    }
    var nome = document.forms.novoFunci.nome;
    if(nome.value==""){
        msg.value="O Nome não pode estar vazio";
        msg.style.color="red";
        nome.focus();
        return;
    }
    var email = document.forms.novoFunci.email;
    if(email.value==""){
        msg.value="O E-mail não pode estar vazio";
        msg.style.color="red";
        email.focus();
        return;
    }
    var telefone = document.forms.novoFunci.telefone;
    if(telefone.value=="" || cpf.value.length<9){
        msg.value="O Telefone não pode estar vazio ou incompleto";
        msg.style.color="red";
        telefone.focus();
        return;
    }
    var salario = document.forms.novoFunci.salario;
    if(salario.value==""){
        msg.value="O Salario não pode estar vazio";
        msg.style.color="red";
        salario.focus();
        return;
    }
    var cargo = document.forms.novoFunci.cargo;
    if(cargo.value==""){
        msg.value="O Cargo não pode estar vazio";
        msg.style.color="red";
        cargo.focus();
        return;
    }
    var cidade = document.forms.novoFunci.cidade;
    if(cidade.value==""){
        msg.value="O Cidade não pode estar vazio";
        msg.style.color="red";
        cidade.focus();
        return;
    }
    var uf = document.forms.novoFunci.uf;
    if(uf.value==""){
        msg.value="O UF não pode estar vazio";
        msg.style.color="red";
        uf.focus();
        return;
    }
    var endereco = document.forms.novoFunci.endereco;
    if(endereco.value==""){
        msg.value="O Endereço não pode estar vazio";
        msg.style.color="red";
        endereco.focus();
        return;
    }
    var login = document.forms.novoFunci.login;
    if(login.value!="" && login.value!="null"){
        var senha = document.forms.novoFunci.senha;
        if(senha.value==""){
            msg.value="A senha não pode estar vazio";
            msg.style.color="red";
            senha.focus();
            return;
        }
        var loginADMIN = document.forms.novoFunci.loginADMIN;
        if(loginADMIN.value==""){
            msg.value="O login ADMIN não pode estar vazio";
            msg.style.color="red";
            loginADMIN.focus();
            return;
        }
        var senhaADMIN = document.forms.novoFunci.senhaADMIN;
        if(senhaADMIN.value==""){
            msg.value="A senha ADMIN não pode estar vazio";
            msg.style.color="red";
            senhaADMIN.focus();
            return;
        }
    }
    document.forms.novoFunci.submit();
}
function valCombos(){
    var msg = document.forms.novoCombo.msg;
    
    var descricao = document.forms.novoCombo.nome;
    if(descricao.value==""){
        msg.value="A descri��o n�o pode estar vazia";
        msg.style.color="red";
        descricao.focus();
        return;
    }
    
    var lanche = document.forms.novoCombo.lanche;
    var qtdeLanche = document.forms.novoCombo.qtdeLanche;
    var bebida = document.forms.novoCombo.bebida;
    var qtdeBebida = document.forms.novoCombo.qtdeBebida;
    var acompanhamento = document.forms.novoCombo.acompanhamento;
    var qtdeAcomp = document.forms.novoCombo.qtdeAcomp;
    
    if(lanche.value=="" || bebida.value=="" || acompanhamento.value==""){
        msg.value="Escolha os itens.";
        msg.style.color="red";
        return;
    }
    if(lanche.value!="" && (qtdeLanche.value=="" || qtdeLanche.value==0) ){
        msg.value="A Qtde do Lanche n�o pode estar vazia ou nula ou 1 (um)";
        msg.style.color="red";
        qtdeLanche.focus();
        return;
    }
    if(bebida.value!="" && (qtdeBebida.value=="" || qtdeBebida.value==0) ){
        msg.value="A Qtde da bebida n�o pode estar vazia ou nula ou 1 (um)";
        msg.style.color="red";
        bebida.focus();
        return;
    }
    if(acompanhamento.value!="" && (qtdeAcomp.value=="" || qtdeAcomp.value==0) ){
        msg.value="A Qtde do acompanhamento n�o pode estar vazia ou nula ou 1 (um)";
        msg.style.color="red";
        acompanhamento.focus();
        return;
    }
    
    document.forms.novoCombo.submit();
}



/*----------------------------------------------------------------------------
Formatação para qualquer mascara
-----------------------------------------------------------------------------*/
function formatar(src, mask){
    var i = src.value.length;
    var saida = mask.substring(0,1);
    var texto = mask.substring(i)
    if (texto.substring(0,1) != saida){
        src.value += texto.substring(0,1);
    }
}
