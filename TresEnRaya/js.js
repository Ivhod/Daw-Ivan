$(document).ready(function () {
  var Jugador=0;
  var tablero=[];
  

  $("td").click(function () {
    var imgsrc = $(this).children().attr('src');
    if (imgsrc==null) {
    if(Jugador==0){
      $(this).append("<img src='circulo.png'/>");
      $(this).addClass("circulo");
      Jugador=1;
      $("#turnos").text("Jugador:" + Jugador);
    }else if(Jugador==1){
      $(this).append("<img src='cruz.png'/>");
      $(this).addClass("cruz");
      Jugador=0;
      $("#turnos").text("Jugador:" + Jugador);
    }

  }else{
    alert("No se puede poner aqui");
  }
    
  });
  
  
});
