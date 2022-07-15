
var deportes = ["futbol","baloncesto","tenis","hockey","padel"];
var informatica = ["monitor","teclado","raton","auriculares","telefono"];
var flores = ["rosa","amapola","margarita","petunia","jazmin"];

var palabra=""; //Palabra para averiguar
var letras;
var guionesAux=["_"];

var hueco= document.getElementById("palabra"); //Palabra html
var cont=6; //contador

var ArrayBotones = [];
var botones = document.getElementsByClassName("letra"); // Botones de las letras





// Escoger palabra al azar
function palabraAleatoria(){
    
    var lista=document.getElementById("opciones");
    if(lista.options[lista.selectedIndex].value == "deportes")palabraLista=deportes;
    if(lista.options[lista.selectedIndex].value == "informatica")palabraLista=informatica;
    if(lista.options[lista.selectedIndex].value == "flores")palabraLista=flores;
    
    //console.log(palabraLista);

    palabra= palabraLista[parseInt(Math.random() * 5)];
    console.log(palabra);


}
//pintar los guiones de la palabra
function guiones(){
    var guiones = " ";
    letras = " ";
    letras = palabra.split('');

    for (var i = 0; i < letras.length; i++) {
        guiones = guiones + " _";
        guionesAux[i] = "_";
    }

    document.getElementById("palabra").textContent = guiones;
    
    
}

//Generar botones
 function botonesABC(a,z) {
  document.getElementById("abcdario").innerHTML = "";
  var i = a.charCodeAt(0), j = z.charCodeAt(0);

  for (; i <= j; i++) {
      var letra = String.fromCharCode(i).toLocaleUpperCase();
      document.getElementById("abcdario").innerHTML += "<button value='" + letra + "'onclick='intento(this)' class='hola' id='" + letra + "'>" + letra + "</button>";
      if (i == 110) {
          document.getElementById("abcdario").innerHTML += "<button value='ñ' onclick='intento(\"Ñ\")'class='hola' id='" + letra + "'>Ñ</button>";
      }
      ArrayBotones[i] = document.getElementById(letra);
  }
}

function intento(boton) {
    var valorB = boton.value;
    boton.disabled = true;
    document.getElementById(valorB).style
    valorB = valorB.toLocaleLowerCase();
    
    

    var fallo = true;
    for (var i = 0; i < letras.length; i++) {
        if (valorB == letras[i]) {
            guionesAux[i] = valorB;
            fallo = false;
        }

    }

    //Comprobar fallo
    if (fallo) {
        document.getElementById("intentos").textContent = --cont;
        if (cont <= 0) {
            //document.getElementById("imagen").src = "img/Ahorcado_" + cont + "_Lose.gif";
            document.getElementById("intentos").textContent = cont + "No tienes vidas";
        }
        else {
            //document.getElementById("imagen").src = "img/Ahorcado_" + cont + ".png";
            document.getElementById("intentos").textContent = cont;
            
        }
    }
    //Imprimir palabra
    var solucion = "";
    guionesAux.forEach(space => solucion = solucion + " " + space);
    document.getElementById("palabra").textContent = solucion;

    //Comprobar si perdio o gano
    EndGame();
}
function EndGame() {
    //Comprobar si termino
    var hayGuion = false;
    for (var i = 0; i < guionesAux.length; i++) {
        if (guionesAux[i] == "_") {
            hayGuion = true;
            break;
        }
    }

    if (cont == 0) {
        cambio();
        document.getElementById("fotoPerder").style.display ="inline";
        document.getElementById("Win_Loose").textContent = "Perdiste";
        document.getElementById("Win_Loose").style.display = "inline";     
        

    } else if (!hayGuion) {
        cambio();
        document.getElementById("fotoGanar").style.display ="inline";
        document.getElementById("Win_Loose").textContent = "Ganaste";
        document.getElementById("Win_Loose").style.display = "inline";     
    }

}

function ocultar(){
    document.getElementById("titulo").hidden = true;
    document.getElementById("botonElegir").style.display = "none";
    document.getElementById("opciones").style.display = "none";
    document.getElementById("vidas").hidden = false;
    document.getElementById("intentos").textContent = "" + cont;
    
    
}
function cambio() {
    document.getElementById("abcdario").style.display = "none";
    document.getElementById("vidas").hidden = true;
    document.getElementById("abcdario").hidden = true;
    document.getElementById("palabra").textContent = "La palabra era: " + palabra;
    document.getElementById("botonReiniciar").style.display = "inline";
    
    
}

function reiniciar() {
    location.reload()
    
}



 function inicio() {
    palabraAleatoria();
    guiones();
    botonesABC("a","z");
    ocultar();


    //document.getElementById("intentos").innerHTML=cont;
 }

