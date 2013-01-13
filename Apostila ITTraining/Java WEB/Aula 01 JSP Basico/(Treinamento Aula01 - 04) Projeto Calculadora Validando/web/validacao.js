function validar(){
   var valor1 = document.forms.principal.valor1;
   var valor2 = document.forms.principal.valor2;
   
   if(valor1.value==""){
      alert("Entre com o primeiro valor.");
      valor1.focus();
      return;
   }
   if(valor2.value==""){
      alert("entre com o segundo valor.");
      valor2.focus();
      return;
   }
   if(isNaN(valor1.value)){
      alert("O 1º número deve ser um número.");
      valor1.focus();
      return;
   }
   if(isNaN(valor2.value)){
      alert("O 2º número deve ser um número.");
      valor2.focus();
      return;
   }
   if(document.forms.principal.operacao.value=="Divisao"
   && valor2.value==0){
      alert("O segundo valor não pode ser zero.");
      valor2.focus();
      return;
   }
   document.forms.principal.submit();

}


