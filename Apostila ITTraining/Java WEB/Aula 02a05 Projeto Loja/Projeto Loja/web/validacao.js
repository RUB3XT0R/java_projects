function validarProduto(){
   var nome = document.forms.produto.nome;
   if(nome.value==""){
      alert("Nome n�o pode estar em branco!");
      nome.focus();
   }
   var valor = document.forms.produto.valor;
   if(valor.value==""){
      alert("O valor n�o pode estar em branco!");
      valor.focus();
   }
   
   if(isNaN(valor.value)){
      alert("O valor deve ser um n�mero!");
      valor.focus();
   }
   document.forms.produto.submit();
}
function validarCliente(){
   var cpf = document.forms.cliente.cpf;
   if(cpf.value==""){
      alert("CPF n�o pode estar em branco!");
      cpf.focus();
   }
   var nome = document.forms.cliente.nome;
   if(nome.value==""){
      alert("Nome n�o pode estar em branco!");
      nome.focus();
   }
   var telefone = document.forms.cliente.telefone;
   if(telefone.value==""){
      alert("Telefone n�o pode estar em branco!");
      telefone.focus();
   }
   var endereco = document.forms.cliente.endereco;
   if(endereco.value==""){
      alert("Telefone n�o pode estar em branco!");
      endereco.focus();
   }
   document.forms.cliente.submit();
}


